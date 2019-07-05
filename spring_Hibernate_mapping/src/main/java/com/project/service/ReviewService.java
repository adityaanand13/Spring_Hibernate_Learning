package com.project.service;

import com.project.config.HibernateUtil;
import com.project.entity.Course;
import com.project.entity.Review;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ReviewService {
    public Review create(String comment, Course course){

        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Review review = null;

        try {
            // create the object
            review = new Review(comment);

            // associate the related objects
            course.addReview(review);

            // start a transaction
            transaction = session.beginTransaction();

            // save the session
            session.save(course);

            // commit the transaction
            transaction.commit();

        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return review;
    }

    public Review deleteById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Review review = null;

        try {
            // start a transaction
            transaction = session.beginTransaction();

            // get the object
            review = session.get(Review.class, id);

            // remove the session if exists in record
            if (review != null)
                session.delete(review);
            else
                System.out.println("Review with id: "+id+" not found");

            // commit the transaction
            transaction.commit();

        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return review;
    }

    public Review getById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Review review = null;
        try {
            //start the transaction
            transaction = session.beginTransaction();
            //get the object from session
            review = session.get(Review.class, id);
            //commit transaction
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            //close the session
            session.close();
        }
        return review;
    }

    public void printById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Review review = null;
        try {
            //start the transaction
            transaction = session.beginTransaction();
            //get the object from session
            review = session.get(Review.class, id);
            System.out.println(review);
            //commit transaction
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            //close the session
            session.close();
        }
    }
}

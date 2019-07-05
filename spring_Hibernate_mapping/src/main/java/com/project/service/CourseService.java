package com.project.service;

import com.project.config.HibernateUtil;
import com.project.entity.Course;
import com.project.entity.Instructor;
import com.project.entity.Review;
import com.project.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CourseService {

    public Course create(String title, Instructor instructor){

        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Course course = null;

        try {
            // create the object
            course = new Course(title, instructor);

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
        return course;
    }

    public Course deleteById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Course course = null;

        try {
            // start a transaction
            transaction = session.beginTransaction();

            // get the object
            course = session.get(Course.class, id);

            // remove the session if exists in record
            if (course != null)
                session.delete(course);
            else
                System.out.println("Course with id: "+id+" not found");

            // commit the transaction
            transaction.commit();

        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return course;
    }

    public Course getById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Course course = null;
        try {
            //start the transaction
            transaction = session.beginTransaction();
            //get the object from session
            course = session.get(Course.class, id);
            //commit transaction
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            //close the session
            session.close();
        }
        return course;
    }

    public void printById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Course course = null;
        try {
            //start the transaction
            transaction = session.beginTransaction();
            //get the object from session
            course = session.get(Course.class, id);
            System.out.println(course);
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

    public Course getWithReviews(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Course course = null;
        try {
            //start the transaction
            transaction = session.beginTransaction();
            // load course from db
            Query<Course> query = session.createQuery(
                    "select c from Course c " +
                            "JOIN FETCH c.reviews " +
                            "WHERE c.id="+id,//add parameter in query
                    Course.class
            );
            //execute query and get instructor
            course = query.getSingleResult();

            if (course==null)
                System.out.println("Course with id: "+id+" not found");
            //commit transaction
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            //close the session
            session.close();
        }
        return course;
    }

    public Course addReview(int id, String reviewComment){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Course course = null;
        try {
            // start the transaction
            transaction = session.beginTransaction();
            // get the course by id
            course = session.get(Course.class, id);

            // update the session if exists in record
            if (course != null){
                //create new review
                Review review = new Review(reviewComment);
                course.addReview(review);
                //save the review
                session.save(review);
            }
            else
                System.out.println("Instructor with id: "+id+" not found");

            //commit transaction
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            //close the session
            session.close();
        }
        return course;
    }

    public Course addStudent(int id, Student student){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Course course = null;
        try {
            // start the transaction
            transaction = session.beginTransaction();
            // get the course by id
            course = session.get(Course.class, id);

            // update the session if exists in record
            if (course != null){
                course.addStudent(student);
                //save the review
                session.save(student);
            }
            else
                System.out.println("Instructor with id: "+id+" not found");

            //commit transaction
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            //close the session
            session.close();
        }
        return course;
    }
}

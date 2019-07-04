package com.project.service;

import com.project.config.HibernateUtil;
import com.project.entity.Course;
import com.project.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
}

package com.project.service;

import com.project.config.HibernateUtil;
import com.project.entity.Course;
import com.project.entity.Instructor;
import com.project.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InstructorService {

    public Instructor create(String firstName, String lastName, String email, String youtubeChannel, String hobby){

        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Instructor instructor = null;

        try {
            // create the object
            instructor = new Instructor(firstName, lastName, email);
            InstructorDetail instructorDetail = new InstructorDetail(youtubeChannel, hobby);

            // associate the related objects
            instructor.setInstructorDetail(instructorDetail);

            // start a transaction
            transaction = session.beginTransaction();

            // save the session
            session.save(instructor);

            // commit the transaction
            transaction.commit();

        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return instructor;
    }

    public Instructor deleteById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Instructor instructor = null;

        try {
            // start a transaction
            transaction = session.beginTransaction();

            // get the object
            instructor = session.get(Instructor.class, id);

            // remove the session if exists in record
            if (instructor != null)
                session.delete(instructor);
            else
                System.out.println("Instructor with id: "+id+" not found");

            // commit the transaction
            transaction.commit();

        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return instructor;
    }

    public Instructor getById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Instructor instructor = null;
        try {
            //start the transaction
            transaction = session.beginTransaction();
            //get the object from session
            instructor = session.get(Instructor.class, id);
            //commit transaction
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            //close the session
            session.close();
        }
        return instructor;
    }

    public void printById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Instructor instructor = null;
        try {
            //start the transaction
            transaction = session.beginTransaction();
            //get the object from session
            instructor = session.get(Instructor.class, id);
            System.out.println(instructor);
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

    public Instructor addCourse(int id, String courseTitle){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Instructor instructor = null;
        try {
            // start the transaction
            transaction = session.beginTransaction();
            // get the instructor by id
            instructor = session.get(Instructor.class, id);

            // update the session if exists in record
            if (instructor != null){
                //create new course
                Course course = new Course(courseTitle);
                instructor.addCourse(course);
                //save the course
                session.save(course);
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
        return instructor;
    }
}

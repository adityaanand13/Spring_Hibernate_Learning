package com.project.service;

import com.project.config.HibernateUtil;
import com.project.entity.Instructor;
import com.project.entity.InstructorDetail;
import com.project.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentService {
    public Student create(String firstName, String lastName, String email){

        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Student student = null;

        try {
            // create the object
            student = new Student(firstName, lastName, email);

            // start a transaction
            transaction = session.beginTransaction();

            // save the session
            session.save(student);

            // commit the transaction
            transaction.commit();

        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return student;
    }

    public Student deleteById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        Student student = null;

        try {
            // start a transaction
            transaction = session.beginTransaction();

            // get the object
            student = session.get(Student.class, id);

            // remove the session if exists in record
            if (student != null)
                session.delete(student);
            else
                System.out.println("Student with id: "+id+" not found");

            // commit the transaction
            transaction.commit();

        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return student;
    }
}

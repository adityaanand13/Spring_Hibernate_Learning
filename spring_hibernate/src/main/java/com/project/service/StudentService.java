package com.project.service;

import com.project.config.HibernateUtil;
import com.project.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentService {
    private Session session;

    public void createStudent(String firstName, String lastName, String email){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        try{
            //start a transaction
            transaction = session.beginTransaction();
            //save the data object
            session.save(new Student(firstName, lastName, email));
            //commit the transaction
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public Student getById(int id){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Student student = null;
        Transaction transaction = null;
        try{
            //start a transaction
            transaction = session.beginTransaction();
            //get the data object
            student = session.get(Student.class, id);
            //commit the transaction
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return student;
    }

    public Student deleteStudent(int id){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Student student = null;
        Transaction transaction = null;
        try{
            //start a transaction
            transaction = session.beginTransaction();
            //get the data object
            student = session.get(Student.class, id);
            //delete the data
            session.delete(student);
            //commit the transaction
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return student;
    }

    public Student updateFirstName(int id, String firstName){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Student student = null;
        Transaction transaction = null;
        try{
            //start a transaction
            transaction = session.beginTransaction();
            //get the data object
            student = session.get(Student.class, id);
            //update the data object
            student.setFirstName(firstName);
            //commit the transaction
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return student;
    }

    public List< Student > getStudents() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        final List<Student> from_student = session.createQuery("from Student", Student.class).getResultList();
        session.close();
        return from_student;
    }
}

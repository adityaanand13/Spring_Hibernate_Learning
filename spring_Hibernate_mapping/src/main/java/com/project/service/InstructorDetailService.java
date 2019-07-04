package com.project.service;

import com.project.config.HibernateUtil;
import com.project.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InstructorDetailService {
    public InstructorDetail getById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        InstructorDetail instructorDetail = null;
        try {
            //start the transaction
            transaction = session.beginTransaction();
            //get the object from session
            instructorDetail = session.get(InstructorDetail.class, id);
            //commit transaction
            transaction.commit();
        }catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            //close the session
            session.close();
        }
        return instructorDetail;
    }

    public InstructorDetail deleteById(int id){
        // get the session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        InstructorDetail instructorDetail = null;

        try {
            // start a transaction
            transaction = session.beginTransaction();

            // get the object
            instructorDetail = session.get(InstructorDetail.class, id);

            // remove the session
            session.remove(instructorDetail);

            // commit the transaction
            transaction.commit();

        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return instructorDetail;
    }
}

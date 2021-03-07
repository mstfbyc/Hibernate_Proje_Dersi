package com.bilgeadam.hibernate;

import com.bilgeadam.entity.Departments;
import com.bilgeadam.entity.Employees;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try{
            Configuration cfg = new Configuration();

            cfg.addAnnotatedClass(Employees.class);
            cfg.addAnnotatedClass(Departments.class);
            SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
            return sessionFactory;
        }catch (Exception e){
            System.out.println("Session Factory oluşturulurken hata oluştu.");
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }


}

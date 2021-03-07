package com.bilgeadam.dao;

import com.bilgeadam.entity.Departments;
import com.bilgeadam.entity.Employees;
import com.bilgeadam.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.persistence.Parameter;
import javax.persistence.TemporalType;
import javax.persistence.criteria.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeesDao {
    private SessionFactory sessionFactory;

    public EmployeesDao() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Employees> findAll(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT employees FROM Employees  employees");
        return query.list();
    }
    public List<Employees> findAllWithCriteria(){
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employees> query = criteriaBuilder.createQuery(Employees.class);
        query.from(Employees.class);
        return session.createQuery(query).getResultList();
    }

    public Employees findById(Long id){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT employees FROM Employees  employees WHERE id = :id");
        query.setParameter("id",id);
        return (Employees) query.uniqueResult();
    }
    public Employees findByIdWithCriteria(Long id){
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employees> query = criteriaBuilder.createQuery(Employees.class);
        Root<Employees> root = query.from(Employees.class);
        query.select(root).where(
                criteriaBuilder.equal(root.get("employeeId"),id)
        );
        return session.createQuery(query).uniqueResult();
    }

    public List<Employees> findAllMinSalaryRange(Double minSlary, Double maxSalary){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT employees FROM Employees  employees where salary between :minSalary and :maxSalary");
        query.setParameter("minSalary",minSlary);
        query.setParameter("maxSalary",maxSalary);
        return query.list();
    }

    public List<Employees> findAllMinSalaryRangeWhithCriteria(Double minSlary, Double maxSalary){
        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employees> query = criteriaBuilder.createQuery(Employees.class);
        Root<Employees> root = query.from(Employees.class);
        query.select(root).where(
                criteriaBuilder.between(root.get("salary"),minSlary,maxSalary)
        );

        return session.createQuery(query).list();
    }

    public List<Employees> findAllOrder(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT employees FROM Employees  employees order by firstName,lastName");
        return query.list();
    }

    public List<Employees> findAllOrderWithCriteria(){
        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employees> query = criteriaBuilder.createQuery(Employees.class);
        Root<Employees> root = query.from(Employees.class);
        query.select(root);
        //query.orderBy(criteriaBuilder.asc(root.get("firstName")));
/*        Order firstName = criteriaBuilder.asc(root.get("firstName"));
        Order lastName = criteriaBuilder.asc(root.get("lastName"));
        query.orderBy(firstName,lastName);*/

        List<Order> orderList = new ArrayList<>();
        orderList.add(criteriaBuilder.asc(root.get("firstName")));
        orderList.add(criteriaBuilder.asc(root.get("lastName")));
        query.orderBy(orderList);

        return session.createQuery(query).list();
    }

    public List<Employees> findAllOrderByLimit(int maxResult){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT employees FROM Employees  employees order by firstName,lastName");
        query.setMaxResults(maxResult);
        return query.list();
    }

    public List<Employees> findAllOrderByLimitWithCriteria(int maxResult){
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employees> query = criteriaBuilder.createQuery(Employees.class);
        Root<Employees> root = query.from(Employees.class);
        query.select(root);
        List<Order> orderList = new ArrayList<>();
        orderList.add(criteriaBuilder.asc(root.get("firstName")));
        orderList.add(criteriaBuilder.asc(root.get("lastName")));
        query.orderBy(orderList);
        return session.createQuery(query).setMaxResults(maxResult).list();
    }

    public List<Employees> findAllByBiggerThanHireDate(Timestamp hireDate){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT employees FROM Employees  employees where hireDate >= :hireDate");
        query.setParameter("hireDate",hireDate);
        return query.list();
    }


    public List<Employees> findAllWithDepertmants(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT employees " +
                "FROM Employees  employees, Departments  departments " +
                "where employees.departmentId = departments.departmentId ");
        return query.list();
    }

    public List<Employees> findAllWithDepertmantsWithCriteria(){
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employees> query = criteriaBuilder.createQuery(Employees.class);
        Root<Employees> root = query.from(Employees.class);
        root.join("departments",JoinType.INNER);
        query.select(root);


        return session.createQuery(query).list();
    }




}

package com.panhacode.hibernateintegretion.dao;

import com.panhacode.hibernateintegretion.entity.Person;
import com.panhacode.hibernateintegretion.util.DaoService;
import com.panhacode.hibernateintegretion.util.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;

import java.util.List;

public class PersonDaoImpl implements DaoService<Person> {
    @Override
    public int addData(Person object) {
        return 0;
    }

    @Override
    public int deleteData(Person object) {
        return 0;
    }

    @Override
    public int updateData(Person object) {
        return 0;
    }

    @Override
    public List<Person> fetchAll() {
        Session session = HibernateUtil.getSessionFactory().openSession(); // error here
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Person> criteriaQuery = criteriaBuilder.createQuery(Person.class);
        criteriaQuery.from(Person.class);
        List<Person> personList = session.createQuery(criteriaQuery).getResultList();
        session.close();

        return personList;
    }
}

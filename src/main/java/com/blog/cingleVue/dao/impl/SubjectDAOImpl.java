package com.blog.cingleVue.dao.impl;

import com.blog.cingleVue.dao.SubjectDAO;
import com.blog.cingleVue.entity.SubjectEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class SubjectDAOImpl implements SubjectDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<SubjectEntity> getAllSubjects() throws PersistenceException {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(SubjectEntity.class);
        return criteria.list();
    }
}

package com.blog.cingleVue.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface AbstractDao<T, I extends Serializable> {

    T findById(I id);
    void saveOrUpdate(T e);
    void delete(T e);
    List<T> findByCriteria(Criterion criterion);
}

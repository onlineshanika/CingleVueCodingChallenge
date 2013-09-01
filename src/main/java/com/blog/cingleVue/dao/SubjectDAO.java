package com.blog.cingleVue.dao;

import com.blog.cingleVue.entity.SubjectEntity;

import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SubjectDAO {

    public List<SubjectEntity> getAllSubjects() throws PersistenceException;
}

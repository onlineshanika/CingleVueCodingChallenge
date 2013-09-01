package com.blog.cingleVue.dao;

import com.blog.cingleVue.entity.custom.SubjectResultsBySchoolDTO;

import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 8:52 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SearchResultsDao {

    public List<SubjectResultsBySchoolDTO> findSchoolResultsBySubject(Integer subjectId) throws PersistenceException;

    public List<SubjectResultsBySchoolDTO> findSchoolResultsByStudent(String studentName) throws PersistenceException;
}

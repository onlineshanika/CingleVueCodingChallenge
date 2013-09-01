package com.blog.cingleVue.service;

import com.blog.cingleVue.entity.custom.SubjectResultsBySchoolDTO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface  ResultsViewService {

    public List<SubjectResultsBySchoolDTO> findSchoolResultsBySubject(Integer subjectId) throws Exception;

    public List<SubjectResultsBySchoolDTO> findSchoolResultsByStudent(String studentName)throws Exception;
}

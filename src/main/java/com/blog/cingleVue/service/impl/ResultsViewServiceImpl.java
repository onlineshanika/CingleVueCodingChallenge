package com.blog.cingleVue.service.impl;

import com.blog.cingleVue.dao.SearchResultsDao;
import com.blog.cingleVue.entity.custom.SubjectResultsBySchoolDTO;
import com.blog.cingleVue.service.ResultsViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Service("resultsViewService")
@Transactional(readOnly = true)
public class ResultsViewServiceImpl implements ResultsViewService {

    @Autowired
    SearchResultsDao searchResultsDao;

    @Override
    public List<SubjectResultsBySchoolDTO> findSchoolResultsBySubject(Integer subjectId) throws Exception {
        return searchResultsDao.findSchoolResultsBySubject(subjectId);
    }

    @Override
    public List<SubjectResultsBySchoolDTO> findSchoolResultsByStudent(String studentName) throws Exception {
        return searchResultsDao.findSchoolResultsByStudent(studentName);
    }
}

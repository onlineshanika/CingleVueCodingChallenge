package com.blog.cingleVue.service.impl;

import com.blog.cingleVue.dao.SubjectDAO;
import com.blog.cingleVue.dao.UtilityDAO;
import com.blog.cingleVue.entity.SubjectEntity;
import com.blog.cingleVue.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Shanika Jayasekara
 * Date: 7/13/13
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */

@Service("utilityService")
@Transactional(readOnly = true)
public class UtilityServiceImpl  implements UtilityService {

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    public List<SubjectEntity> getAllSubjects() throws Exception {
       return subjectDAO.getAllSubjects();
    }
}

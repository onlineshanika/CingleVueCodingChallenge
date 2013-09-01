package com.blog.cingleVue.controller;

import com.blog.cingleVue.entity.SubjectEntity;
import com.blog.cingleVue.entity.custom.SubjectResultsBySchoolDTO;
import com.blog.cingleVue.service.ResultsViewService;
import com.blog.cingleVue.service.UtilityService;
import com.blog.cingleVue.util.StringUtil;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller

@RequestMapping("/viewResults")
public class ResultsViewController {

    @Autowired
    ResultsViewService resultsViewService;
    @Autowired
    UtilityService utilityService;

    @RequestMapping(value = "/loadSchoolResultsBySubject", method = {RequestMethod.GET, RequestMethod.POST})
    public
    @ResponseBody
    String loadSchoolResultsBySubject(HttpServletRequest request, HttpServletResponse response) {
        JSONObject returnObject = null;
        try {
            if (StringUtil.isNotEmpty(request.getParameter("subjectId"))) {
                List<SubjectResultsBySchoolDTO>  results = resultsViewService.findSchoolResultsBySubject(new Integer(request.getParameter("subjectId")));
                returnObject = new JSONObject();
                JSONArray data = new JSONArray();
                if(results != null && !results.isEmpty()){
                    for (SubjectResultsBySchoolDTO entity : results) {
                        JSONObject obj = new JSONObject();
                        obj.put("Y3", entity.getY3());
                        obj.put("Y5", entity.getY5());
                        obj.put("Y7", entity.getY7());
                        obj.put("Y9", entity.getY9());
                        obj.put("SchoolName", entity.getSchoolName());
                        data.put(obj);
                    }
                }

                returnObject.put("data", data);
            } else {
                returnObject = new JSONObject();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject.toString();
    }


    @RequestMapping(value = "/loadSubjects", method = {RequestMethod.GET, RequestMethod.POST})
    public
    @ResponseBody
    String loadSubjects(HttpServletRequest request, HttpServletResponse response) {
        JSONObject returnObject = null;
        try {
            returnObject = new JSONObject();
            JSONArray subjects = new JSONArray();

            List<SubjectEntity> subjectList = utilityService.getAllSubjects();
            if (subjectList != null && !subjectList.isEmpty()) {
                for (SubjectEntity entity : subjectList) {
                    JSONObject subject = new JSONObject();
                    subject.put("text", entity.getSubjectName());
                    subject.put("value", entity.getIdsubject());
                    subjects.put(subject);
                }
            }
            returnObject.put("data", subjects);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject.toString();
    }



    @RequestMapping(value = "/loadSchoolDataByStudent", method = {RequestMethod.GET, RequestMethod.POST})
    public
    @ResponseBody
    String loadSchoolDataByStudent(HttpServletRequest request, HttpServletResponse response) {
        JSONObject returnObject = null;
        try {
            if (StringUtil.isNotEmpty(request.getParameter("studentName"))) {
                List<SubjectResultsBySchoolDTO>  results = resultsViewService.findSchoolResultsByStudent(request.getParameter("studentName").trim());
                returnObject = new JSONObject();
                JSONArray data = new JSONArray();
                if(results != null && !results.isEmpty()){
                    for (SubjectResultsBySchoolDTO entity : results) {
                        JSONObject obj = new JSONObject();
                        obj.put("Y3", entity.getY3());
                        obj.put("Y5", entity.getY5());
                        obj.put("Y7", entity.getY7());
                        obj.put("Y9", entity.getY9());
                        obj.put("SchoolName", entity.getSchoolName());
                        data.put(obj);
                    }
                }

                returnObject.put("data", data);
            } else {
                returnObject = new JSONObject();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject.toString();
    }



}

package main.java.com.blog.cinglevue.service;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */

import com.blog.cingleVue.entity.custom.SubjectResultsBySchoolDTO;
import com.blog.cingleVue.service.ResultsViewService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:spring/hibernateContext.xml"})
public class ResultsViewServiceTest {

    @Autowired
    ResultsViewService resultsViewService;

    @Test
    public void findSchoolResultsBySubjectTest() {

        try {
            List<SubjectResultsBySchoolDTO> results = resultsViewService.findSchoolResultsBySubject(new Integer(1));

            System.out.print(results.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void findSchoolResultsByStudentTest() {

        try {
            List<SubjectResultsBySchoolDTO> results = resultsViewService.findSchoolResultsByStudent("r");

            System.out.print(results.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

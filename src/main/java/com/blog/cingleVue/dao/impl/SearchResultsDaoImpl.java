package com.blog.cingleVue.dao.impl;

import com.blog.cingleVue.dao.SearchResultsDao;
import com.blog.cingleVue.entity.custom.SubjectResultsBySchoolDTO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 8:52 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class SearchResultsDaoImpl implements SearchResultsDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<SubjectResultsBySchoolDTO> findSchoolResultsBySubject(Integer subjectId) throws PersistenceException {
        try {

            String hql = String.format(" Select sch.idschool ,sch.schoolname as schoolName ,  " +
                    " CASE ye.yearfield WHEN 2003 THEN avg(marks) ELSE 0 END as  Y3, " +
                    " CASE ye.yearfield WHEN 2005 THEN avg(marks) ELSE 0 END as  Y5 ,  " +
                    " CASE ye.yearfield WHEN 2007 THEN avg(marks) ELSE 0 END as  Y7 ,  " +
                    " CASE ye.yearfield WHEN 2009 THEN avg(marks) ELSE 0 END as  Y9  " +
                    " From  School sch,  Student stu,  studentSubject stusub,  year_ ye   " +
                    " Where stusub.idsubject =:idsubject  and stusub.idStudent = stu.idStudent  " +
                    " and stu.idschool = sch.idschool  and ye.idyear=stusub.idyear  " +
                    " group by sch.idschool  ");

            Query query = getCurrentSession().createSQLQuery(hql)
                    .addScalar("idschool", StringType.INSTANCE)
                    .addScalar("schoolName", StringType.INSTANCE)
                    .addScalar("Y3", StringType.INSTANCE)
                    .addScalar("Y5", StringType.INSTANCE)
                    .addScalar("Y7", StringType.INSTANCE)
                    .addScalar("Y9", StringType.INSTANCE);

            query.setParameter("idsubject", subjectId);

            query.setResultTransformer(Transformers.aliasToBean(SubjectResultsBySchoolDTO.class));

            List results = query.list();

            return results;

        } catch (PersistenceException pex) {

        }

        return null;
    }

    public List<SubjectResultsBySchoolDTO> findSchoolResultsByStudent(String studentName)  throws PersistenceException {
        try {

            String hql = String.format(" Select sch.idschool ,sch.schoolname as schoolName ,  " +
                    " CASE ye.yearfield WHEN 2003 THEN avg(marks) ELSE 0 END as  Y3, " +
                    " CASE ye.yearfield WHEN 2005 THEN avg(marks) ELSE 0 END as  Y5 ,  " +
                    " CASE ye.yearfield WHEN 2007 THEN avg(marks) ELSE 0 END as  Y7 ,  " +
                    " CASE ye.yearfield WHEN 2009 THEN avg(marks) ELSE 0 END as  Y9  " +
                    " From  School sch,  Student stu,  studentSubject stusub,  year_ ye   " +
                    " Where lower(stu.studentname) LIKE lower(:studentname) and stusub.idStudent = stu.idStudent  " +
                    " and stu.idschool = sch.idschool  and ye.idyear=stusub.idyear  " +
                    " group by sch.idschool  ");

            Query query = getCurrentSession().createSQLQuery(hql)
                    .addScalar("idschool", StringType.INSTANCE)
                    .addScalar("schoolName", StringType.INSTANCE)
                    .addScalar("Y3", StringType.INSTANCE)
                    .addScalar("Y5", StringType.INSTANCE)
                    .addScalar("Y7", StringType.INSTANCE)
                    .addScalar("Y9", StringType.INSTANCE);

            query.setParameter("studentname", "%"+studentName+"%");

            query.setResultTransformer(Transformers.aliasToBean(SubjectResultsBySchoolDTO.class));

            List results = query.list();

            return results;

        } catch (PersistenceException pex) {

        }

        return null;
    }
}

package com.blog.cingleVue.entity;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class YearEntity {
    private int idyear;

    public int getIdyear() {
        return idyear;
    }

    public void setIdyear(int idyear) {
        this.idyear = idyear;
    }

    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YearEntity that = (YearEntity) o;

        if (idyear != that.idyear) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idyear;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

    private Collection<StudentSubjectEntity> studentsubjectsByIdyear;

    public Collection<StudentSubjectEntity> getStudentsubjectsByIdyear() {
        return studentsubjectsByIdyear;
    }

    public void setStudentsubjectsByIdyear(Collection<StudentSubjectEntity> studentsubjectsByIdyear) {
        this.studentsubjectsByIdyear = studentsubjectsByIdyear;
    }
}

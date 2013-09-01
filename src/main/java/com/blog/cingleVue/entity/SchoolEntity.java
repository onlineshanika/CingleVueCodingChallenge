package com.blog.cingleVue.entity;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class SchoolEntity {
    private int idschool;

    public int getIdschool() {
        return idschool;
    }

    public void setIdschool(int idschool) {
        this.idschool = idschool;
    }

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchoolEntity that = (SchoolEntity) o;

        if (idschool != that.idschool) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idschool;
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        return result;
    }

    private String schoolname;

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    private Collection<com.blog.cingleVue.entity.StudentEntity> studentsByIdschool;

    public Collection<com.blog.cingleVue.entity.StudentEntity> getStudentsByIdschool() {
        return studentsByIdschool;
    }

    public void setStudentsByIdschool(Collection<com.blog.cingleVue.entity.StudentEntity> studentsByIdschool) {
        this.studentsByIdschool = studentsByIdschool;
    }
}

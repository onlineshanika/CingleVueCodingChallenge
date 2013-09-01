package com.blog.cingleVue.entity;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentEntity {
    private int idStudent;

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String idSchool;

    public String getIdSchool() {
        return idSchool;
    }

    public void setIdSchool(String idSchool) {
        this.idSchool = idSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (idStudent != that.idStudent) return false;
        if (idSchool != null ? !idSchool.equals(that.idSchool) : that.idSchool != null) return false;
        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStudent;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (idSchool != null ? idSchool.hashCode() : 0);
        return result;
    }

    private int idstudent;

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    private String studentname;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    private com.blog.cingleVue.entity.SchoolEntity schoolByIdschool;

    public com.blog.cingleVue.entity.SchoolEntity getSchoolByIdschool() {
        return schoolByIdschool;
    }

    public void setSchoolByIdschool(com.blog.cingleVue.entity.SchoolEntity schoolByIdschool) {
        this.schoolByIdschool = schoolByIdschool;
    }

    private Collection<StudentSubjectEntity> studentsubjectsByIdstudent;

    public Collection<StudentSubjectEntity> getStudentsubjectsByIdstudent() {
        return studentsubjectsByIdstudent;
    }

    public void setStudentsubjectsByIdstudent(Collection<StudentSubjectEntity> studentsubjectsByIdstudent) {
        this.studentsubjectsByIdstudent = studentsubjectsByIdstudent;
    }
}

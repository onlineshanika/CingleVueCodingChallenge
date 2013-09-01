package com.blog.cingleVue.entity;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentSubjectEntity {
    private int idstudentSubject;

    public int getIdstudentSubject() {
        return idstudentSubject;
    }

    public void setIdstudentSubject(int idstudentSubject) {
        this.idstudentSubject = idstudentSubject;
    }

    private int studentid;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    private int subjectid;

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentSubjectEntity that = (StudentSubjectEntity) o;

        if (idstudentSubject != that.idstudentSubject) return false;
        if (studentid != that.studentid) return false;
        if (subjectid != that.subjectid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idstudentSubject;
        result = 31 * result + studentid;
        result = 31 * result + subjectid;
        return result;
    }

    private int idstudentsubject;

    public int getIdstudentsubject() {
        return idstudentsubject;
    }

    public void setIdstudentsubject(int idstudentsubject) {
        this.idstudentsubject = idstudentsubject;
    }

    private double marks;

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    private com.blog.cingleVue.entity.StudentEntity studentByIdStudent;

    public com.blog.cingleVue.entity.StudentEntity getStudentByIdStudent() {
        return studentByIdStudent;
    }

    public void setStudentByIdStudent(com.blog.cingleVue.entity.StudentEntity studentByIdStudent) {
        this.studentByIdStudent = studentByIdStudent;
    }

    private com.blog.cingleVue.entity.SubjectEntity subjectByIdSubject;

    public com.blog.cingleVue.entity.SubjectEntity getSubjectByIdSubject() {
        return subjectByIdSubject;
    }

    public void setSubjectByIdSubject(com.blog.cingleVue.entity.SubjectEntity subjectByIdSubject) {
        this.subjectByIdSubject = subjectByIdSubject;
    }

    private YearEntity yearByIdyear;

    public YearEntity getYearByIdyear() {
        return yearByIdyear;
    }

    public void setYearByIdyear(YearEntity yearByIdyear) {
        this.yearByIdyear = yearByIdyear;
    }
}

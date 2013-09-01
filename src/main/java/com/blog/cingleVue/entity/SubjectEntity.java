package com.blog.cingleVue.entity;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubjectEntity {
    private int idSubject;

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectEntity that = (SubjectEntity) o;

        if (idSubject != that.idSubject) return false;
        if (subjectName != null ? !subjectName.equals(that.subjectName) : that.subjectName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSubject;
        result = 31 * result + (subjectName != null ? subjectName.hashCode() : 0);
        return result;
    }

    private int idsubject;

    public int getIdsubject() {
        return idsubject;
    }

    public void setIdsubject(int idsubject) {
        this.idsubject = idsubject;
    }

    private Collection<StudentSubjectEntity> studentsubjectsByIdsubject;

    public Collection<StudentSubjectEntity> getStudentsubjectsByIdsubject() {
        return studentsubjectsByIdsubject;
    }

    public void setStudentsubjectsByIdsubject(Collection<StudentSubjectEntity> studentsubjectsByIdsubject) {
        this.studentsubjectsByIdsubject = studentsubjectsByIdsubject;
    }
}

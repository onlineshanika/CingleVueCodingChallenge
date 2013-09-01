package com.blog.cingleVue.entity.custom;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubjectResultsBySchoolDTO implements Serializable {

    private String Y3 ;
    private String Y5 ;
    private String Y7 ;
    private String Y9 ;
    private String schoolName ;
    private String idschool ;


    public String getY3() {
        return Y3;
    }

    public void setY3(String y3) {
        Y3 = y3;
    }

    public String getY5() {
        return Y5;
    }

    public void setY5(String y5) {
        Y5 = y5;
    }

    public String getY7() {
        return Y7;
    }

    public void setY7(String y7) {
        Y7 = y7;
    }

    public String getY9() {
        return Y9;
    }

    public void setY9(String y9) {
        Y9 = y9;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getIdschool() {
        return idschool;
    }

    public void setIdschool(String idschool) {
        this.idschool = idschool;
    }
}

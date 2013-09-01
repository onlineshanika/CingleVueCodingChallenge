package com.blog.cingleVue.util;


/**
 * Created with IntelliJ IDEA.
 * User: Shanika Jayasekara
 * Date: 7/13/13
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringUtil {



    public static boolean isNotEmpty(String value) {
        return (value != null && !value.isEmpty());
    }

    public static boolean isNotEmpty(Object value) {
        return (value != null);
    }
}

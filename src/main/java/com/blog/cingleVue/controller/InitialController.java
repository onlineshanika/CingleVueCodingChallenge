package com.blog.cingleVue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: shanika
 * Date: 9/1/13
 * Time: 7:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class InitialController {

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String showUserForm(HttpServletRequest request, HttpServletResponse response) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }
}

package com.complaintsms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeViewController {


    @RequestMapping("/employeeview")
    public ModelAndView welcome() {

        return new ModelAndView("employeeview");
    }

}
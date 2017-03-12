package com.complaintsms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.complaintsms.model.Complaint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;


@Controller
@RequestMapping("/complaints")
public class LogComplaintController {


    private final static Logger logger = LoggerFactory.getLogger(LogComplaintController.class);

    private JdbcTemplate jdbcTemplate;

    public LogComplaintController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/complaintform")
    public String formcomplaint(Model model) {
        model.addAttribute("complaintform", new Complaint());
        return "complaintform";
    }

    @Transactional
    @PostMapping("/complaintform")
    public String submitcomplaint(@ModelAttribute Complaint complaintform, String... complaint) {

        logger.info("Booking " + complaint + " in a seat...");
        jdbcTemplate.update("insert into TESTTABLE(TESTCOLUMN)  values 'f'", complaint);

        return "complaintlogged";
    }

}

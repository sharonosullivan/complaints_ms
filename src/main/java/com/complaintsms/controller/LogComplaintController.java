package com.complaintsms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.complaintsms.model.Complaint;

@Controller
public class LogComplaintController {

    @GetMapping("/complaintform")
    public String complaintForm(Model model) {
        model.addAttribute("complaintform", new Complaint());
        return "complaintform";
    }

    @PostMapping("/complaintform")
    public String complaintSubmit(@ModelAttribute Complaint complaintform) {
        return "complaintlogged";
    }

}

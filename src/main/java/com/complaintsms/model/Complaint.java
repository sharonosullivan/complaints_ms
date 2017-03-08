package com.complaintsms.model;

import com.complaintsms.controller.LogComplaintController;

public class Complaint  {

        private long complaintid;
        private String complaintcategory;
        private String complainttext;
        private long customerid;
        private long employeeid;
        private String complaintstatus;

    public long getComplaintid() {
        return complaintid;
    }

    public void setComplaintid(long complaintid) {
        this.complaintid = complaintid;
    }

    public String getComplaintcategory() {
        return complaintcategory;
    }

    public void setComplaintcategory(String complaintcategory) {
        this.complaintcategory = complaintcategory;
    }

    public String getComplainttext() {
        return complainttext;
    }

    public void setComplainttext(String complainttext) {
        this.complainttext = complainttext;
    }

    public long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }

    public long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    public String getComplaintstatus() {
        return complaintstatus;
    }

    public void setComplaintstatus(String complaintstatus) {
        this.complaintstatus = complaintstatus;
    }
}

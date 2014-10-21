package org.pwr.transporter.server.web.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pwr.transporter.entity.base.Customer;
import org.pwr.transporter.server.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller
public class TestController { // extends HttpServlet {

    @Autowired
    CustomerService customerService;


    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }


    public TestController() {
    }


    public String doGet(Model model, HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.getList();
        model.addAttribute("customerList", customerList);
        return "test";
    }
}

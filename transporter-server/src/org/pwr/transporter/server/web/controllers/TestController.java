
package org.pwr.transporter.server.web.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pwr.transporter.entity.base.Customer;
import org.pwr.transporter.server.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class TestController { // extends HttpServlet {

    @Autowired
    CustomerService customerService;


    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }


    public TestController() {
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String doGet(Model model, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Test get");
        List<Customer> customerList = customerService.getList();
        model.addAttribute("customerList", customerList);
        return "test";
    }
}

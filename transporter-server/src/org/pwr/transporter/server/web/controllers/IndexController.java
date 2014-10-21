package org.pwr.transporter.server.web.controllers;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * <pre>
 * 
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.1
 */
@Controller
public class IndexController {// extends HttpServlet {

    private static final long serialVersionUID = 1L;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexController() {
        super();
        System.out.println("Create index controller");
        // TODO Auto-generated constructor stub
    }


    // @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Get index");
        return "index";
    }

    // protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // System.out.println("Get index");
    // }
    //
    //
    // /**
    // * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    // */
    // protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // // TODO Auto-generated method stub
    // }

}

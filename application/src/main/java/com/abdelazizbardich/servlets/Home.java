package com.abdelazizbardich.servlets;

import com.abdelazizbardich.entities.Employe;
import com.abdelazizbardich.services.implementations.EmployeServiceImpl;
import com.abdelazizbardich.services.interfaces.EmployeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Home", value = "/Home")
public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeService employeeService = new EmployeServiceImpl();
        ArrayList<Employe> employees = (ArrayList<Employe>) employeeService.getAll();
        request.setAttribute("employees",employees);
        this.getServletContext().getRequestDispatcher("/home.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

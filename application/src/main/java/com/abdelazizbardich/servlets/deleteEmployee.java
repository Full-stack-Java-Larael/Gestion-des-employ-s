package com.abdelazizbardich.servlets;

import com.abdelazizbardich.DAO.implementation.EmployeDaoImpl;
import com.abdelazizbardich.DAO.interfaces.EmployeDao;
import com.abdelazizbardich.entities.Employe;
import com.abdelazizbardich.services.implementations.AdminServiceImpl;
import com.abdelazizbardich.services.interfaces.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "deleteEmployee", value = "/deleteEmployee")
public class deleteEmployee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = Integer.parseInt(request.getParameter("id"));
        EmployeDao employeDao = new EmployeDaoImpl();
        if(employeDao.delete(id)){
            response.sendRedirect(request.getContextPath() + "/home");
        }else {
            response.sendRedirect(request.getContextPath() + "/home");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

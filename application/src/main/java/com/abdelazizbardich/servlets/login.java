package com.abdelazizbardich.servlets;

import com.abdelazizbardich.services.implementations.AdminServiceImpl;
import com.abdelazizbardich.services.interfaces.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    private String message;
    public void init() {
        message = "Login";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        AdminService adminService = new AdminServiceImpl();
        if(adminService.login(email,password)){
            response.sendRedirect(request.getContextPath() + "/home");
        }else {
            response.sendRedirect(request.getContextPath() + "/login");
        }
    }
}

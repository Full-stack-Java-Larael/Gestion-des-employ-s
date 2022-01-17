package com.abdelazizbardich.servlets;

import com.abdelazizbardich.entities.Address;
import com.abdelazizbardich.entities.Employe;
import com.abdelazizbardich.services.implementations.AddressServiceImpl;
import com.abdelazizbardich.services.implementations.EmployeServiceImpl;
import com.abdelazizbardich.services.implementations.RoleServiceImpl;
import com.abdelazizbardich.services.interfaces.EmployeService;
import org.hibernate.HibernateException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "addEmployee", value = "/addEmployee")
public class addEmployee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.getServletContext().getRequestDispatcher("/add.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String password = request.getParameter("password");
        String entryDate = request.getParameter("entry_date");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String street = request.getParameter("street");
        String postalCode = request.getParameter("postalcode");
        if(email == null || firstName == null || lastName  == null || password  == null || entryDate  == null || country  == null || city  == null || street  == null || postalCode == null){
            response.sendRedirect(request.getContextPath() + "/add");
        }else {
            EmployeService employeService = new EmployeServiceImpl();

            try {
                // Address
                Address address = new Address();
                address.setStreet(street);
                address.setCountry(country);
                address.setCity(city);
                address.setPostalCode(Integer.parseInt(postalCode));
                // Employee
                Employe employe = new Employe();
                employe.setEmail(email);
                employe.setFirstName(firstName);
                employe.setLastName(lastName);
                employe.setPassword(password);
                employe.setEntryDate(Date.valueOf(entryDate));
                employe.setAddress(new AddressServiceImpl().getAll().get(0));
                employe.setRole(new RoleServiceImpl().getAll().get(0));
                employeService.add(employe);
                response.sendRedirect(request.getContextPath()+"/home");
            }catch (HibernateException e){
//                e.printStackTrace();
            }
        }
    }
}

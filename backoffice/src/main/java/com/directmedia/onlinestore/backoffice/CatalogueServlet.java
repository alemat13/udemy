/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.backoffice;

import com.directmedia.onlinestore.core.Startup;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alema
 */
@WebServlet(name = "CatalogueServlet", urlPatterns = {"/catalogue"})
public class CatalogueServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Startup.main();
        /*request.setAttribute("catalog", Catalog.listOfWork.values());
        RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/catalogue.jsp");
        disp.forward(request, response);*/
//        ObjectMapper catalogData = new ObjectMapper();
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
//        catalogData.writeValue(out, Catalog.listOfWork.values());
    }

}

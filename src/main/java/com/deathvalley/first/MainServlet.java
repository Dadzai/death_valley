package com.deathvalley.first;

import com.deathvalley.first.model.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Service service = new Service();

        if (req.getParameterMap().containsKey("clicked")) {
            if (req.getParameter("clicked").equals("richest")) {
                try {
                    req.setAttribute("richest", service.getRichestUser());
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else if (req.getParameter("clicked").equals("sum")) {
                try {
                    req.setAttribute("sum", service.getCount());
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }

}
package com.ana.config;

import com.ana.factory.DbEntityManagerFactory;
import jakarta.persistence.EntityManagerFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/initDatabase", loadOnStartup = 1)
public class initDB extends HttpServlet{
    public void init() {
        try{
            super.init();
            DbEntityManagerFactory.getManagerFactory();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
    public void destroy() {
    }
}

package org.andersen.webapp.servlets;


import org.andersen.webapp.dao.datasource.SimpleDatasource;
import org.andersen.webapp.dao.impl.UserDaoImpl;
import org.andersen.webapp.dao.mappers.UserMapper;
import org.andersen.webapp.service.StudentService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "mainServlet", value = "/main")
public class MainServlet extends HttpServlet {
    private StudentService service;

    private String message;

    public void init() {
        service = new StudentService(new UserDaoImpl(new UserMapper()), new SimpleDatasource());
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "here need to be list of students" + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }

}

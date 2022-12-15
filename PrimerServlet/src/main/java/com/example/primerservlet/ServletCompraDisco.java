package com.example.primerservlet;

import com.example.primerservlet.modelo.GestorConsultas;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCompraDisco", value = "/ServletCompraDisco")
public class ServletCompraDisco extends HttpServlet {
    private String message;

    public void init() {
        message = "Discos Poppy";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("     <br>   <a href=/PrimerServlet_war_exploded/>Volver al inicio</a>");*/
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        GestorConsultas gestor = new GestorConsultas();
        int codcomic= Integer.parseInt(request.getParameter("codcomic"));
        out.println("<h1>" + message+ "</h1>");
        out.println(gestor.bajaDisco(codcomic) + "<br><br><br>");


        out.println("     <br>   <a href=/PrimerServlet_war_exploded/>Volver al inicio</a>");


    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        GestorConsultas gestor = new GestorConsultas();
        int codcomic= Integer.parseInt(request.getParameter("codcomic"));
        out.println("<h1>" + message+ "</h1>");
        out.println(gestor.bajaDisco(codcomic) + "<br><br><br>");


        out.println("     <br>   <a href=/PrimerServlet_war_exploded/>Volver al inicio</a>");


        // Hello
    }

    public void destroy() {
    }
}
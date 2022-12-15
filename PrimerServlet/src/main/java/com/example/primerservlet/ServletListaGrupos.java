package com.example.primerservlet;

import com.example.primerservlet.modelo.GestorConsultas;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletListaGrupos", value = "/ServletListaGrupos")
public class ServletListaGrupos extends HttpServlet {
    private String message;

    public void init() {
        message = "Discos Poppy";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        GestorConsultas gestor = new GestorConsultas();

        String [] autores =  gestor.listaAutores();
        out.println("<h1>" + message+ "</h1>");
        out.println("<ul>");
        for (int i = 0; i<autores.length; i++){
            out.println("<li>" + autores[i] + "</li>");
        }
        out.println("</ul>");
        out.println("        <a href=/PrimerServlet_war_exploded/>Volver al inicio</a>");


        // Hello
    }

    public void destroy() {
    }
}

package com.example.primerservlet;

import com.example.primerservlet.modelo.GestorConsultas;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "formCompraDisco", value = "/formCompraDisco")
public class fromCompraDisco extends HttpServlet {
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

        out.println("                <form action=\"ServletCompraDisco\" method=\"get\">                Escriba el codigo del comic: <input name = \"codcomic\">                <input type=\"submit\" value=\"COMPRAR\">            </form>                ");
        out.println("        <a href=/PrimerServlet_war_exploded/>Volver al inicio</a>");


        // Hello
    }

    public void destroy() {
    }
}
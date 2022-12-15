package com.example.primerservlet;

        import java.io.*;

        import com.example.primerservlet.modelo.GestorConsultas;
        import jakarta.servlet.http.*;
        import jakarta.servlet.annotation.*;

@WebServlet(name = "formBuscaAutor", value = "/formBuscaAutor")
public class fromBuscaAutor extends HttpServlet {
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

        out.println("                <form action=\"ServletBuscaAutor\" method=\"post\">                Escriba el nombre del autor: <input name = \"nombreAutor\">                <input type=\"submit\" value=\"BUSCAR\">            </form>                ");
        out.println("        <a href=/PrimerServlet_war_exploded/>Volver al inicio</a>");


        // Hello
    }

    public void destroy() {
    }
}
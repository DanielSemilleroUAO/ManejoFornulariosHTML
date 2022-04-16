/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author delga
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; chartset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        String[] tecnologias = req.getParameterValues("tecnologia");
        String genero = req.getParameter("genero");
        String ocupacion = req.getParameter("ocupacion");
        String[] musicaFavorita = req.getParameterValues("musica");
        String comentario = req.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el servlet</h1>");
        out.print("<table border='1'>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologias");
        out.print("</td>");
        out.print("<td>");
        for (String tecnologia : tecnologias) {
            out.print(tecnologia);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Genero");
        out.print("</td>");
        out.print("<td>");
        out.print(genero.equals("H") ? "Hombre" : "Mujer");
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupacion");
        out.print("</td>");
        out.print("<td>");
        out.print(Ocupaciones.values()[Integer.parseInt(ocupacion)].toString().toLowerCase());
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Musica favorita");
        out.print("</td>");
        out.print("<td>");
        if (musicaFavorita != null) {
            for (String musica : musicaFavorita) {
                out.print(musica);
                out.print(" / ");
            }
        }
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Comentarios");
        out.print("</td>");
        out.print("<td>");
        out.print((comentario.equals("") || comentario.trim().equalsIgnoreCase("Escribir un texto")) ? "N/A" : comentario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
        
    }
    
}

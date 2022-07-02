package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletCodigoEstado", urlPatterns = {"/ServletCodigoEstado"})
public class Servlet extends HttpServlet {

    protected void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Simulando los valores Correctos de una BD
        String usuarioOK = "Juan";
        String passwordOK = "123";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                      
            if(usuarioOK.equals(usuario) && passwordOK.equals(password)){
                out.println("<h1>");
                out.println("Datos Correctos");
                out.println("</h1>");
                out.println("<br> Usuario: " + usuario);
                out.println("<br> Password: " + password);
            }
            else{
                response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
            }
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

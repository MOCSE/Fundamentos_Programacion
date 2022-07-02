
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cabeceros
        String metodoHttp = request.getMethod(); //Metodo Get o Post
        String uri = request.getRequestURI(); //Identificador de recursos uniforme (URI)
        
        Enumeration cabeceros = request.getHeaderNames(); //Todos los cabeceros disponibles
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1> Headers HTTP </h1>");
        out.print("<br> Metodo Http: " + metodoHttp);
        out.print("<br> URI Solicitada: " + uri + "<br><br>");
        
        while (cabeceros.hasMoreElements()) {
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + " </b>");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");
        }
        
        out.print("</body>");
        out.print("</html>");
        
        out.close();
    }
}


package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;
 @WebServlet(name = "Eliminar", urlPatterns = {"/eliminar.do"})
public class Eliminar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Eliminar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Eliminar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
         String dui = request.getParameter("txtDui");

        
        Persona person = new Persona();
        person.setDui(dui);
        
        if(person.eliminarDatos()== true){
        request.getRequestDispatcher("exitoEliminar.jsp").forward(request, response);
        }else{
        request.getRequestDispatcher("noexitoEliminar.jsp").forward(request, response);
        }
   
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

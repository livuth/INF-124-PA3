/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Brett
 */
public class Products extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
           
        out.println("<title>Products</title>");            
        out.println("<meta charset=\"UTF-8\">");            
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");            
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style_sheets/products_style.css\">");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style_sheets/navigation_style.css\">");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style_sheets/body_style.css\">");
                
            out.println("</head>");
            out.println("<body>");
      
            /*BEGINNING OF PAGE*/
            
            //nav bar
            out.println(" <!--        This is the navigator-->\n" +
    "        <nav>\n" +
    "         <ul>\n" +
    "            <li><a href=\"index.html\">Home</a></li>\n" +
    "            <li><a href=\"products.php\">Products</a></li>\n" +
    "            <li><a href=\"meet_the_team.html\">Meet The Team</a></li>\n" +
    "            <li style=\"float:right\"><a class=\"theme_color\" href=\"about.html\">About Us</a></li>\n" +
    "        </ul>\n" +
    "        </nav>");
            
            //products display

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

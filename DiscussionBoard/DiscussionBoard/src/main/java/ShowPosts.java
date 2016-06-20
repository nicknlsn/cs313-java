/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nick
 */
@WebServlet(urlPatterns = {"/ShowPosts"})
public class ShowPosts extends HttpServlet {

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
            HttpSession session = request.getSession();
            String user = (String) session.getAttribute("username");
            String newPost = request.getParameter("newPost");

            // create dummy posts for whoever is logged in
            List<SavedPosts> posts = new ArrayList<SavedPosts>();
            if (user.equals("foo")) {
                posts.add(new SavedPosts("This is a comment made by user Foo.", new Date(2016, 5, 23)));
                posts.add(new SavedPosts("Foo loves to eat smores at campfires.", new Date(2016, 6, 06)));
                posts.add(new SavedPosts("Sometimes Foo forgets to do his homework.", new Date(2016, 6, 14)));
            } else if (user.equals("steve")) {
                posts.add(new SavedPosts("This is a comment made by user Steve.", new Date(2016, 5, 23)));
                posts.add(new SavedPosts("Steve loves to eat smores at campfires.", new Date(2016, 6, 06)));
                posts.add(new SavedPosts("Sometimes Steve forgets to do his homework.", new Date(2016, 6, 14)));
            } else if (user.equals("norman")) {
                posts.add(new SavedPosts("This is a comment made by user Norman.", new Date(2016, 5, 23)));
                posts.add(new SavedPosts("Norman loves to eat smores at campfires.", new Date(2016, 6, 06)));
                posts.add(new SavedPosts("Sometimes Norman forgets to do his homework.", new Date(2016, 6, 14)));
            }

            if (newPost != null) {
                posts.add(new SavedPosts(newPost, new Date()));
            }
            
            Collections.reverse(posts);

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Posts</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Posts for user " + user + "</h1>");

            // display all the posts
            out.println("<ul>");
            for (SavedPosts post : posts) {
                out.println("<li>" + post.date.toString() + "</li>");
                out.println("<li>" + post.thePost + "</li>");
                out.println("</br>");
            }
            out.println("</ul>");

            out.println("<a href=\"NewPost.jsp\">Enter another post</a>");
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

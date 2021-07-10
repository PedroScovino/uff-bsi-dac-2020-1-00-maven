/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;

/**
 *
 * @author pedro
 */
@WebServlet("/alomundo2")
public class MensagemServlet extends HttpServlet {

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
            out.println("<title>Servlet MensagemServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MensagemServlet at " + request.getContextPath() + "</h1>");
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
        
        String msg = "";
        
        int num = (int) (Math.random() * ( 1 - 5 ));
        if(num==0)
            num = 1;
        switch(num){
            case 1:
                msg = "Comece acreditando que é possível.";
                break;
            case 2:
                msg = "Só quem corre atrás dos objetivos é capaz de atingir o sucesso.";
                break;
            case 3:
                msg = "Para cada problema existe um desafio, para cada desafio existe uma solução.";
                break;
            case 4:
                msg = "Não coloque limites nos seus sonhos, coloque esforço.";
                break;
            case 5:
                msg = "O sucesso é a soma dos pequenos esforços repetidos dia após dia.";
                break;
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MensagemServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MensagemServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String msg = "";
        
        int num = (int) (Math.random() * ( 1 - 5 ));
        if(num==0)
            num = 1;
        switch(num){
            case 1:
                msg = "Comece acreditando que é possível.";
                break;
            case 2:
                msg = "Só quem corre atrás dos objetivos é capaz de atingir o sucesso.";
                break;
            case 3:
                msg = "Para cada problema existe um desafio, para cada desafio existe uma solução.";
                break;
            case 4:
                msg = "Não coloque limites nos seus sonhos, coloque esforço.";
                break;
            case 5:
                msg = "O sucesso é a soma dos pequenos esforços repetidos dia após dia.";
                break;
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MensagemServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MensagemServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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

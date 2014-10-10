/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unisc.trabpoo3.web;

import br.unisc.trabpoo3.db.UsuarioJPA;
import br.unisc.trabpoo3.model.Usuario;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tauame
 */
public class LoginServlet extends HttpServlet {

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
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        
        if(request.getParameter("acao").equals("login")){
            
            if(request.getParameter("ativo")==null){
                request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
                return;
            }
        
            if((senha == null || login == null || senha.equals("") || login.equals(""))){
                request.setAttribute("error-msg", "Preencha o Login e Senha!");
                request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
                return;
            }

            senha = senha + "nosalt";

            String sha1 = "";
            try
            {
                MessageDigest crypt = MessageDigest.getInstance("SHA-1");
                crypt.reset();
                crypt.update(senha.getBytes("UTF-8"));
                sha1 = byteToHex(crypt.digest());

                UsuarioJPA jpa = new UsuarioJPA();
                Usuario usuario = jpa.buscaLoginSenha(login, sha1);
                if(usuario != null){
                    request.getSession().setAttribute("usuario", usuario);
                    request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
                    return;
                }else{
                    request.setAttribute("error-msg", "Login ou senha incorretos!");
                    request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
                    return;
                }

            }
            catch(NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
            catch(UnsupportedEncodingException e)
            {
                e.printStackTrace();
            }
        }else if(request.getParameter("acao").equals("logout")){
            request.getSession().setAttribute("usuario", null);
            request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
        }
    }

    
    private static String byteToHex(final byte[] hash)
{
    Formatter formatter = new Formatter();
    for (byte b : hash)
    {
        formatter.format("%02x", b);
    }
    String result = formatter.toString();
    formatter.close();
    return result;
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

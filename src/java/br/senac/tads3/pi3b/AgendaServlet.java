/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author karolina.gkallajian
 */
@WebServlet("/agenda")
public class AgendaServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            for (int i = 0; i < 10; i++) {
                out.print("<h1>*~*~*Olá mundo Web*~*~*</h1>");
                out.print("<h1>*~*~*~*~*~*~*~*~*~*~*~*</h1>");
            }
            out.flush();
        } catch (IOException e) {

        }
    }

}

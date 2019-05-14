package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.RopaDAO;


@WebServlet(name = "RopaServer", urlPatterns = {"/RopaServer"})
public class RopaServer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String resultado= RopaDAO.consultar();
        resp.getWriter().println(resultado);
        }
      
 }


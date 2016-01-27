package monopoly;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author randeth
 */
@WebServlet(name = "main", urlPatterns = {"/main"})
public class main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       

        String pos[] = {"salida","marron","comunity","marron","tax","tren","azulfl","suerte","azulfl","azulfl","carcel","lila","luz","lila","lila","tren","naranja","comunity","naranja","naranja","parking","rojo","suerte","rojo","rojo","tren","amarillo","amarillo","agua","amarillo","ircarcel","verde","verde","comunity","verde","tren","suerte","azulfu","tax","azulfu"};
        double random = Math.random() * 40;
        PrintWriter out = resp.getWriter();
        
        resp.setContentType("text/html");
        out.println((int)random+"-"+pos[(int)random]);
        if(pos[(int)random]=="comunity")
            out.println("<br>comunity chest");
    }

  
}

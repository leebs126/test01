package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/second")*/
public class SecondServlet extends HttpServlet{
   public void doGet(HttpServletRequest request, HttpServletResponse response) 
                                                                   throws IOException, ServletException {
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      out.println("<html><body>");
      String name=request.getParameter("name");
      out.println("</body></html>");
      out.println("�̸�:"+name);
      out.println("<br>");
      out.println("</body></html>");

   }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/click")
public class ClickServlet extends HttpServlet {
    private int clickCount = 0;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        clickCount++;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Click Counter Game</h1>");
        out.println("<p>You've clicked the button " + clickCount + " times!</p>");
        out.println("<a href='index.html'>Click Again</a>");
        out.println("</body></html>");
    }
}

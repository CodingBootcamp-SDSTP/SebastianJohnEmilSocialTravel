import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet
{
	public void init() throws ServletException {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
    // String content = "";
	out.println("<div>REGISTER</div><div><input id='fn' type='text' placeholder='Firstname'><br><input id='ln' type='text' placeholder='Lastname'><br><input id='bday' type='date' placeholder='Birthday'><br><input id='email' type='email' placeholder='your@sample.com'><br><input id='password' type='password' placeholder='Password'><br><input id='reg' type='submit' value='Register'></div>");//addscript here
    // out.println("<h1>this is the content</h1>");
	}

	public void destroy() {
	}
}

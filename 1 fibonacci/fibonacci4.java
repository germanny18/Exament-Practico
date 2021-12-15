

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fibonacci4
 */
@WebServlet("/fibonacci4")
public class fibonacci4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fibonacci4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int n = 6;
		PrintWriter out= response.getWriter();
		out.print("<html><body>");
		out.print("<h3> La serie de <n:/h3>"+n);
		out.print("<br></br>");
		for (int i = 1; i <= n; i++) {
			out.print(fib(i)+" ");
		}
		out.print("</body></html>");
	}
	static int fib(int n) {
		if(n==1 || n == 2 || n == 3 || n == 4)
			if(n == 1 || n == 2)
				return 0;
			else
				return 1;
		else
			return fib(n-1) + fib(n-2) + fib(n-3) + fib(n-4);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

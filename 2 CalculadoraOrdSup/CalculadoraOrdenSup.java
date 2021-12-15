

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraOrdenSup
 */
@WebServlet("/CalculadoraOrdenSup")
public class CalculadoraOrdenSup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraOrdenSup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out= response.getWriter();
		Functio suma = (x, y) -> x+y;
	    Functio resta = (x, y) -> x-y;
	    Functio multi = (x, y) -> x*y;
	    Functio division = (x, y) -> x/y;
	    
	    int m[][] = {{1,2},{3,4}};

		out.print("<html><body>");
		out.print("<br></br>");
		out.print("<h3>Calculadora Orden superio0r</h3>");
	    out.print("la suma es: "+calcu(suma, 1,10));
	    out.print("<br></br>");
	    out.print("la resta es: "+calcu(resta, 1,10));
	    out.print("<br></br>");
	    out.print("la multiplicacion es: "+calcu(multi, 1,10));
	    out.print("<br></br>");
	    out.print("la division es: "+ calcu(division, 1,10)); 
		out.print("</body></html>");


	}
	
	 public static int calcu(Functio term, int a, int b) {
	     int res = 0;
	     return    res += term.opera(a, b);
	 }
	 public interface Functio {
	     int opera(int a, int b);
	 }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

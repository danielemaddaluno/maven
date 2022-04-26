package it.buzzi.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import it.buzzi.app.App;

@WebServlet("/es1")
public class ServletEs1 extends HttpServlet {
	private static final long serialVersionUID = -5847287521413830202L;
	
	public static class Sum {
		private final int a;
		private final int b;
		private final int sum;
		
		public Sum(int a, int b) {
			this.a = a;
			this.b = b;
			this.sum = App.sum(a, b);
		}

		public int getA() {
			return a;
		}

		public int getB() {
			return b;
		}

		public int getSum() {
			return sum;
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int a = Integer.valueOf(req.getParameter("a"));
		int b = Integer.valueOf(req.getParameter("b"));
		Sum sum = new Sum(a, b);
		
		Gson gson = new Gson();
		String json = gson.toJson(sum);
		resp.setContentType("application/json");
		resp.getWriter().write(json);
	}
	
}


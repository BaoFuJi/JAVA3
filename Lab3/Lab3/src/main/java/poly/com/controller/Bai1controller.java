package poly.com.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet ("/bai1")
public class Bai1controller extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	List<country> list = List.of(
			new country("VN", "Việt Nam"),
			new country("US", "United States"),
			new country("CN", "China")
			);
			req.setAttribute("countries", list);
			req.getRequestDispatcher("bai1.jsp").forward(req, resp);
}
}

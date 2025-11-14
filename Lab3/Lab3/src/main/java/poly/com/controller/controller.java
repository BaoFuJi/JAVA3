package poly.com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import poly.com.model.Item;
@WebServlet("/jstlnangcao")
public class controller extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	req.setAttribute("lan", 19);
	ArrayList<String>ds=new ArrayList<String>();
	ds.add("cần");
	ds.add("cù");
	ds.add("siêng");
	ds.add("năng");
	req.setAttribute("ds", ds);
	
	
	ArrayList<Item> items = new ArrayList<>();
	items.add(new Item("Nokia 2020", "anh1.jpg", 500, 0.1));
	items.add(new Item("Samsung Xyz", "anh2.jpg", 700, 0.15));
	items.add(new Item("iPhone Xy", "anh3.jpg", 900, 0.25));
	items.add(new Item("Sony Erricson", "anh1.jpg", 55, 0.3));
	items.add(new Item("Seamen", "anh2.jpg", 70, 0.5));
	items.add(new Item("Oppo 2021", "anh3.jpg", 200, 0.2));

	req.setAttribute("items", items);
	req.getRequestDispatcher("JSTLnangcao.jsp").forward(req, resp);
}
}

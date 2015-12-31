package muta.admin.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import muta.bean.JavaBean;
import muta.bean.SqlBean;

public class Verify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//ªÒ»°µ«»Î’À∫≈
		String account = request.getParameter("account");
		String password=request.getParameter("password");
		System.out.println(account+" "+password+"1");
		String sql ="select * from admin where account=?";
		SqlBean  sBean = new SqlBean();
		System.out.println(account+" "+password+"2");
		boolean temp= sBean.Verify(sql, account, password);
		System.out.println(account+" "+password+"3");
		if(temp)	request.getRequestDispatcher("index.jsp").forward(request, response);
		if(temp==false)	request.getRequestDispatcher("errorlogin.jsp").forward(request, response);
	}
}
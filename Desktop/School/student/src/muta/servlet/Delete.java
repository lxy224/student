package muta.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import muta.bean.SqlBean;

public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		//获取超链接传来的数据
		String sId = request.getParameter("id");
		int      id  =Integer.parseInt(sId);
		//调用模型层删除方法
		String sql = "delete from student where id=?";
		SqlBean  sBean = new SqlBean();
		int count =sBean.getDelete(sql, id);
		String url="";
		if(count>0)
		{
			url="success4.jsp";
		}
		else
		{
			url ="error.jsp";
			request.setAttribute("error", "删除");
		}
		//转发
		request.getRequestDispatcher(url).forward(request, response);
	}
}
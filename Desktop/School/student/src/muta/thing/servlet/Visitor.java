package muta.thing.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import muta.bean.JavaBean;
import muta.bean.JavaBean3;
import muta.bean.SqlBean;

public class Visitor extends HttpServlet {
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
		//获取来访信息
		String visitor = request.getParameter("visitor");
		String student=request.getParameter("student");
		String time = request.getParameter("time");
		String reason = request.getParameter("reason");
		System.out.println(visitor+" "+student+" "+time+"　"+reason);
		//封装到JavaBean3对象中去
		JavaBean3 jBean = new JavaBean3();
		jBean.setVisitor(visitor);
		jBean.setStudentname(student);
		jBean.setTime(time);
		jBean.setReason(reason);
		//调用模型层
		String sql = "insert into visitor(visitor,student,time,reason) values(?,?,?,?)";
		SqlBean  sBean = new SqlBean();
		int count =sBean.getInsertvisitor(sql,jBean);
		String url="";
		if(count>0)
		{
			url="success1.jsp";
		}
		else
		{
			url ="error.jsp";
			request.setAttribute("error", "");
		}
		//转发
		request.getRequestDispatcher(url).forward(request, response);
	}

	}

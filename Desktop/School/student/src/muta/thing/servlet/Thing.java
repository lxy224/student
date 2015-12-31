package muta.thing.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import muta.bean.JavaBean;
import muta.bean.JavaBean3;
import muta.bean.JavaBean4;
import muta.bean.SqlBean;

public class Thing extends HttpServlet {
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
		//获取前台信息
		String student=request.getParameter("student");
		String time = request.getParameter("time");
		String thing = request.getParameter("thing");
		System.out.println(student+"  "+time+"　"+thing);
		//封装到JavaBean4对象中去
		JavaBean4 jBean = new JavaBean4();
		jBean.setStudentname(student);
		jBean.setTime(time);
		jBean.setThing(thing);
		//调用模型层
		String sql = "insert into thing(student,time,thing) values(?,?,?)";
		SqlBean  sBean = new SqlBean();
		int count =sBean.getInsertthing(sql, jBean);
		String url="";
		if(count>0)
		{
			url="success2.jsp";
		}
		else
		{
			url ="error.jsp";
			request.setAttribute("error", "登记错误");
		}
		//转发
		request.getRequestDispatcher(url).forward(request, response);
	}

	}
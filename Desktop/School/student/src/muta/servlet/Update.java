package muta.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import muta.bean.JavaBean;
import muta.bean.SqlBean;

public class Update extends HttpServlet {
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
		//获得前台表单信息
		String sid = request.getParameter("id");
		int id  =Integer.parseInt(sid);
		String name =request.getParameter("name");
		String college =request.getParameter("college");
		String grade =request.getParameter("grade");
		String room =request.getParameter("room");
		String sex =request.getParameter("sex");
		String sage = request.getParameter("age");
		int age  =Integer.parseInt(sage);
		String stay =request.getParameter("stay");
		String roomnumber =request.getParameter("roomnumber");
		System.out.println(roomnumber);
		//封装到JavaBean对象中去
		JavaBean jBean = new JavaBean();
		jBean.setId(id);
		jBean.setName(name);
		jBean.setCollege(college);
		jBean.setGrade(grade);
		jBean.setRoom(room);
		jBean.setSex(sex);
		jBean.setAge(age);
		jBean.setStay(stay);
		jBean.setRoomnumber(roomnumber);
		String sql ="update student set name=?,college=?,grade=?,room=?,sex=?,age=?,stay=?,roomnumber=? where id=?";
		SqlBean  sBean = new SqlBean();
		int count =sBean.getUpdate(sql,jBean);
		String url="";
		if(count>0)
		{
			url="SearchList.jsp";
		}
		else
		{
			url ="error.jsp";
			request.setAttribute("error", "更新");
		}
		request.getRequestDispatcher("SearchList.jsp").forward(request, response);
	}
}
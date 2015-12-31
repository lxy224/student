package muta.servlet;
	
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import muta.bean.JavaBean;
import muta.bean.SqlBean;

public class SearchById extends HttpServlet {
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
		
		//获取用户ID
		String sid = request.getParameter("id");
		int  id  =Integer.parseInt(sid);
		
		String sql ="select * from student where id=?";
		SqlBean  sBean = new SqlBean();
		JavaBean jBean = sBean.getSearchById(sql, id);
		
		//用户ID
		request.setAttribute("id",jBean.getId());
		//用户姓名
		request.setAttribute("name",jBean.getName());
		//用户学院
		String college="";
		String js="";
		String jt="";
		String wl="";
		String ny="";
		String hy="";
		String zz="";
		if(jBean.getCollege()!=null)
		{
			college=jBean.getGrade().trim();
			if(college.equals("计算机科学与技术学院"))
			{
				js="selected";
			}
			else if(college.equals("交通学院"))
			{
				jt ="selected";
			}
			else if(college.equals("物流学院")){
				wl="checked";
			}
			else if(college.equals("能源与动力工程学院")){
				ny="checked";
			}
			else if(college.equals("航运学院")){
				hy="checked";
			}
			else{
				zz="checked";
			}
		}
		request.setAttribute("js",js);
		request.setAttribute("jt",jt);
		request.setAttribute("wl",wl);
		request.setAttribute("ny",ny);
		request.setAttribute("hy",hy);
		request.setAttribute("zz",zz);
	//	request.setAttribute("college",jBean.getCollege());
		//用户 年级
		String grade="";
		String first="";
		String  second="";
		String third="";
		String forth="";
		if(jBean.getGrade()!=null)
		{
			grade=jBean.getGrade().trim();
			if(grade.equals("一年级"))
			{
				first ="selected";
			}
			else if(grade.equals("二年级"))
			{
				second ="selected";
			}
			else if(grade.equals("三年级")){
				third="checked";
			}
			else{
				forth="checked";
			}
		}
		request.setAttribute("first",first);
		request.setAttribute("second",second);
		request.setAttribute("third",third);
		request.setAttribute("forth",forth);
		
	//	request.setAttribute("grade",jBean.getGrade());
		//用户宿舍楼
		request.setAttribute("room",jBean.getRoom());
	
		//用户性别
		String sex="";
		String man="";
		String woman="";
		if(jBean.getSex()!=null)
		{
			sex=jBean.getSex().trim();
			if(sex.equals("男"))
			{
				man ="selected";
			}
			else
			{
				woman ="selected";
			}
		}
		request.setAttribute("man",man);
		request.setAttribute("woman",woman);
		//用户年龄
		request.setAttribute("age",jBean.getAge());
		//用户是否在校
		String stay="";
		String in="";
		String off="";
		if(jBean.getStay()!=null)
		{
			stay=jBean.getStay().trim();
			if(stay.equals("在校"))
			{
				in ="selected";
			}
			else
			{
				off ="selected";
			}
		}
		request.setAttribute("in",in);
		request.setAttribute("off",off);
		request.setAttribute("roomnumber",jBean.getRoomnumber());
		//转发
		request.getRequestDispatcher("Update.jsp").forward(request, response);
	}
}
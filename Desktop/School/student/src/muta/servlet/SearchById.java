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
		
		//��ȡ�û�ID
		String sid = request.getParameter("id");
		int  id  =Integer.parseInt(sid);
		
		String sql ="select * from student where id=?";
		SqlBean  sBean = new SqlBean();
		JavaBean jBean = sBean.getSearchById(sql, id);
		
		//�û�ID
		request.setAttribute("id",jBean.getId());
		//�û�����
		request.setAttribute("name",jBean.getName());
		//�û�ѧԺ
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
			if(college.equals("�������ѧ�뼼��ѧԺ"))
			{
				js="selected";
			}
			else if(college.equals("��ͨѧԺ"))
			{
				jt ="selected";
			}
			else if(college.equals("����ѧԺ")){
				wl="checked";
			}
			else if(college.equals("��Դ�붯������ѧԺ")){
				ny="checked";
			}
			else if(college.equals("����ѧԺ")){
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
		//�û� �꼶
		String grade="";
		String first="";
		String  second="";
		String third="";
		String forth="";
		if(jBean.getGrade()!=null)
		{
			grade=jBean.getGrade().trim();
			if(grade.equals("һ�꼶"))
			{
				first ="selected";
			}
			else if(grade.equals("���꼶"))
			{
				second ="selected";
			}
			else if(grade.equals("���꼶")){
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
		//�û�����¥
		request.setAttribute("room",jBean.getRoom());
	
		//�û��Ա�
		String sex="";
		String man="";
		String woman="";
		if(jBean.getSex()!=null)
		{
			sex=jBean.getSex().trim();
			if(sex.equals("��"))
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
		//�û�����
		request.setAttribute("age",jBean.getAge());
		//�û��Ƿ���У
		String stay="";
		String in="";
		String off="";
		if(jBean.getStay()!=null)
		{
			stay=jBean.getStay().trim();
			if(stay.equals("��У"))
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
		//ת��
		request.getRequestDispatcher("Update.jsp").forward(request, response);
	}
}
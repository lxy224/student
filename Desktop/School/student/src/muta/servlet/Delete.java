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
		//��ȡ�����Ӵ���������
		String sId = request.getParameter("id");
		int      id  =Integer.parseInt(sId);
		//����ģ�Ͳ�ɾ������
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
			request.setAttribute("error", "ɾ��");
		}
		//ת��
		request.getRequestDispatcher(url).forward(request, response);
	}
}
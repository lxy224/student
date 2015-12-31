package muta.bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * @author help
 *�������ݿ�ķ���
 */
public class SqlBean {
	Connection con;
	PreparedStatement pre;
	ResultSet rs;
	public SqlBean()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
	con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/whut","root","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author help
	 * 
	 *�����µ�һ����¼
	 * @return 
	 */
	public int getInsert(String sql,JavaBean jBean)
	{
		int count =0;
		try {
			pre = con.prepareStatement(sql);
			pre.setInt(1, jBean.getId());
			pre.setString(2,jBean.getName());
			pre.setString(3,jBean.getCollege());
			pre.setString(4,jBean.getGrade());
			pre.setString(5,jBean.getRoom());
			pre.setString(6,jBean.getSex());
			pre.setInt(7,jBean.getAge());
			pre.setString(8,jBean.getStay());
			pre.setString(9,jBean.getRoomnumber());
			count=pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
	{
		try {
			pre.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return count;
	}
	/**
	 * @author help
	 * 
	 *ɾ��һ����¼
	 * @return 
	 */
	public int getDelete(String sql,int id)
	{
		int count =0;
		try {
			pre = con.prepareStatement(sql);
			pre.setInt(1, id);
			count=pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				pre.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}
	/**
	 * @author help
	 * 
	 *����ID��ѯĳһ����¼
	 * @return 
	 */
	public JavaBean getSearchById(String sql,int id)
	{
		JavaBean jBean = new JavaBean();
		
		try {
			pre = con.prepareStatement(sql);
			pre.setInt(1, id);
			rs=pre.executeQuery();
			
			while(rs.next())
			{
				jBean.setId(rs.getInt("id"));
				jBean.setName(rs.getString("name"));
				jBean.setCollege(rs.getString("college"));
			   jBean.setGrade(rs.getString("grade"));
			   jBean.setRoom(rs.getString("room"));
				jBean.setSex(rs.getString("sex"));
				jBean.setAge(rs.getInt("age"));
				jBean.setStay(rs.getString("stay"));
			jBean.setRoomnumber(rs.getString("roomnumber"));
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return jBean;	
	}
	/**
	 * @author help
	 * 
	 *��֤�����˺ź�����
	 * @return 
	 */
	public boolean Verify(String sql,String account,String password)
	{
		System.out.println(account+" "+password+" SQL");
		JavaBean2 jBean = new JavaBean2();
		boolean temp=false;
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1,account);
			rs=pre.executeQuery();
			//if(rs.getString("password").equals(password)){temp=true; }
			while(rs.next())
			{
				System.out.println(rs.getString("password"));
				if(rs.getString("password").equals(password)){temp=true; break;}
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return temp;	
	}
	
	
	/**
	 * @author help
	 * 
	 *����ĳһ����¼
	 * @return 
	 */
	public int getUpdate(String sql,JavaBean jBean)
	{  
		int count =0;
		try {
			pre = con.prepareStatement(sql);
			pre.setInt(9,jBean.getId());
			pre.setString(1,jBean.getName());
			pre.setString(2,jBean.getCollege());
			pre.setString(3,jBean.getGrade());
			pre.setString(4,jBean.getRoom());
			pre.setString(5,jBean.getSex());
			pre.setInt(6,jBean.getAge());
			pre.setString(7,jBean.getStay());
			pre.setString(8,jBean.getRoomnumber());
			count = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				pre.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * @author help
	 * 
	 *��ʾ���м�¼
	 * @return 
	 */
	public List<JavaBean> getSearch(String sql)
	{
	
		List<JavaBean> list = new ArrayList<JavaBean>();
		//��ȡprepareStatement����
		try {
			pre = con.prepareStatement(sql);
			rs   =pre.executeQuery();
			
			while(rs.next())
			{
				JavaBean jBean =new JavaBean();
				jBean.setId(rs.getInt("id"));
				jBean.setName(rs.getString("name"));
				jBean.setCollege(rs.getString("college"));
			   jBean.setGrade(rs.getString("grade"));
			   jBean.setRoom(rs.getString("room"));
				jBean.setSex(rs.getString("sex"));
				jBean.setAge(rs.getInt("age"));
				jBean.setStay(rs.getString("stay"));
			jBean.setRoomnumber(rs.getString("roomnumber"));
				list.add(jBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				pre.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	/**
	 * @author help
	 * 
	 *�����µ���������Ϣ
	 * @return 
	 */
	public int getInsertvisitor(String sql,JavaBean3 jBean)
	{
		int count =0;
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, jBean.getVisitor());
			pre.setString(2,jBean.getStudentname());
			pre.setString(3,jBean.getTime());
			pre.setString(4,jBean.getReason());
			count=pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
	{
		try {
			pre.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return count;
	}
	/**
	 * @author help
	 * 
	 *ѧ����Ʒ�����Ǽ�
	 * @return 
	 */
	public int getInsertthing(String sql,JavaBean4 jBean)
	{
		int count =0;
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, jBean.getStudentname());
			pre.setString(2,jBean.getTime());
			pre.setString(3,jBean.getThing());
			count=pre.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
	{
		try {
			pre.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return count;
	}
	

	
}
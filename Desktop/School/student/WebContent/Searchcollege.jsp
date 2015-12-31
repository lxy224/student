<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();	
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示记录</title>
<style type="text/css">  
#myTable  
  {  
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;  
  width:90%;  
  border-collapse:collapse;  
  }  
  
#myTable td, #myTable th   
  {  
  font-size:1em;  
  border:1px solid  blue;  
  padding:3px 7px 2px 7px;  
  }  
  
#myTable th   
  {  
  font-size:1.1em;  
  text-align:left;  
  padding-top:5px;  
  padding-bottom:4px;  
  background-color:#0066FF;  
  color:#ffffff;  
  }  
  
</style>  
</head>
<body bgcolor="	LightSkyBlue">
<center >
<font color=black  size=5>学生信息如下：</font>
<hr>
<table border=1 bgColor="#ffffff" width="1000px" height="100px" id="myTable">
<tr>
<th width="70" height="30"  align="center">学号</th>
<th width="70" height="30"  align="center">姓名</th>
<th width="140" height="30"  align="center">学院</th>
<th width="70" height="30"  align="center">年级</th>
<th width="70" height="30"  align="center">宿舍楼</th>
<th width="70" height="30"  align="center">性别</th>
<th width="70" height="30"  align="center">年龄</th>
<th width="70" height="30"  align="center">在校</th>
<th width="70" height="30"  align="center">房间号</th>
<th width="70" height="30"  align="center"><center>操作</center></th>
</tr>
<jsp:useBean id="sBean" class="muta.bean.SqlBean" ></jsp:useBean>
<jsp:useBean id="jBean"  class="muta.bean.JavaBean"></jsp:useBean>
<%
    // String t=URLDecoder.decode(request.getParameter("name"),"utf-8");
     String t = request.getParameter("name");
     %>
     <% if(t.equals("js"))t="计算机科学与技术学院" ;%>
          <% if(t.equals("wl"))t="物流学院" ;%>
               <% if(t.equals("zz"))t="政治与行政学院" ;%>
          <% if(t.equals("hy"))t="航运学院";%>
               <% if(t.equals("jt"))t="交通学院";%>
          <% if(t.equals("ny"))t="能源与动力工程学院";%>
     <% 
     String sql1="select * from student where college  = '"+t+"' order by id ";
     String sql=sql1;
     java.util.List  list =sBean.getSearch(sql);
     for(java.util.Iterator it =list.iterator();it.hasNext();)
     {
    	 //获取一个JavaBean对象
    	 jBean =(muta.bean.JavaBean)it.next();
  %> 
  <tr>
       <td><%=jBean.getId() %></td>
       <td><%=jBean.getName() %></td>
       <td><%=jBean.getCollege() %></td>
         <td><%=jBean.getGrade() %></td>
       <td><%=jBean.getRoom() %></td>
       <td><%=jBean.getSex() %></td>
       <td><%=jBean.getAge() %></td>
              <td><%=jBean.getStay() %></td>
       <td><%=jBean.getRoomnumber() %></td>
       
       <td>
          
          <a href="Delete?id=<%=jBean.getId()%>">删除</a>&nbsp;
          <a href="SearchById?id=<%=jBean.getId()%>">更新</a>
       </td>
  </tr>
  
  <% }%>
</table>
</center>
</body>
</html>
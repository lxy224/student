<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>按学号查询！</title>

</head>

<body>
<center>
 <form method=get action=Searchbyid.jsp> 
请输入学生的学号<input type=text  name=id> 
<br><br>
 <input type=submit value=查询> 
</form> 
</center>
</body>
</html>
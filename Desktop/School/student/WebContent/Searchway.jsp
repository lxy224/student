<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>宿舍楼学生信息</title>
<style type="text/css">
#t {
font-family:"Microsoft YaHei",微软雅黑; 
font-size:20px;
color:#4682B4;
}

</style>
</head>

<body>
<div id="t">
<center>
<a href="Searchroom.jsp?name=h1">海虹一栋学生信息</a><br/>
<a href="Searchroom.jsp?name=h2">海虹二栋学生信息</a><br/>
<a href="Searchroom.jsp?name=h3">海虹三栋学生信息</a><br/>
<a href="Searchroom.jsp?name=h4">海虹四栋学生信息</a><br/>
</div>
</center>
</body>
</html>
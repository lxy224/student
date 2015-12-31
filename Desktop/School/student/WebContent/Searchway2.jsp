<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学院学生信息</title>
<style type="text/css">
#t {
font-family:"Microsoft YaHei",微软雅黑; 
font-size:20px;
color:#4682B4;
}

</style>
</head>

<body>
<center>
<div id="t">
<a href="Searchcollege.jsp?name=js">计算机科学与技术学院</a><br/>
<a href="Searchcollege.jsp?name=jt">交通学院</a><br/>
<a href="Searchcollege.jsp?name=ny">能源与动力工程学院</a><br/>
<a href="Searchcollege.jsp?name=hy">航运学院</a><br/>
<a href="Searchcollege.jsp?name=wl">物流学院</a><br/>
<a href="Searchcollege.jsp?name=zz">政治与行政学院</a><br/>
			</div>
</center>
</body>
</html>
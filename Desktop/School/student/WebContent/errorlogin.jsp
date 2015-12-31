<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出错啦！！！</title>
</head>

<body>
    对不起,您的账号或密码输入错误！请重新输入
    <br>3秒钟后页面自动返回...
   <!--input type="button" onclick="history.go(-1)" value="返回登入页面"-->
    <script language=javascript>
          setTimeout('window.location="login.jsp"',3000)
      </script>
</body>
</html>


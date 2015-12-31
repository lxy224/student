<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success1！</title>
</head>

<body>
   登记成功
     <br>3秒钟后页面自动返回...
   <!--input type="button" onclick="history.go(-1)" value="返回登入页面"-->
    <script language=javascript>
      setTimeout('window.history.go(-1)',3000);
         // setTimeout('window.location="visitor.jsp"',3000)
      </script>
</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>	
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>贵重物品进出登记</title>
</head>
<body >
<div id="Layer1"  style="position:absolute; width:100%; height:100%; z-index:-1;left:0; top:0;">    
<img src="images/login_bg6.jpg" height="100%" width="100%;left:0; top:0;"/>    
</div>  
 <center>
 <font color="black" size="6">贵重物品进出登记</font>
<hr>
<form action="thing" method="post">
<table width="383" height="200" border="2">

<tr>
<td width="90" height="35"  align="center" style="color:black">学生姓名</td>
<td align="center"><input type ="text" name="student"   style="width:250px; height:22px"></td>
</tr>
 <tr>
<td width="90" height="35"  align="center" style="color:black">出门时间</td>
<td align="center"><input type ="text" name="time"  style="width:250px; height:22px"></td>
</tr>
 <tr>
<td width="90" height="35"  align="center" style="color:black">所带物品</td>
<td align="center"><input type ="text" name="thing"  style="width:250px; height:44px"></td>
</tr>


<tr>
<td colspan="2" align="center">
<br>
 <center>
 <input type="submit" value="提交" style="width:50px; height:30px">
</center>
</td>
</tr>

</table>
</form>

 </center>
</body>
</html>
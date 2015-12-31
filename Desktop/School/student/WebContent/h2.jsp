<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>h2</title>
<style type="text/css">  
#myTable  
  {  
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;  
  width:80%;  
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
  font-size:0.9em;  
  text-align:left;  
  padding-top:2px;  
  padding-bottom:4px;  
  background-color:#0066FF;  
  color:#ffffff;  
  }  
  #myTable tr.alt td   
  {  
  color:#000000;  
  background-color:#EAF2D3;  
  }
 #head{
font-size: 30px ;
color: #FF69B4;
font-style: italic;
font-weight:bold;
font-family:lisu;
}
 #body{
font-size: 17px ;
color: #000000;
font-family:隶书;
}
</style>  
</head>

<body>
<div id="Layer1"  style="position:absolute; width:100%; height:100%; z-index:-1;left:0; top:0;">    
<img src="images/login_bg2.jpg" height="100%" width="100%;left:0; top:0;"/>    
</div>  

<center><font  size="5"  color="blue" id="head">海虹二栋</font></center>
&nbsp  &nbsp  &nbsp<font  style="margin-left:30px" id="body">余家头校区，校区内寝室历史也比较悠久其中余家头校区（含海虹公寓）就是的武汉交通科技大学。
海虹公寓楼内大都是四人间，每人配有独立书桌书柜，且宿舍楼后面有繁华的商业街。
公寓附近还建有澡堂、洗衣房、校车停靠点等多个方便学生的建筑。</font>
<br>
<center>
<h3>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp宿舍管理员</h3>
<table border="1"   style="margin-left:100px" id="myTable"><tr>
  <th width="70" height="30"  align="center" >姓名</th>
    <th width="70" height="30"  align="center" >性别</th>
    <th width="70" height="30"  align="center" >年龄</th>
    <th width="100" height="30"  align="center" >联系方式</th>
  </tr>
  <tr class="alt">
  <td align="center" >陈鹏</td>
    <td align="center">男</td>
        <td align="center">57</td>
    <td align="center">18207778824</td>
  </tr>
    <tr>
    <td align="center">李和平</td>
    <td align="center">男</td>
        <td align="center">34</td>
    <td align="center">1820278879</td>
  </tr>
  
  </table>
</center>


</body>
</html>

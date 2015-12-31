<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>	
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>插入新值</title>
</head>
<body >
<div id="Layer1"  style="position:absolute; width:100%; height:100%; z-index:-1;left:0; top:0;">    
<!--<img src="images/login_bg2.jpg" height="100%" width="100%;left:0; top:0;"/>     --> 
</div>  
 <center>
 <font color="black" size=6>录入学生信息</font>
<hr>
<form action="Insert" method="post">
<table width="399" height="416" border="2">
<tr>
<td width="59" height="35"  align="center" style="color:black">学号</td>
<td width="322" align="center"><input type ="text" name="id"   style="width:250px; height:22px"></td>
</tr>
 <br>
<tr>
<td width="59" height="35"  align="center" style="color:black">姓名</td>
<td align="center"><input type ="text" name="name"   style="width:250px; height:22px"></td>
</tr>
<tr>
<td width="59" height="35"  align="center" style="color:black">学院</td>
<td align="center" ><select name="college"  style="width:250px; height:22px;">
<option value="计算机科学与技术学院">计算机科学与技术学院</option> 
<option value="交通学院">交通学院</option>
<option value="物流学院">物流学院</option>
<option value="能源与动力工程学院">能源与动力工程学院</option>
<option value="航运学院">航运学院</option>
<option value="政治与行政学院">政治与行政学院</option>
</select></td>
</tr>

<tr>
<td width="59" height="35"  align="center" style="color:black">年级</td>
<td align="center"><select  size="1"  name="grade"  style="width:250px; height:22px;">
<option value="一年级"  style="text-align:center" >一年级</option>
<option value="二年级">二年级</option>
<option value="三年级">三年级</option>
<option value="四年级">四年级</option>
</select></td>
</tr>
<tr>
<td width="59" height="35"  align="center" style="color:black">宿舍楼</td>
<td align="center"><input type ="text" name="room"  placeholder="例如：h1"  style="width:250px; height:22px"></td>
</tr>

<!--  <td align="center" style="color:#FFF">性别</td>
<td align="center" ><input type="radio" name ="sex" value="男" style="height:15">男
        &nbsp;<input type="radio" name ="sex" value="女"  style=" height:15">女
 </td>
</tr>-->
<tr>
<td width="59" height="35"  align="center" style="color:black">性别</td>
<td align="center"><select  size="1"  name="sex" style="width:250px; height:22px;">
<option value="男"  style="text-align:center" >男</option>
<option value="女">女</option>
</select></td>
</tr>
<tr>
<td width="59" height="35"  align="center" style="color:black">年龄</td>
<td align="center"><input type="text" name ="age"  style="width:250px; height:22px"></td>
</tr>
<tr>
<td width="59" height="35"  align="center" style="color:black">在校</td>
<td align="center"><select  size="1"  name="stay"  style="width:250px; height:22px;">
<option value="在校"  style="text-align:center" >在校</option>
<option value="离校">离校</option>
</select></td>
</tr>

<tr>
<td width="59" height="35"  align="center" style="color:black">房间号</td>
<td width="322" align="center"><input type ="text" name="roomnumber"   style="width:250px; height:22px"></td>
</tr>



<tr>
<td colspan="2">
<br>
 <center>
 <input type="submit" value="提交" style="width:50px; height:30px">&nbsp;&nbsp;
 <input type="reset" value="重置" style="width:50px; height:30px">
</center>
</td>
</tr>

</table>
</form>
<!-- a href="SearchList.jsp">查询</a> -->
 </center>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>whut宿舍管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<script type="text/javascript">
window.onload = function(){
	//1、获取a节点，并为其添加onclick响应函数
	var aNodes = document.getElementsByTagName("a");
	
		for(var i=0;i<aNodes.length;i++){
			aNodes[i].onclick=function(){
				//3.创建一个XMLHttpRequest对象
				var request = new  XMLHttpRequest();
				var url = this.href;
				var method="GET";
				//5.调用XMLHttpRequest对象的open方法
				request.open(method,url);
				//6.调用XMLHttpRequest对象的send方法
				request.send(null);
				//7.为XMLHttpRequest对象添加onreadystatechange响应函数
				request.onreadystatechange = function(){
					//alert(request.readyState)
					//8.判断相应是否完成：XMLHttpRequest对象的readyState属性值为4的时候表示相应完成。
					if(request.readyState==4){
						if(request.status==200||request.status==304){
							//10.打印相应结果：responseText
					document.getElementById("details").innerHTML = request.responseText;
						}
					}
				}
				return false;
			}
			}
		}
</script>

</head>
<body>
<div class="top"></div>
<div id="header">
	<div class="logo">武汉理工大学学生宿舍管理系统</div>
	<div class="navigation">
		<ul>
		 	<h3>欢迎您！</h3>
			
	  </ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
				<ul id="nav_dot">
      <li>
          <h4 class="M1"><span></span>宿舍简介</h4>
          <div class="list-item none" >
            <a href="h1.jsp">海虹1栋</a>
            <a href="h2.jsp">海虹2栋</a>
            <a href="h3.jsp">海虹3栋</a>
            <a href="h4.jsp">海虹4栋</a>

        </li>
        <li>
          <h4 class="M2"><span></span>学生管理</h4>
          <div class="list-item none">
            <a href="Insert.jsp">录入学生信息</a>
            <a href="SearchList.jsp">学生信息列表</a>
            <!--  a href="Insert.jsp">删除学生信息</a>-->
           </div>
        </li>
        <li>
          <h4 class="M3"><span></span>信息查询</h4>
          <div class="list-item none">
            <a href="Searchway.jsp">查询各个宿舍楼学生信息</a>
            <a href="Searchway2.jsp">查询各个学院学生信息</a>
             <a href="Searchway3.jsp">按学号查询学生信息</a>
          </div>
        </li>
				<li>
          <h4 class="M4"><span></span>出入登记</h4>
          <div class="list-item none">
            <a href="visitor.jsp">来访人员登记</a>
            <a href="thing.jsp">贵重物品进出登记</a>
          </div>
        </li>
				
			
  </ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
					<ul>
							<li><img src="images/home.png"></li>
								<li style="margin-left:25px;">您当前的位置：</li>
								<li><a href="#">系统公告</a></li>
								<li>></li>
								<li><a href="#">最新公告</a></li>
						</ul>
			</div>
			<div class="main" id="details">
				
			</div>
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><p><target="_blank"></a></p></div>
<script>navList(12);</script>
</body>
</html>
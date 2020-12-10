<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		var wait= 3;
		time(wait);
	});
	function time(wait) {
		if(wait==0){
			delayedRedirect();
			return;
		}
		$("#time").html("<font color='red'>"+wait+"</font>");
		wait--;
		setTimeout(function() {
			time(wait);
		},
		1000);
	}
	function delayedRedirect(){
		window.location= "../LoginCheck/index.jsp";
	}
</script>
</head>
<body>
	<div>
		请先登录（3秒后跳转到登录页面）：<h1 id="time"></h1>
	</div>
</body>
</html>
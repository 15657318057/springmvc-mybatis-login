<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<style>
table{
border-spacing:0;
margin:10px;
}
td{
padding:10px 20px;
}
</style>
</head>
<body>
<table border="1">
<thead>我的信息</thead>
<tbody>
	<tr>
	<td>ID</td>
	<td>${admin.id }</td>
	</tr>
	<tr>
	<td>姓名</td>
	<td>${admin.name }</td>
	</tr>
	<tr>
	<td>昵称</td>
	<td>${admin.sname }</td>
	</tr>
</tbody>	
</table>
</body>
</html>
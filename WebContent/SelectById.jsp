<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>根据id查找图书信息</title>
</head>
<body>
<h3 align="center">信息查找</h3>
	<table border="1">
		<tr align="center">
			<td>编号</td>
			<td>${book.id}</td>
		</tr>
		<tr align="center">
			<td>书名</td>
			<td>${book.name}</td>
		</tr>
		<tr align="center">
			<td>作者</td>
			<td>${book.author}</td>
		</tr>
		<tr align="center">	
			<td>描述</td>
			<td>${book.description}</td>
		</tr>
		<tr align="center">
			<td>数量</td>
			<td>${book.num}</td>
		</tr>
		<tr align="center">
			<td>操作</td>
			<td>
			<a href="#">修改</a> 
			<a href="#">删除</a>
			</td>
		</tr>
		<tr>
			<td><a href="/listbook.jsp">返回</a></td>
        </tr>
	</table>
</body>
</html>
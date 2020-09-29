<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>书籍列表</title>
</head>
<body>
<form action="BookServlet" method="post">
	<h3 align="center">书籍列表</h3>
	<hr/>
	<table border="1">
		<tr>
			<th>编号</th>
			<th>书名</th>
			<th>作者</th>
			<th>描述</th>
			<th>数量</th>
			<th>操作</th>
		</tr>
		<c:forEach var="books" items="${books}">
			<tr align="center">
				<td><c:out value="${books.id}"></c:out></td>
				<td><c:out value="${books.name}"></c:out></td>
				<td><c:out value="${books.author}"></c:out></td>
				<td><c:out value="${books.description}"></c:out></td>
				<td><c:out value="${books.num}"></c:out></td>
				<td>
				<a href="#">修改</a>
				<a href="#">删除</a>
				</td>				
			</tr>
		</c:forEach>
	</table>
	</form>
</body>
</html>
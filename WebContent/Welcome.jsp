<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<h1 align="center">Welcome!</h1>
	<hr />
	<form action="/BookServlet" method="post">
		<table>
			<tr>
				<td>
				<input type="submit" value="书籍列表">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
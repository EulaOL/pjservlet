<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
	<form action="Register" method="post">
		<h1 align="center">用户注册页面</h1>
		<hr />
		<table>
			<tr>
				<td>用&nbsp;&nbsp;户&nbsp;&nbsp;名:</td>
				<td><input type="text" name="aname" id="aname"></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</td>
				<td><input type="password" name="apassword" id="apassword"></td>
			</tr>
			<tr>
				<td>确认密码:</td>
				<td><input type="password" name="relpassword" id="relpassword"></td>
			</tr>
			<tr>
			<td colspan="1"></td>
			<td>
			<input type="submit" value="注册">
			<input type="reset" value="重置">
			<a href="login.jsp" target="_blank">登录</a>
			</tr>
		</table>
	</form>
</body>
</html>
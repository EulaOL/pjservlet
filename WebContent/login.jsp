<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
	<form action="Login" method="post">
		<h1 align="center">用户登录页面</h1>
		<hr />
		<table align="center">
			<tr>
				<td>账号:</td>
				<td><input type="text" name="aname" id="aname"></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="apassword" id="apassword"></td>
			</tr>
			<tr> 
				<td colspan="1"></td>
				<td>
					<input type="submit" value="登录">
					<input type="reset" value="重置">
					<a href="register.jsp" target="_blank">注册</a>
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>
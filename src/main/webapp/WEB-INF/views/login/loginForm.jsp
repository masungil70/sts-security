<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 오그인시 오류 메시지 출력 -->
${error ? exception : ''}
<form action="/hello/login" method="post">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	아이디 : <input type="text" name="email"/><br/>
	비밀번호 : <input type="password" name="password"/><br/>
	<input type="submit" value="로그인">
</form>
</body>
</html>
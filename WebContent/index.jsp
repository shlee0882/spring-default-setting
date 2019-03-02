<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자(User) 관리 메인</h1>
	<form action="getUser.do">
		사용자 ID : <input type="text" name="id"><br/>
		<input type="submit" value="조회">
	</form>
	<hr/>
	<a href="getUserList.do">사용자 리스트</a>
</body>
</html>
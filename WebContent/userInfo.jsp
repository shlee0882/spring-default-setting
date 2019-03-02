<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사용자 상세정보</h2>
	<ul>
		<!-- user.userId는 getUserId()를 불러오는 것 get이 빠지고 메소드 호출부분이 빠짐 -->
		<li>사용자ID : ${user.userId}</li>	
		<li>이름 : ${user.name}</li>	
		<li>성별 : ${user.gender}</li>	
		<li>주소 : ${user.city}</li>	
	</ul>
</body>
</html>
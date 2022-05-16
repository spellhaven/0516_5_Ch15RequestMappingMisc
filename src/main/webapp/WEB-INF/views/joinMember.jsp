<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼을 여러 개 만들고 있으니 4월에 JSP 배우던 생각이 나</title>
</head>
<body>

	<h2>회원가입</h2>
	<hr>
	
	<form action = "memberInfo" method = "post">
		이름: <input type = "text" name = "name"> <br><br>
		나이: <input type = "text" name = "age"> <br><br>
		직업: <input type = "text" name = "job"> <br><br>
		전화번호: <input type = "text" name = "phone"> <br><br>
		
		<input type = "submit" value = "훼원정보입력">
	</form>

</body>
</html>
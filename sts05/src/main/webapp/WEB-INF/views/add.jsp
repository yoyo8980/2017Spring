<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>add page</h1>
	<form action="insert" method="post">
		<p>
			사번<input type="text" name="sabun">
		</p>
		<p>
			이름<input type="text" name="name">
		</p>
		
		<p>
			금액<input type="text" name="pay">
		</p>
		<p>
			<button type="submit">입력</button>
		</p>
	</form>
</body>
</html>
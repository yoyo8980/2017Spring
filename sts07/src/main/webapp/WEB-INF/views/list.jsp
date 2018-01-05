<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>list page</h1>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<c:forEach items="${list }" var="bean">
			<tr>
				<td><a href="detail/${bean.sabun }">${bean.sabun }</a></td>
				<td><a href="detail/${bean.sabun }">${bean.name }</a></td>
				<td><a href="detail/${bean.sabun }">${bean.nalja }</a></td>
				<td><a href="detail/${bean.sabun }">${bean.pay }</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="add">입력</a>
</body>
</html>
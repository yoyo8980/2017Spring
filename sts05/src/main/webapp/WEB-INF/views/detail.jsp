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
	<h1>${title } page</h1>
	<form action="../edit/${bean.sabun }" method="post">
		<p>
			사번 ${bean.sabun }
		</p>
		<p>
			이름<input type="text" name="name" value="${bean.name }" ${readonly }>
		</p>
		
		<p>
			날짜 ${bean.nalja }
		</p>
		
		<p>
			금액<input type="text" name="pay" value="${bean.pay }" ${readonly }>
		</p>
		<p>
		<c:if test="${title eq '수정' }"></c:if>
			<button type="submit">입력</button>
		</p>
	</form>
	<c:if test="${title eq '상세' }">
		<a href="../edit/${bean.sabun }">수정</a>
		<a href="../delete/${bean.sabun }">삭제</a>
	</c:if>
</body>
</html>
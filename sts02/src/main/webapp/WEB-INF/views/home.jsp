<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="row">
		  <div class="col-md-12">
		  	<h1>메인페이지</h1>
		  </div>
	</div>
	<div class="row">
		  <div class="col-md-12">
		  	<table class="table">
		  		<tr>
		  			<th>사번</th>
		  			<th>이름</th>
		  			<th>날짜</th>
		  			<th>금액</th>
		  		</tr>
		  		<c:forEach items="${list }" var="bean">
		  			<tr>
		  				<td><a href="#">${bean.sabun }</a></td>
		  				<td><a href="#">${bean.name }</a></td>
		  				<td><a href="#">${bean.nalja }</a></td>
		  				<td><a href="#">${bean.pay }</a></td>
		  			</tr>
		  		</c:forEach>
		  	</table>
		  </div>
	</div>
</div>
</body>
</html>
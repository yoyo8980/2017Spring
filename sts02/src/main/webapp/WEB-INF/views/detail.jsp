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
		  <div class="jumbotron">
		  	<h1>상세페이지</h1>
		  	<p>${bean.name }님의 상세페이지입니다</p>
			</div>
		  </div>
	</div>
	<div class="row">
		  <div class="col-md-12">
			  <div class="page-header">
				  <h2>${bean.name }<small>사번 ${bean.sabun }님의 정보</small></h2>
				  <p>nalja:${bean.nalja }</p>
				  <p>pay:${bean.pay }</p>
				  <p>
					  <div class="btn-group btn-group-justified" role="group" aria-label="...">
					  	<a role="button" class="btn btn-primary" href="./edit?dix=${bean.sabun }">수정</a>
					  	<a role="button" class="btn btn-danger" href="./delete?idx=${bean.sabun }">삭제</a>
						</div>
				  </p>
				</div>
		  </div>
	</div>
	</div>
</body>
</html>
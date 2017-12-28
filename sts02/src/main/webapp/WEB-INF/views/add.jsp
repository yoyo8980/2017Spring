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
		  	<h1>입력페이지</h1>
		  	<p>입력하실 내용을 작성하세요</p>
			</div>
		  </div>
	</div>
	<div class="row">
		  <div class="col-md-12">
		 	<form class="form-horizontal" method="post" action="./insert">
			  <div class="form-group">
			    <label for="sabun" class="col-sm-2 control-label">sabun</label>
			    <div class="col-sm-10">
			      <input type="text" name="sabun" class="form-control" id="sabun" placeholder="sabun">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="name" class="col-sm-2 control-label">name</label>
			    <div class="col-sm-10">
			      <input type="text" name="name" class="form-control" id="name" placeholder="name">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="pay" class="col-sm-2 control-label">pay</label>
			    <div class="col-sm-10">
			      <input type="text" name="pay" class="form-control" id="pay" placeholder="pay">
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-primary">입력</button>
			      <button type="reset" class="btn btn-warning">취소</button>
			    </div>
			  </div>
			</form>
		  </div>
	</div>
	</div>
</body>
</html>
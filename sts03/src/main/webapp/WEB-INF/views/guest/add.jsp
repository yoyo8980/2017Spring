<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="/ex03/resources/css/bootstrap.min.css" rel="stylesheet">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/ex03/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- 상단 배너 메뉴 -->
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="#">비트교육센터</a>
	    </div>
				  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav">
			        <li><a href="/ex03/">HOME <span class="sr-only">(current)</span></a></li>
			        <li class="dropdown active">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">GUEST <span class="caret"></span></a>
			          <ul class="dropdown-menu">
			            <li><a href="/ex03/guest">글목록</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="/ex03/guest/add">글작성</a></li>
			          </ul>
			        </li>
			      </ul>
			      </div>
	  </div>
	</nav>
	<!-- 내용 -->	
	<div class="container">
		<div class="row content">
		  <div class="col-md-12">
			  	<div class="jumbotron">
				  <h1>입력 페이지</h1>
				  <p>guest03 테이블에 추가</p>
				  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
				</div>
				
				
		<div class="row content">
		  <div class="col-md-12">
		  <form class="form-horizontal" method="post" >
			  <div class="form-group">
			    <label for="name" class="col-sm-2 control-label">name</label>
			    <div class="col-sm-10">
			    <div class="input-group">
			  		<span class="input-group-addon" id="basic-addon1">@</span>
			    	<input type="text" name="name" class="form-control" id="name" placeholder="name">
			    	</div>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="pay" class="col-sm-2 control-label">pay</label>
			    <div class="col-sm-10">
			      <input type="pay" name="pay" class="form-control" id="pay" placeholder="pay">
			    </div>
			  </div>
			  			  
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-primary">입력</button>
			    </div>
			  </div>
			</form>
		  
		  </div>
		 </div>
		  
		  
		  </div><!-- row content cloase -->
		</div><!-- container close -->
		
		
		<div class="row footer">
		  <div class="col-md-12">
		  비트교육센터 서울시 서초구 서초동 1327-15 비트아카데미빌딩｜ 사업자등록번호 : 214-85-24928
(주)비트컴퓨터 서초지점 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245
통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 권도혁
Copyright (c) 비트캠프 All rights reserved.
		  </div>
		</div>
	</div>
</body>
</html>

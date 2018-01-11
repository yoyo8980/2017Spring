<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="shortcut icon" href="resources/img/logo.png">
<link rel="stylesheet" type="text/css" href="resources/css/jquery.mobile-1.4.5.min.css"/>
	 <link rel="stylesheet" href="resources/css/TestTheme1.css" />
<script type="text/javascript" src="resources/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="resources/js/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
	<div data-role="page" id="main" data-theme="b">
		<div data-role="header" >
			<h1>MAIN</h1>
		</div>
		<div data-role="content" >
			<ul data-role="listview" >
				<li>
					<a href="page2">item1</a>
				</li>
				<li>
					<a href="item2">item2</a>
				</li>
				<li>
					<a href="item3">item3</a>
				</li>
				<li>
					<a href="item4">item4</a>
				</li>
			</ul>
		</div>
		<div data-role="footer" data-position="fixed" >
			<div data-role="navbar">
				<ul>
					<li><a data-icon="home" href="#">HOME</a></li>
					<li><a data-icon="grid" href="#">MENU</a></li>
					<li><a data-icon="info" href="#">INFO</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--  page2  -->
	<div data-role="page" id="page2">
		<div data-role="header" data-add-back-btn="true">
			<h1>PAGE2</h1>
		</div>
		<div data-role="content">
			<ul data-role="listview">
				<li>
					<a href="item1">item1</a>
				</li>
				<li>
					<a href="item2">item2</a>
				</li>
				<li>
					<a href="item3">item3</a>
				</li>
				<li>
					<a href="item4">item4</a>
				</li>
			</ul>
		</div>
		<div data-role="footer" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a data-icon="home" href="#">HOME</a></li>
					<li><a data-icon="grid" href="#">MENU</a></li>
					<li><a data-icon="info" href="#">INFO</a></li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
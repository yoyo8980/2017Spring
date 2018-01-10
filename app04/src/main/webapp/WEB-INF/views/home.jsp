<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/jquery.mobile-1.4.5.min.css"/>
<script type="text/javascript" src="resources/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" translate="no">
	
	
	$(document).on("mobileinit", function() {
		//console.log("defl");
		//console.log("mobileinit point");
		$(document).on("pageload", function(event,data) {
			console.log("pageload", data.dataUrl);
		});
		$(document).on("pagebeforeload", function(event,data) {
			console.log("pagebeforeload", data.dataUrl);
		});
		$(document).on("pageloadfailed", function(event,data) {
			console.log("pageloadfailed", data.dataUrl);
		});
		$(document).on("pagecreate", function() {
			console.log("pagecreate");
		});
		$(document).on("pageinit", function() {
			console.log("page init");
		});
		$(document).on("pagebeforecreate", function() {
			console.log("pagebeforecreate");
		});
		$(document).on("pageremove", function() {
			console.log("pageremove");
		});
		$(document).on("pageshow", function(event, ui) {
			console.log("window show");// 화면에 뿌려줌
		});
		$(document).on("pagebeforeshow", function(event, ui) {
			console.log("window before show");// 화면에 뿌려주기전
			console.log(ui.prevPage);
		});
		$(document).on("pagehide", function(event, ui) {
			console.log("window hide", ui.nextPage);// 화면 숨김
		});
		$(document).on("pagebeforehide", function(event, ui) {
			console.log("window before hide"); // 화면에 숨기기전
		});
	});
	/* $(document).ready(function() {
		console.log("document ready point");
	}); */
	
	
</script>
<script type="text/javascript" src="resources/js/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
	<div data-role="page" id="index">
		<div data-role="header">
			<h1>JQUERY MOBILE</h1>
		</div>
		<div data-role="content">
			<ul data-role="listview">
				<li>
					<a href="ex01">ex01</a>
				</li>
				<li>
					<a href="ex02">ex02</a>
				</li>
				<li>
					<a href="ex03">ex03</a>
				</li>
				<li>
					<a href="ex04">ex04</a>
				</li>
				<li>
					<a href="ex06">ex06</a>
				</li>
				<li>
					<a href="ex07">ex07</a>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>
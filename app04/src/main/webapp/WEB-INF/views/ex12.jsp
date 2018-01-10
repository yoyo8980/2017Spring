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
<script type="text/javascript" src="resources/js/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript">
	$(function() {
		if(window.orientation==0){
			$("#thumb").attr('src', 'resources/img/11.jpg');
		}else{
			$("#thumb").attr('src', 'resources/img/22.jpg');
		}
		$(window).on('orientationchange', function(e) {
			//console.log('가로세로 바꿈');
			if(e.orientation=="portrait"){
				$("#thumb").attr('src', 'resources/img/11.jpg');
			}else{
				$("#thumb").attr('src', 'resources/img/22.jpg');
			}
		});
	});
</script>
</head>
<body>
	<div data-role="page" id="index">
		<div data-role="header">
			<h1>JQUERY MOBILE</h1>
		</div>
		<div data-role="content">
			<img alt="" id="thumb" src="">
		</div>
		<div data-role="footer" data-position="fixed">
			<h2>page12</h2>
		</div>
	</div>
</body>
</html>
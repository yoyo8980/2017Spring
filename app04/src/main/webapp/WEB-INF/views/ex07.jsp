<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div data-role="page" id="ex07">
	<div data-role="header">
		<h1>ex07 page</h1>
	</div>
	<div data-role="content">
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
	</div>
	<script type="text/javascript">
			/* $("#ex07>div").eq(1).on("tap", function() {
				console.log("누름");
			});
			$("#ex07>div").eq(1).on("taphold", function() {
				console.log("계속누름");
			});
			$("#ex07>div").eq(1).on("swipe", function() {
				console.log("재낌");
			}); */
			$("#ex07>div").eq(1).on("swiperight", function() {
				console.log("오른쪽재낌");
			});
			$("#ex07>div").eq(1).on("swipeleft", function() {
				console.log("왼쪽재낌");
			});
	</script>
	
</div>
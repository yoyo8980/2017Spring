<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div data-role="page" id="ex05">

	<div data-role="header" data-add-back-btn="true">
		<h1>ex06 page</h1>
	</div>
	<div data-role="content">
		<a href="#">go ex05</a>
		<script type="text/javascript">
			$('a').click(function() {
				$.mobile.changePage("ex05", {
					'transition':'slide'
					,'reverse':'true'
				});
			});
		</script>
	</div>

</div>
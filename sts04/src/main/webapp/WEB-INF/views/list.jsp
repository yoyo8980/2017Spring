<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.popup{
		background-color: skyblue;
		width: 500px;
		height: 400px;
		border: 1px solid skyblue;
		position: absolute;
		top: 100px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	
	$(function() {
		
		$('#detail button').eq(1).click(function() {
			$.ajax({
				'url': $('#detail .bean').eq(0).text()
				,'method' : 'DELETE'
				,'success': function() {
					window.location.reload();
				}
			});
		});
		
		
		$('#update form').submit(function() {
			var param=$( this ).serialize();//+'&_method=put';
			//alert($('#detail .bean').eq(0).text());
			alert(param);
			$.ajax({
				'url': $('#detail .bean').eq(0).text()
				,'method':'POST'
//				,'method':'PUT'
				,'data': param
				,'success': function(){
					window.location.reload();
				}
			});
			return false;
		});
		
		
		$('#detail button').eq(0).click(function() {
			$('#detail').hide();
			
			$.ajax({
				'url': $('#detail .bean').eq(0).text()
				,'method': 'GET'
				,'error':function(xhr,textStatus,errorThrown){
					alert(textStatus);
				}
				,'dataType':'json'
				,'success': function(data) {
					/* alert(data.root[0].sabun); */
					$('#update').show();
					$('#update .bean').eq(0).text(data.root[0].sabun);
					$('#update .bean').eq(1).val(data.root[0].sabun);
					$('#update .bean').eq(2).val(data.root[0].name);
					$('#update .bean').eq(3).text(data.root[0].nalja);
					$('#update .bean').eq(4).val(data.root[0].pay);
				}
			});
			
		});
		
		
		
		$('table a').click(function() {
			/* $.getJSON($(this).attr('href')); */
			$.ajax({
				'url':$(this).attr('href')
				,'method': 'GET'
				,'error':function(xhr,textStatus,errorThrown){
					alert(textStatus);
				}
				,'dataType':'json'
				,'success': function(data) {
					/* alert(data.root[0].sabun); */
					$('#detail').show();
					$('#detail .bean').eq(0).text(data.root[0].sabun);
					$('#detail .bean').eq(1).text(data.root[0].name);
					$('#detail .bean').eq(2).text(data.root[0].nalja);
					$('#detail .bean').eq(3).text(data.root[0].pay);
				}
			});
			return false;
		});
		
		
		$('.popup').hide();
		
		$('#btn').click(function () {
			$('#add').show();
		});
		$('#add>form').submit(function() {
			
			var param=$(this).serialize();
			$.ajax({
				'method':'POST',
				'data': param,
				'success' : function() {
					window.location.reload();
				}
			});
			return false;
		});
	});
</script>
</head>
<body>
	<div class="popup" id="update">
		<h1>수정페이지</h1>
		<form>
		<input type="hidden" name="_method"  value="PUT" />
			<p>
				<label for="sabun">사번</label>
				<span class="bean"></span>
				<input type="hidden" name="sabun" id="sabun" class="bean"/>
			</p>
			<p>
				<label for="name">이름</label>
				<input type="text" name="name" id="name" class="bean"/>
			</p>
			<p>
				<span>날짜</span>
				<span class="bean"></span>
			</p>
			<p>
				<label for="pay">금액</label>
				<input type="text" name="pay" id="pay" class="bean"/>
			</p>
			<p>
				<button type="submit">수정</button>
			</p>
		</form>
	</div>

	<div class="popup" id="detail">
		<h1>상세페이지</h1>
			<p>
				<span>사번</span>
				<span class="bean"></span>
				
			</p>
			<p>
				<span>이름</span>
				<span class="bean"></span>
			</p>
			<p>
				<span>날짜</span>
				<span class="bean"></span>
			</p>
			<p>
				<span>금액</span>
				<span class="bean"></span>
			</p>
			<p>
				<button>수정</button>
				<button>삭제</button>
			</p>
	</div>
	<div class="popup"  id="add">
		<h1>add page</h1>
		<form>
			<div>
				<label for="sabun">sabun</label>
				<input type="text" name="sabun" id="sabun"/>
			</div>
			<div>
				<label for="name">name</label>
				<input type="text" name="name" id="name"/>
			</div>
			<div>
				<label for="pay">pay</label>
				<input type="text" name="pay" id="pay"/>
			</div>
			<div>
				<button type="submit">입력</button>
			</div>
		</form>
	</div>
	
	
	<h1>list page</h1>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<c:forEach items="${list }" var="bean">
			<tr>
				<td><a href="${bean.sabun }">${bean.sabun }</a></td>
				<td><a href="${bean.sabun }">${bean.name }</a></td>
				<td><a href="${bean.sabun }">${bean.nalja }</a></td>
				<td><a href="${bean.sabun }">${bean.pay }</a></td>
			</tr>
		</c:forEach>
	</table>
	<button  id="btn">입력</button>
</body>
</html>
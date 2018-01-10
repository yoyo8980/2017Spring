<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div data-role="page" id="ex01">
	<div data-role="header">
		<h1>폼 기능</h1>
		<a href="#" data-rel="back">BACK</a>
	</div>
	<div data-role="content">
		<form>
			<div data-role="fieldcontain">
				<label for="name">name</label>
				<input type="text" id="name">
			</div>
			<div data-role="fieldcontain">
				<label for="sabun">sabun</label>
				<input type="number" id="sabun">
			</div>
			<div data-role="fieldcontain">
				<label for="pw">pw</label>
				<input type="password" id="pw">
			</div>
			<div data-role="fieldcontain">
				<label for="age">age</label>
				<input type="range" min="1" max="100" value="50" id="age">
			</div>
			<div data-role="fieldcontain">
				<label for="email">email</label>
				<input type="email" id="email">
			</div>
			<div data-role="fieldcontain">
				<label for="homepage">homepage</label>
				<input type="url" id="homepage">
			</div>
			<div data-role="fieldcontain">
				<label for="tel">tel</label>
				<input type="tel" id="tel">
			</div>
			<div data-role="fieldcontain">
				<label for="hobby">hobby</label>
				<select id="hobby" data-native-menu="false">
					<option value="item1">야구</option>
					<option value="item2" selected="selected">농구</option>
					<option value="item3">축구</option>
				</select>
			</div>
			<div data-role="fieldcontain">
				<fieldset data-role="controlgroup" data-role="horizontal">
				<input type="checkbox" id="ck1">
				<label for="ck1">ck1</label>
				<input type="checkbox" id="ck2">
				<label for="ck2">ck2</label>
				<input type="checkbox" id="ck3">
				<label for="ck3">ck3</label>
				</fieldset>
			</div>
			<div data-role="fieldcontain">
				<fieldset data-role="controlgroup" data-role="horizontal">
				<input type="radio" id="ral">
				<label for="ral">ral</label>
				<input type="radio" id="ra2">
				<label for="ra2">ra2</label>
				<input type="radio" id="ra3">
				<label for="ra3">ra3</label>
				</fieldset>
			</div>
			<div data-role="fieldcontain">
				<label for="toggle">toggle</label>
				<select id="toggle">
					<option value="off">off</option>
					<option value="on">on</option>
				</select>
			</div>
			<div data-role="controlgroup" data-role="horizontal">
				<input type="submit" value="전송">
				<input type="reset" value="취소">
			</div>
		</form>
	</div>
</div>
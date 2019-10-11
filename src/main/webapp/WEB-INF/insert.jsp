<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<link href="/css/css.css" rel="stylesheet">
</head>
<body>
<form action="insert.do" method="post" enctype="multipart/form-data">
		商品名称:<input type="text" name="gzname"><br><br>
		英文名称:<input type="text" name="gyname"><br><br>
		商品品牌:
		<select name="bid">
			<c:forEach var="br" items="${b}">
			<option value="${br.bid}">${br.bname}</option>
			</c:forEach>
		</select>
		<br><br>
		
		商品种类:
		<select name="zid">
			<c:forEach var="kd" items="${k}">
			<option value="${kd.zid}">${kd.zname}</option>
			</c:forEach>
		</select>
		<br><br>
		尺寸:<input type="text" name="sice"><br><br>
		单价(元):<input type="text" name="prize"><br><br>
		数量:<input type="text" name="shu"><br><br>
		标签:<input type="text" name="biao"><br><br>
		商品图片上传:<input type="file" name="file"><br><br>
		<input type="submit" value="保存">
	</form>
	
</body>
</html>
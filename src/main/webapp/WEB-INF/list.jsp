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
<form action="select.do" method="post">
	<table>
	  <tr>
	    <th>选择</th>
	    <th>商品图片</th>
	    <th>商品名称</th>
	    <th>商品品牌</th>
	    <th>商品种类</th>
	    <th>尺寸</th>
	    <th>单价(元)</th>
	    <th>数量</th>
	    <th>标签</th>
	    <th>操作</th>
	  </tr>
	  <c:forEach var="g" items="${page.list}">
	  <tr>
	    <td><input type="checkbox" value="${g.gid}"></td>
	    <td><img src="${g.img}" width="140" height="100"></td>
	    <td>${g.gzname}/${g.gyname}</td>
	    <td>${g.bname}</td>
	    <td>${g.zname}</td>
	    <td>${g.sice}</td>
	    <td>${g.prize}</td>
	    <td>${g.shu}</td>
	    <td>${g.biao}</td>
	    <td>
	    	 <a href="selGoods.do?gid=${g.gid}"><input type="button" value="详情"></a>
	    	<a href="toUpdate.do?gid=${g.gid}"><input type="button" value="修改"></a>
	    </td>
	  </tr>
	  </c:forEach>
	</table>
	 <a href="insert.do"><input type="button" value="添加"></a>
	<input type="button" value="批量删除" onclick="del()">
	<button name="pageNum" value="1">首页</button>
	<button name="pageNum" value="${page.prePage == 0 ? 1 : page.prePage}">上一页</button>
	<button name="pageNum" value="${page.nextPage == 0 ? page.lastPage : page.nextPage}">下一页</button>
	<button name="pageNum" value="${page.lastPage}">尾页</button>
	当前第${page.pageNum}页/总共${page.lastPage}页 
	</form>
	
</body>
</html>
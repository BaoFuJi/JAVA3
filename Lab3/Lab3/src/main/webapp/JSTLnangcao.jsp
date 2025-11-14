<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<%@ taglib uri="jakarta.tags.functions" prefix="fn" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>c:set là khai báo biến</h1>
	<c:set var="anh" value="${lan }"></c:set>
	<fmt:formatNumber value="${anh }" pattern="#,##0"></fmt:formatNumber>
	${anh}
	<hr>
	<h1>c:if</h1>
	<c:if test="${lan>=100 }"> Lan già rùi</c:if>
	<c:if test="${lan>=50 }"> Lan trung niên</c:if>
	<c:if test="${lan<20 }">Lan còn trẻ </c:if>
	<br>
	<h1>c:choose: giống như switch case</h1>
	<c:choose>
		<c:when test="${lan>=100 }">Lan già rùi</c:when>
		<c:when test="${lan>=50 }">Lan trung niên</c:when>
		<c:otherwise>Lan còn trẻ</c:otherwise>
	</c:choose>

	<hr>
	<table>
		<thead>
			<tr>
				<th>Số thứ tự</th>
				<th>Tên</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bien" items="${ds}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<!-- Số thứ tự bắt đầu từ 1 -->
					<td>${bien}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<center>
		<table border="1">
			<thead>
				<tr>
					<th>Tên sản phẩm</th>
					<th>Hình ảnh</th>
					<th>Giá</th>
					<th>Khuyến mãi</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
					<tr>
						<td>${item.name}</td>
						<!-- Tên sản phẩm -->

						<td>
							<!-- Hình ảnh --> <img
							src="${pageContext.request.contextPath}/images/${item.image}"
							alt="${item.name}" width="100" />
						</td>

						<td><fmt:formatNumber value="${item.price}" type="currency"
								currencySymbol="₫" /></td>

						<td><fmt:formatNumber value="${item.discount * 100}" type="number" />%</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>


</body>
</html>
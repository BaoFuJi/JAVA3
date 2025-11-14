<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>C: set --- khai báo biến</h1>
<c:set var="ha" value="${lan}"></c:set>
<fmt:formatNumber value="${ha}" pattern="#,##0"></fmt:formatNumber>
</body>
</html>
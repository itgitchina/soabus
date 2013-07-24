<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<c:if test="${errorNo == '-2' }">
	<meta http-equiv="Refresh" content="5">
</c:if>

</head>

<body>
	<p>${errorMessage}</p>
</body>
</html>

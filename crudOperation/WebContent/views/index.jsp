<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="./assets/css/style.css" type="text/css">
</head>
<body>
	<div class="student-list">
		<h1 class="main-heading">STUDENT LIST</h1>
		<div class="table-box">
			<div class="table-row table-head">
				<div class="table-cell">
					<p>Name</p>
				</div>
				<div class="table-cell">
					<p>Email</p>
				</div>
				<div class="table-cell">
					<p>Department</p>
				</div>
				<div class="table-cell">
					<p>DOB</p>
				</div>
			</div>
			<c:forEach items="${list}" var="student">
				<div class="table-row">
					<div class="table-cell">
						<p>${student.name}</p>
					</div>
					<div class="table-cell">
						<p>${student.email}</p>
					</div>
					<div class="table-cell">
						<p>${student.department}</p>
					</div>
					<div class="table-cell last-cell">
						<p>${student.dob}</p>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>

</body>
</html>
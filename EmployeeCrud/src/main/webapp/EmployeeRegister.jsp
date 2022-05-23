
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<html:form action="register">
			<html:textfield name="employeeId" label="Employee Id"></html:textfield>
			<html:textfield name="employeeName" label="Employee Name"></html:textfield>
			<html:textfield name="employeeFatherName"
				label="Employee Father Name"></html:textfield>
			<html:textfield name="employeeTechnology" label="Technology"></html:textfield>
			<html:textfield name="employeeAddress" label="Employee Address"></html:textfield>
			<html:textfield name="employeePassword" label="Employee Password"></html:textfield>
			<html:submit value="save"></html:submit>
		</html:form>
	</center>
	<a href="EmployeeDetails"><button class="button-report"
			type="button">Employee Details</button></a>
</body>
</html>
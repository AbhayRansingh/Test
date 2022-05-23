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
	<table>
		<thead>
			<tr style="background-color: #E0E0E1;">
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Father Name</th>
				<th>Employee Technology</th>
				<th>Employee Address</th>
				<th>Employee Password</th>
				<th>Action</th>
			</tr>
		</thead>
		<html:iterator value="employeebeanList">
			<tr>
				<td><html:property value="employeeId" /></td>
				<td><html:property value="employeeName" /></td>
				<td><html:property value="employeeFatherName" /></td>
				<td><html:property value="employeeTechnology" /></td>
				<td><html:property value="employeeAddress" /></td>
				<td><html:property value="employeePassword" /></td>
				<td><a
					href="updaterecord.action?submitType=updatedata&employeeId=<html:property value="employeeId"/>">
						<button class="button-update">Update</button>
				</a> <a
					href="deleterecord.action?employeeId=<html:property value="employeeId"/>">
						<button class="button-delete">Delete</button>
				</a></td>
			</tr>
		</html:iterator>
	</table>

</body>
</html>
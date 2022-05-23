<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="html"%>
<html>
<head>
<title>Update</title>
</head>
<body>
	<h2>Update Employee Data</h2>
	<form action=updaterecord method="post">
		<pre>
<b>Employee ID:         </b><input type="number" name="employeeId"
				value='<html:property value="employeeId"/>'>
<b>Employee Name:         </b><input type="text" name="employeeName"
				value='<html:property value="employeeName"/>'>
<b>Employee Father Name:        </b><input type="text"
				name="employeeFatherName"
				value='<html:property value="employeeFatherName"/>'>
<b>Employee Technology:  </b><input type="text"
				name="employeeTechnology"
				value='<html:property value="employeeTechnology"/>'>
<b>Employee Address:         </b><input type="text"
				name="employeeAddress"
				value='<html:property value="employeeAddress"/>'>
<b>Employee Password:     </b><input type="password" name="employeePassword"
				value='<html:property value="employeePassword"/>'>
		
		


		
		<button name="submitType" value="update" type="submit">Update</button>
		</pre>
	</form>
	<html:if test="ctr>0">
		<span style="color: red;"><html:property value="message" /></span>
	</html:if>
	<html:else>
		<span style="color: red;"><html:property value="message" /></span>
	</html:else>
</body>
</html>
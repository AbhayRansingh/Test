package bip.action;

import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

import bip.dao.UpdateEmployeeDetails;

public class EmployeeUpdateAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String employeeName;
	private String employeeFatherName;
	private String employeeTechnology;
	private String employeeAddress;
	private String employeePassword;
	private String message = "";
	ResultSet resultSet = null;
	String submitType;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeFatherName() {
		return employeeFatherName;
	}

	public void setEmployeeFatherName(String employeeFatherName) {
		this.employeeFatherName = employeeFatherName;
	}

	public String getEmployeeTechnology() {
		return employeeTechnology;
	}

	public void setEmployeeTechnology(String employeeTechnology) {
		this.employeeTechnology = employeeTechnology;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}

	UpdateEmployeeDetails updateEmployeeDetails = new UpdateEmployeeDetails();
	
	public String execute() {
		try {
			if(submitType.equals("updatedata")) {
				resultSet=updateEmployeeDetails.getEmployeeData(employeeId);
				if(resultSet!=null) {
					while(resultSet.next()) {
						employeeId=resultSet.getInt("employeeid");
						employeeName=resultSet.getString("employeename");
						employeeFatherName=resultSet.getString("employeefathername");
						employeeTechnology=resultSet.getString("employeetechnology");
						employeeAddress=resultSet.getString("employeeaddress");
						employeePassword=resultSet.getString("employeepassword");
					}
				}
			}else {
				int row=updateEmployeeDetails.updateUserDetails(employeeId, employeeName, employeeFatherName, employeeTechnology, employeeAddress, employeePassword);
				if(row>0) {
					message="Update Successfully";
				}else {
					message="Error";
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Update";
	}

}

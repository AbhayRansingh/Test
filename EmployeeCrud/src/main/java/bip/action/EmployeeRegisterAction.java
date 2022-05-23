package bip.action;

import bip.dao.EmployeeRegister;

public class EmployeeRegisterAction {

	private int employeeId;
	private String employeeName;
	private String employeeFatherName;
	private String employeeTechnology;
	private String employeeAddress;
	private String employeePassword;
	private String message = "";
	int rowAffect = 0;

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

	public int getRowAffect() {
		return rowAffect;
	}

	public void setRowAffect(int rowAffect) {
		this.rowAffect = rowAffect;
	}
	
	public String execute() {
		EmployeeRegister employeeRegister=new EmployeeRegister();
		
		try {
			rowAffect=employeeRegister.registerUser(employeeId, employeeName, employeeFatherName, employeeTechnology, employeeAddress, employeePassword);
			if(rowAffect>0) {
				message="Data Insert Successfully";
			}else {
				message="Something Error Happen";
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Register";
	}

}

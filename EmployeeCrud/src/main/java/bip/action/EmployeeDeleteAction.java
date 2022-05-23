package bip.action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import bip.dao.DBConnection;
import bip.dao.DeleteEmployeeRecord;

public class EmployeeDeleteAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	int employeeId;
	String message;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	DeleteEmployeeRecord deleteEmployeeRecord = new DeleteEmployeeRecord();

	public String execute() throws SQLException, Exception {
		int isDeleted = deleteEmployeeRecord.deleteEmployeeDetail(employeeId);
		if (isDeleted > 0) {
			message = "Record deleted successfully";
		} else {
			message = "Some Error Find in console";
		}
		return "Delete";
	}

}

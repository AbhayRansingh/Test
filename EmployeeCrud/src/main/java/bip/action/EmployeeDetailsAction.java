package bip.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import BeanFile.Employee;
import bip.dao.EmployeeDetails;

public class EmployeeDetailsAction extends ActionSupport{
	
	ResultSet resultSet = null;
	Employee employeeBean = null;
	List<Employee> employeebeanList = null;
	
	

	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		try {
			employeebeanList = new ArrayList<Employee>();
			EmployeeDetails employeeDetails=new EmployeeDetails();
			resultSet = employeeDetails.displyEmployeeDetails();
			int rowAffect = 0;
			if (resultSet != null) {
				while (resultSet.next()) {
					rowAffect++;
					employeeBean = new Employee();
					/* employeeBean.setSrNo(i); */
					employeeBean.setEmployeeId(resultSet.getInt("employeeid"));
					employeeBean.setEmployeeName(resultSet.getString("employeename"));
					employeeBean.setEmployeeFatherName(resultSet.getString("employeefathername"));
					employeeBean.setEmployeeTechnology(resultSet.getString("employeetechnology"));
					employeeBean.setEmployeeAddress(resultSet.getString("employeeaddress"));
					employeeBean.setEmployeePassword(resultSet.getString("employeepassword"));
					employeebeanList.add(employeeBean);
				}
			}
			if (rowAffect == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REPORT";
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	public List<Employee> getEmployeebeanList() {
		return employeebeanList;
	}

	public void setEmployeebeanList(List<Employee> employeebeanList) {
		this.employeebeanList = employeebeanList;
	}

	
}

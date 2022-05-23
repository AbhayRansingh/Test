package bip.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDetails {

	public ResultSet displyEmployeeDetails() throws SQLException, Exception {
		ResultSet resultSet = null;
		try {
			String sql = "SELECT employeeid,employeename,employeefathername,employeetechnology,employeeaddress,employeepassword FROM EMPLOYEE";
			PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			return resultSet;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (DBConnection.getConnection() != null) {
				DBConnection.getConnection().close();
			}
		}
	}
}

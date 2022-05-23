package bip.dao;

import java.sql.PreparedStatement;

public class EmployeeRegister {

	public int registerUser(int employeeid, String employeename, String employeefathername, String employeetechnology , String employeeaddress, String employeepassword)
			throws Exception {
		int rows = 0;
		try {
			String sql = "INSERT INTO EMPLOYEE VALUES (?,?,?,?,?,?)";
			PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, employeeid);
			preparedStatement.setString(2, employeename);
			preparedStatement.setString(3, employeefathername);
			preparedStatement.setString(4, employeetechnology);
			preparedStatement.setString(5, employeeaddress);
			preparedStatement.setString(6, employeepassword);
			rows = preparedStatement.executeUpdate();
			return rows;
		} catch (Exception e) {
			e.printStackTrace();
			return rows;
		} finally {
			if (DBConnection.getConnection() != null) {
				DBConnection.getConnection().close();
			}
		}
	}

}

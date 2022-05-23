package bip.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateEmployeeDetails {

	//First Get The Record 
	public ResultSet getEmployeeData(int employeeId) throws SQLException, Exception {
		ResultSet resultSet=null;
		String sql= "select employeeid,employeename,employeefathername,employeetechnology,employeeaddress,employeepassword from employee where employeeid=?";
		PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(sql);
		preparedStatement.setInt(1, employeeId);
		resultSet=preparedStatement.executeQuery();
		return resultSet;
	}
	
	//Then update the record
	public int updateUserDetails(int employeeId,String employeeName, String employeeFatherName, String employeeTechnology, String employeeAddress, String employeePassword)
			throws SQLException, Exception {
		DBConnection.getConnection().setAutoCommit(false);
		int row = 0;
		try {
			String sql = "UPDATE employee SET employeename=?,employeefathername=?,employeetechnology=? ,employeeaddress=?,employeepassword=? WHERE employeeid=?";
			PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, employeeName);
			preparedStatement.setString(2, employeeFatherName);
			preparedStatement.setString(3, employeeTechnology);
			preparedStatement.setString(4, employeeAddress);
			preparedStatement.setString(5, employeePassword);
			preparedStatement.setInt(6, employeeId);
			row = preparedStatement.executeUpdate();
			return row;
		} catch (Exception e) {
			e.printStackTrace();
			DBConnection.getConnection().rollback();
			return 0;
		} finally {
			if (DBConnection.getConnection() != null) {
				DBConnection.getConnection().close();
			}
		}
	}
}

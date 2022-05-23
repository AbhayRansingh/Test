package bip.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployeeRecord {

	public int deleteEmployeeDetail(int employeeId) throws SQLException, Exception {
		DBConnection.getConnection().setAutoCommit(false);
		int row=0;
		String sql="DELETE FROM employee WHERE employeeid=?";
		PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(sql);
		preparedStatement.setInt(1, employeeId);
		row=preparedStatement.executeUpdate();
		return row;
	}
}

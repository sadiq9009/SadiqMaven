package FullStack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBase3 extends SadiqData{

	public DataBase2 getEmployee(int emp_id) {
		
		DataBase2 DB2 = new DataBase2();

		
		 try {
				Statement stmt = getConnection().createStatement(); 
				ResultSet  rs = stmt.executeQuery("select * from employees where Employee_id=" +emp_id);
				while(rs.next()) {
					DB2.setEmployee_id(rs.getInt("Employee_id"));
					DB2.setFirst_name(rs.getString("FIRST_NAME"));
					DB2.setLast_name(rs.getString("LAST_NAME"));
					DB2.setEmail(rs.getString("EMAIL"));
					DB2.setPhone(rs.getString("PHONE"));
					DB2.setJob_title(rs.getString("JOB_TITLE"));
					DB2.setHire_date(rs.getDate("HIRE_DATE").toLocalDate());
					DB2.setManager_id(rs.getInt("MANAGER_ID"));
										
				}
			
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		closeConnection();
	}
return DB2;
	}
	
	
  
    
    }


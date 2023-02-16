package FullStack;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SadiqData {
	
	private static final String url="jdbc:oracle:thin:@microcareacademydb_high?TNS_ADMIN=C://Users//DEII//Downloads//Wallet_MicrocareAcademyDB";
    
	 private static final String Username="ADMIN";
	 
	 private static final String Password="Muzammil073#";
	 
	 protected static String instemp="insert into employees values((select max(employee_id)+1 from employees),"
	    		+ "FIRST_NAME,LAST_NAME,EMAIL,PHONE,HIRE_DATE,10,JOB_TITLE,SALARY)";
	 
	    protected static final String udpemployee ="update employees set FIRST_NAME= where employee_id=?";
	    protected static final String deleteEmployee ="delete from employees where email=?";
	 
	 private Connection conn;
	 
	 static {
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	 public Connection getConnection() {
		 
		 try {
		 conn = DriverManager.getConnection(url, Username, Password);
		 }catch (SQLException e) {
				e.printStackTrace();
			}
		return conn;
			  }
	 
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	


}

package FullStack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InsertData extends SadiqData {

	  public List<DataBase2> getEmployees(){
	    	List<DataBase2> employees = new ArrayList<DataBase2>();
	    	DataBase2 emp;
			
			try {
	            
				Statement stmt =getConnection().createStatement();
			ResultSet rs =stmt.executeQuery("select * from employees");			
				while(rs.next()) {
					emp=new DataBase2();
					emp.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
					emp.setFirst_name(rs.getString("FIRST_NAME"));
					emp.setLast_name(rs.getString("LAST_NAME"));
					emp.setPhone(rs.getString("PHONE"));
					emp.setEmail(rs.getString("EMAIL"));
					emp.setJob_title(rs.getString("JOB_TITLE"));
					emp.setHire_date(rs.getDate("HIRE_DATE").toLocalDate());
					emp.setManager_id(rs.getInt("MANAGER_ID"));
					employees.add(emp);
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
	return employees;
	    	
	    	
	    }
	    
	    public int insertEmployee(DataBase2 emp) {
	    	
	    	int result=0;
	try {
		
		if(emp!=null) {
			instemp =instemp.replace("FIRST_NAME", "'"+emp.getFirst_name()+"'")
			.replace("LAST_NAME", "'"+emp.getLast_name()+"'")
			.replace("EMAIL", "'"+emp.getEmail()+"'")
			.replace("PHONE", "'"+emp.getPhone()+"'")
			.replace("HIRE_DATE","sysdate")
			.replace("JOB_TITLE", "'"+emp.getJob_title()+"'").replace("SALARY",Long.toString(emp.getSalary()));
			System.out.println(instemp);
	            
				Statement stmt =getConnection().createStatement();
			result =stmt.executeUpdate(instemp);
				
		}
				
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		closeConnection();
	}	
			return result;
	    	
	    }
	
	
}

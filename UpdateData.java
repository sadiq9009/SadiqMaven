package FullStack;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData extends SadiqData {

	  public int updateEmployee(DataBase2 emp) {
	    	int result=0;
	try {
	            //update employees set first_name=? where empl_id=?
				PreparedStatement preparestmt = getConnection().prepareStatement(udpemployee);
				//
				preparestmt.setString(1, emp.getFirst_name());
				//	update employees set first_name='microcare' where empl_id=?
				preparestmt.setInt(2, emp.getEmployee_id());
//					update employees set first_name='microcare' where empl_id=353523
				//preparestmt.setString(3, emp.getLast_name());
				
					 result =preparestmt.executeUpdate();
				
				
			
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeConnection();
			}
	return result;
	    	
	    	
	    	
	    }
	
}

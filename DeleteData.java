package FullStack;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData extends SadiqData {

	   public int deleteEmployee(String email) {
	    	int result=0;
	    	try {
	    				PreparedStatement preparestmt = getConnection().prepareStatement(deleteEmployee);
	    				preparestmt.setString(1, email);
	    			    result =preparestmt.executeUpdate();
	    			} catch (SQLException e) {
	    				e.printStackTrace();
	    			}finally {
	    				closeConnection();
	    			}
	    	return result;
	    	    	
	    	
	    	
	    }
	
}

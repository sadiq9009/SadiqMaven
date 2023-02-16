package FullStack;

import java.time.LocalDate;

public class DataBase4 {

	public static void main(String[] args) {
		//DataBase3 DB3 = new DataBase3();
		
//		System.out.println(DB3.getEmployee(55).toString());
		
		//Insert
		
		DataBase2 DBS = new DataBase2();
		
//		InsertData ID = new InsertData();
//		
//		DBS.setFirst_name("Shaik");
//		DBS.setLast_name("Shayan");
//		DBS.setEmail("shaik@gmail.com");
//		DBS.setPhone("4538276648");
//		DBS.setJob_title("Developer");
//		DBS.setManager_id(20);
//		DBS.setSalary(29000);
//		DBS.setHire_date(LocalDate.now());
//		System.out.println(ID.insertEmployee(DBS));
		
		// Update
		
		UpdateData UD = new UpdateData();
		
		DBS.setFirst_name("shaik");
		DBS.setLast_name("Shayan");
		DBS.setEmployee_id(114);
				
//		
		System.out.println(UD.updateEmployee(DBS));
		
//		DeleteData DD = new DeleteData();
//		
//		System.out.println(DD.deleteEmployee("shaik@gmail.com"));
		

	}

}

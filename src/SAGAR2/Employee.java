package SAGAR2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
public static void main(String[] args) {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/job","root","root");
		Statement st=con.createStatement();
		st.execute("Insert into employee values(70,'sagar','softwaredeveloper',45000)");
		st.execute("Insert into employee values(40,'raam','buisness analyst',40000)");
		st.execute("Insert into employee values(50,'raj','HR',35000)");
		st.execute("update employee set employeedesignation='software developer' where id=50");
		con.close();
		System.out.println("data saved");
	}
	catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}
}
}

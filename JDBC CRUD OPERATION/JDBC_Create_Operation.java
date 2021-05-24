package firstexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class example{
	public static void main(String args[])
	{
		String url="jdbc:mysql://localhost:3306/virtusa";
		String user="root";
		String password="naveen@1234";
		try
		{
		Connection connection=DriverManager.getConnection(url,user,password);
		if(connection!=null)
		{
			System.out.println("Connected");
			Statement statement=connection.createStatement();
			String query="create table EmployeeNew(emp_id int,emp_name varchar(50),emp_designation varchar(50),emp_age int,emp_salary int)";
			statement.executeUpdate(query);
			System.out.println("Table Created Successfully");
		}
		else
		{
			System.out.println("Not Connected");
		}
		connection.close();
	}
		catch(SQLException e)
		{
			System.out.println(e);
		}
}
}
		
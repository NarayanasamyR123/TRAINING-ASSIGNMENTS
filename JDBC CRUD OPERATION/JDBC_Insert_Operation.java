package firstexample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			String query="insert into EmployeeNew"
					+ "(emp_id,emp_name,emp_designation,emp_age,emp_salary)"+
					"values (?,?,?,?,?)";
			PreparedStatement prestatement=connection.prepareStatement(query);
			prestatement.setInt(1, 1001);
			prestatement.setString(2,"Narayanasamy");
			prestatement.setString(3, "Developer");
			prestatement.setInt(4, 25);
			prestatement.setInt(5, 30000);
			prestatement.executeUpdate();
			prestatement.setInt(1, 1002);
			prestatement.setString(2,"Renuga");
			prestatement.setString(3, "Developer");
			prestatement.setInt(4, 45);
			prestatement.setInt(5, 60000);
			prestatement.executeUpdate();
			prestatement.setInt(1, 1003);
			prestatement.setString(2,"Gowtham");
			prestatement.setString(3, "Tester");
			prestatement.setInt(4, 27);
			prestatement.setInt(5, 40000);
			prestatement.executeUpdate();
			prestatement.setInt(1, 1004);
			prestatement.setString(2,"Prasath");
			prestatement.setString(3, "Developer");
			prestatement.setInt(4, 46);
			prestatement.setInt(5, 70000);
			int rescount=prestatement.executeUpdate();
			if(rescount>0)
			{
			System.out.println("Inserted Successfully");
			}
			else
			{
				System.out.println("Not Inserted Successfully");
			}
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
		
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
			String query="update EmployeeNew set emp_designation=? where emp_age>=?";
			PreparedStatement prestatement=connection.prepareStatement(query);
			prestatement.setString(1, "Manager");
			prestatement.setInt(2, 40);
			int rescount=prestatement.executeUpdate();
			if(rescount>0)
			{
			System.out.println("Updated Successfully");
			}
			else
			{
				System.out.println("Not Updated Successfully");
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
		
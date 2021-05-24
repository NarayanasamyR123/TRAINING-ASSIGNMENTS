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
			String query="delete from EmployeeNew where emp_id=?";
			PreparedStatement preparestatement=connection.prepareStatement(query);
			preparestatement.setInt(1, 1005);
			int rescount=preparestatement.executeUpdate();
			if(rescount>0)
			{
			System.out.println("Deleted Successfully");
			}
			else
			{
				System.out.println("Not Deleted Successfully");
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
		
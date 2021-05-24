package firstexample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			String query="select * from EmployeeNew";
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(query);
			while(resultset.next())
			{
				int id=resultset.getInt(1);
				String name=resultset.getString(2);
				String designation=resultset.getString(3);
				int age=resultset.getInt(4);
				int salary=resultset.getInt(5);
				System.out.println(id+" "+name+" "+designation+" "+age+" "+salary);
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
		
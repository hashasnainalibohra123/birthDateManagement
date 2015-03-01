import java.sql.*;
import java.sql.Connection.*;
import java.sql.DriverManager.*;

class birthDateManagementDatebase
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
	
	
		}
		catch(Exception e1)
		{
			System.out.println("Failed to load Driver "+e1);
			return;
		}
		
		try
		{
		
		Connection con=DriverManager.getConnection("jdbc:odbc:birth","","");
		Statement S=con.createStatement();
		String se="create table birthMgmt (name varchar(20),mobile number,email varchar(20),DOB date);";
		S.executeQuery(se);
		
		
		
		con.close();
		}
		catch(Exception e1)
		{
			System.out.println("Failed to load Driver "+e1);
		
		}
	}
}
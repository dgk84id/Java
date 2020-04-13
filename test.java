import java.sql.*;

public class test{
	
public static void main(String[] args) {
	Connection con = null;
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.101.252:1521:orcl","system","system");
		System.out.println(con);
		PreparedStatement ps=con.prepareStatement("select * from first");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getInt(3));
			
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age"));
			System.out.println(rs.getInt("id"));
			
		}
		
		PreparedStatement ps2= con.prepareStatement("insert into first values(?,?,?)");
		ps2.setString(1, "abc");
		ps2.setInt(2, 6);
		ps2.setInt(3, 46);
		int i=ps2.executeUpdate();
		if(i==1)
			System.out.println("Inserted");
		else
			System.out.println("Failed");
		
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}
	//System.out.println("oracle connection is ="+con);
	//return con;
	}
		
		
	}

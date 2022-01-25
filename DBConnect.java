//JDBC API

//* -> All

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;

import java.util.Scanner;


public class DBConnect {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String DriverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ANNA";
		String user = "root";
		String password = "rootroot";
		
		
		try {
			//1. Load driver
			Class.forName(DriverName);
			
			//2. Getting the connection from the database
			Connection con = DriverManager.getConnection(url, user, password);
			
			//3. Create JDBC statement
			Statement stmt = con.createStatement();
			
			//4. Test connection
			
			if(con != null) {
				
				System.out.println("DB connection ok");
			}
			//5. Execute SQL statement
			//5.1 Display new employee record
			String qry1 = "select * from nemployee";
			ResultSet rs = stmt.executeQuery(qry1);
			while(rs.next()) {
				System.out.println("Nemployee id : "+rs.getInt("eid"));
				System.out.println("Nemployee name : "+rs.getString("ename"));
				System.out.println("Nemployee email : "+rs.getString("email"));
				System.out.println("Nemployee mobile : "+rs.getString("mobile"));
				System.out.println("nemployee designation : "+rs.getString("designation"));
				System.out.println("Nemployee salary : "+rs.getDouble("salary"));
			}
			System.out.println("--------------------------");
			
			//5.2 Insert new employee table
			
			System.out.println("Enter employee id : ");
			int eid = sc.nextInt();
			
			System.out.println("Enter employee name : ");
			String ename = sc.next();
		
			System.out.println("Enter employee email : ");
			String email = sc.next();
			
			System.out.println("Enter employee mobile : ");
			String mobile = sc.next();
			
			System.out.println("Enter employee designation : ");
			String designation = sc.next();
			
			System.out.println("Enter employee salary : ");
			double salary = sc.nextDouble();
			
			String qry2 = "insert into employee(eid, ename, email, mobile, designation, salary) values("+eid+","+ename+","+email+","+mobile+","+designation+","+salary+")";
			int insert_count = stmt.executeUpdate(qry2);
			if(insert_count != 1) 
			
			{
				System.out.println("Please check query....");
			}
			
			catch(Exception ex)
			
			{
				System.out.println("DB connection error");
			}
			
		
}
}

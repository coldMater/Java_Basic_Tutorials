package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String number = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		Connection con = null;
		PreparedStatement psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "system", "134149");
			
			String sql = "insert into member values(?, ?, ?)";
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, name);
			psmt.setString(2, number);
			psmt.setInt(3, age);
			
			psmt.executeUpdate();
			
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (psmt != null) psmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

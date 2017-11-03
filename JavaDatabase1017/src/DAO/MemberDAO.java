package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private int count;
	
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private Connection con = null;
	private PreparedStatement psmt = null;
	
	public int insert(Member member) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "system", "134149");
			
			String sql = "insert into member values(?, ?, ?)";
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, member.getName());
			psmt.setString(2, member.getPhoneNum());
			psmt.setInt(3, member.getAge());
			
			count = psmt.executeUpdate();
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
		return count;
	}

	public int update(Member member) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "system", "134149");
			
			String sql = "update member set PHONENUM = ?, age= ? where name = ?";
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, member.getPhoneNum());
			psmt.setInt(2, member.getAge());
			psmt.setString(3, member.getName());
			
			count = psmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (psmt != null) psmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	public int delete(String name) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "system", "134149");
			
			String sql = "delete member where name = ?";
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, name);
			
			count = psmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null) psmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}

	public ArrayList<Member> select() {
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "system", "134149");
			
			String sql = "select * from member";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				String phoneNum = rs.getString(2);
				int age = rs.getInt(3);
				list.add(new Member(name, phoneNum, age));
			}
			
			psmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null) psmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}

}

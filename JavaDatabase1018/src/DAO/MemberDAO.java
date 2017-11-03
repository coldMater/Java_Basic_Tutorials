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
	private String user = "system";
	private String password = "134149";
	private Connection con = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	public int insert(Member member) {
		
		try {
			getConnection();
			
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

	public void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, user, password);
	}

	public int update(Member member) {
		try {
			getConnection();
			
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
			getConnection();
			
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

	public ArrayList<Member> selectAll() {
		ArrayList<Member> list = new ArrayList<Member>();
		
		try {
			getConnection();
			
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

	public Member selectOneByName(String selectName) {
		Member member = null;
		
		try {
			getConnection();
			
			String sql = "select * from member where name = ?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, selectName);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				String phoneNum = rs.getString(2);
				int age = rs.getInt(3);
				member = new Member(name, phoneNum, age);
			}
			
			psmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (psmt != null) psmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return member;
	}

}

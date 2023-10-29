package com.sunbeam;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDao implements AutoCloseable {
	private Connection con;
	public UserDao() throws Exception{
		con=DUtil.getCon();
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		try{if(con!=null) {
			con.close();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public int addUser(User c) throws SQLException {
		String sql="insert into users values(default,?,?,?,?,?,0,'voter')";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, c.getFname());
			stmt.setString(2, c.getLname());
			stmt.setString(3, c.getEmail());
			stmt.setString(4, c.getPasswd());
			java.sql.Date sdate=new java.sql.Date(c.getDob().getTime());
			
			stmt.setDate(5, sdate);
			
			
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	public int modifyUser(User c)throws SQLException{
		String sql="update users set first_name=? ,last_name=?,email=?,password=?,dob=? where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, c.getFname());
			stmt.setString(2, c.getLname());
			stmt.setString(3, c.getEmail());
			stmt.setString(4, c.getPasswd());
			java.sql.Date sdate=new java.sql.Date(c.getDob().getTime());
			stmt.setDate(5, sdate);
			stmt.setInt(6, c.getId());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	public int deleteById(int id)throws SQLException {
		String sql="delete from users where id=?";
		
		try(PreparedStatement stmt =con.prepareStatement(sql)){
			stmt.setInt(1,id);
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	public List<User> displayAll()throws SQLException{
		List<User> list=new ArrayList<>();
		String sql="select * from users";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			try(ResultSet rs=stmt.executeQuery()){
				while(rs.next()) {
					User c=new User();
					c.setId(rs.getInt("id"));
					c.setFname(rs.getString("first_name"));
					c.setEmail(rs.getString("email"));
//					java.sql.Date sdate=
					java.util.Date udate=new java.util.Date(rs.getDate("dob").getTime());
					c.setDob(udate);
					list.add(c);
				}
			}
		}
		return list;
	}

}

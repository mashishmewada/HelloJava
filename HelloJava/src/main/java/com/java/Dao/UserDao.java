package com.java.Dao;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.PreparedStatement;

import com.java.entities.User;

public class UserDao {

	private Connection con;

	public UserDao(Connection con) {
		this.con = con;
	}
	
	
	//method to insert (save) user to Database...
	public boolean saveUser(User user) throws ClassNotFoundException{
		
		boolean f = false;
		
		try {
			
			//insert user details..............
			
			String query = "insert into userdetails(username,useremail,userpassword) values (?,?,?)";
			PreparedStatement pstmt = this.con.prepareStatement(query);
			
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			
			pstmt.executeUpdate();
			f = true;
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return f;
		
	}
	
	
	//get user by useremail and userpassword:
	public User getUserByEmailAndPassword(String email, String password) {
		
		User user = null;
		
		try {
			
			String query = "select * from userdetails where useremail =? and userpassword=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet set = pstmt.executeQuery();
			
			if(set.next()) {
				
				user = new User();
				
//	            data from db
				String name = set.getString("username");
				
//	            set to user object
				user.setName(name);
				
				user.setId(set.getInt("userid"));
				user.setEmail(set.getString("useremail"));
				user.setPassword(set.getString("userpassword"));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	
	}
	
	public User getUserByUserId(int userId) {
        User user = null;
        try {
            String q = "select * from user where id=?";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, userId);
            ResultSet set = ps.executeQuery();
            if (set.next()) {
                user = new User();

//             data from db
                String name = set.getString("username");
//             set to user object
                user.setName(name);

                user.setId(set.getInt("userid"));
                user.setEmail(set.getString("useremail"));
                user.setPassword(set.getString("userpassword"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
	
	public void deleteUser(int userId) {
        try {
            PreparedStatement preparedStatement = this.con.prepareStatement("delete from users where userid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    public boolean updateUser(User user) {

        boolean f = false;
        try {

            String query = "update user set username=? , useremail=? , userpassword=? where  userid =?";
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1, user.getName());
            p.setString(2, user.getEmail());
            p.setString(3, user.getPassword());
            p.setInt(4, user.getId());

            p.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    
}

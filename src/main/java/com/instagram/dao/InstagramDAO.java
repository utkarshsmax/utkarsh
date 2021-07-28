package com.instagram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.instagram.entity.InstagramUser;

public class InstagramDAO implements InstagramDAOInterface {
	
	int i;

	public int createProfileDAO(InstagramUser iu) {


		try
		{
			
			
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","utkarsh");
			
			PreparedStatement ps=con.prepareStatement("insert into instagramuser values(?,?,?,?)");
			ps.setString(1, iu.getName());
			ps.setString(2, iu.getPassword());
			ps.setString(3, iu.getEmail());
			ps.setString(4, iu.getAddress());
			
			i=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		return i;
	}

}

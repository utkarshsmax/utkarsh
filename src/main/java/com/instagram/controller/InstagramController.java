package com.instagram.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;
import com.instagram.utility.DAOFactory;

public class InstagramController implements InstagramControllerInterface {

	private BufferedReader br;
	
	public InstagramController()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	public void createProfile() {

		try
		{
			System.out.println("Enter your name=");
			String name=br.readLine();
			System.out.println("Enter your password=");
			String password=br.readLine();
			System.out.println("Enter your email=");
			String email=br.readLine();
			System.out.println("Enter your address=");
			String address=br.readLine();
			
			
			InstagramUser iu=new InstagramUser();
			iu.setName(name);
			iu.setPassword(password);
			iu.setEmail(email);
			iu.setAddress(address);
			
			
			InstagramDAOInterface id=DAOFactory.myMethod();
			int i=id.createProfileDAO(iu);
			
			if(i>0)
				System.out.print("Profile Created Succesfuly");
			else
				System.out.print("Profile Creation Failed");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		

	}

	public void loginProfile() {
		

	}

}

package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJdbc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("enter dbuser and password");
		String dbuser=sc.nextLine();
		String dbpassword=sc.nextLine();
		String query="Select* from users_info";
		try(Connection conn=DriverManager.getConnection(dbUrl,dbuser,dbpassword);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(query))
				 {
			while(rs.next()) {
				System.out.println("userid:"+rs.getInt("userid"));
				System.out.println("username:"+rs.getString("username"));
				System.out.println("Email:"+rs.getString("email"));
				System.out.println("************************************");
			}
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

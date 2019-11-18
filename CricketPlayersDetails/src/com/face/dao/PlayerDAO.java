package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.util.ConnectionManager;

import mainApp.Player;

public class PlayerDAO {
	
	
	ConnectionManager cm = new ConnectionManager();
	
	public void createplayer(Player player) throws SQLException, ClassNotFoundException
	{
		Connection conn = cm.getConnection();
		Statement statement = conn.createStatement();
		String name = player.getPlayerName();
		String country = player.getCountry();
		String skill = player.getSkill();
		String team = player.getTeam();
		statement.executeUpdate("insert into players (playername,country,skill,team) values ('"+name+"','"+country+"','"+skill+"','"+team+"')");
	    System.out.println("Insertion successful");
		String q="select * from players";
		ResultSet r1=statement.executeQuery(q);
		System.out.println("Player details:");
		if(r1.next())
		{
		do
		{
			System.out.println(r1.getString(1)+"\t\t"+r1.getString(2)+"\t\t"+r1.getString(3)+"\t\t\t"+r1.getString(4));
		}while(r1.next());
		}
		else
		{
			System.out.println("No Records found!!!");
		}
	}
	

	
	public void getPlayerDetails(String skillName) throws ClassNotFoundException, SQLException
	{
		
		Connection conn = cm.getConnection();
		Statement statement = conn.createStatement();
		String q="select * from players where skill = '"+skillName+"' ";
		ResultSet r1=statement.executeQuery(q);
		System.out.println("Player details:");
		if(r1.next())
		{
		do
		{
			System.out.println(r1.getString(1)+"\t\t"+r1.getString(2)+"\t\t"+r1.getString(3)+"\t\t\t"+r1.getString(4));
		}while(r1.next());
		}
		else
		{
			System.out.println("No Records found!!!");
		}
		
		
	}
	
	public void getAllPlayerDetails() throws Exception
	{
		Connection conn = cm.getConnection();
		Statement statement = conn.createStatement();
		String q="select * from players";
		ResultSet r1=statement.executeQuery(q);
		System.out.println("Player details:");
		if(r1.next())
		{
		do
		{
			System.out.println(r1.getString(1)+"\t\t"+r1.getString(2)+"\t\t"+r1.getString(3)+"\t\t\t"+r1.getString(4));
		}while(r1.next());
		}
		else
		{
			System.out.println("No Records found!!!");
		}
		
		
	}
}

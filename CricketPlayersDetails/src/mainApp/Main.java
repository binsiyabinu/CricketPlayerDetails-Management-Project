package mainApp;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import com.face.dao.PlayerDAO;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("main method");
		boolean i=false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("Menu\n1.List all player\n2.Add new player\n3.Search player");
		int ch = Integer.parseInt(br.readLine());
		PlayerDAO pl = new PlayerDAO();
		switch(ch)
		{//starting of  switch
		case 1:
		{
			pl.getAllPlayerDetails();//method calling to display list of all players
		}break;
		
		case 2:
		{
			Player player = new Player();
			
			System.out.println("insertion");
			System.out.println("Enter player name");
			player.setPlayerName(br.readLine());
			System.out.println("Enter the country");
			player.setCountry(br.readLine());
			System.out.println("Enter skill");
			player.setSkill(br.readLine());
			System.out.println("Enter team");
			player.setTeam(br.readLine());
			
			pl.createplayer(player); // method calling to add new element to the database
			
		}break;
		case 3:
		{
			System.out.println("Enter the skill name");
			String skillName = br.readLine();
			pl.getPlayerDetails(skillName); //method calling for displaying data based on skill name
		}break;
		}
		i=true;
		}while(i);
	}

}

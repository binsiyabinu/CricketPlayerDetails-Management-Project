package mainApp;

public class Player {
	String playerName;
	String country;
	String skill;
	String team;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public Player()
	{
		System.out.println("Default");
	}
	public Player(String playerName,String country,String skill,String team)
	{
		this.playerName = playerName;
		this.country = country;
		this.skill = skill;
		this.team = team;
	}
}

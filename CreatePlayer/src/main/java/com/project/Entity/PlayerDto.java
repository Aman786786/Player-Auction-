package com.project.Entity;

public class PlayerDto {
	
	private int PlayerId;
	private String playername;
	private int playerbudget;
	private String teamname;
	public PlayerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerDto(int playerId, String playername, int playerbudget, String teamname) {
		super();
		PlayerId = playerId;
		this.playername = playername;
		this.playerbudget = playerbudget;
		this.teamname = teamname;
	}
	public int getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getPlayerbudget() {
		return playerbudget;
	}
	public void setPlayerbudget(int playerbudget) {
		this.playerbudget = playerbudget;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

}

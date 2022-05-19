package com.project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity 
@Table(name = "players")
public class Player {
	
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PlayerId;
	private String playername;
	private int playerbudget;
	private int teamId;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerId, String playername, int playerbudget, int teamId) {
		super();
		PlayerId = playerId;
		this.playername = playername;
		this.playerbudget = playerbudget;
		this.teamId = teamId;
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
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	

}

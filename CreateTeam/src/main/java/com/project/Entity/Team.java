package com.project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "CC_Team")
public class Team {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teamId;
	private int maxBuget;
	private String teamName ;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(int teamId, int maxBuget, String teamName) {
		super();
		this.teamId = teamId;
		this.maxBuget = maxBuget;
		this.teamName = teamName;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getMaxBuget() {
		return maxBuget;
	}
	public void setMaxBuget(int maxBuget) {
		this.maxBuget = maxBuget;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
	
	

}

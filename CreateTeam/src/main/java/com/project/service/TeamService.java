package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Team;
import com.project.repository.TeamRepository;

@Service 
public class TeamService {
	
	@Autowired 
	private TeamRepository teamrepository;
	
	
	public Team saveProduct(Team team) {
		
		return teamrepository.save(team);
		
	}
	
	
	public List<Team> GetAllTeam() {
		return teamrepository.findAll();
		
	}

}

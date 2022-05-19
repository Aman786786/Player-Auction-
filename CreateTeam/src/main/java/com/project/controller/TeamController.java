package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Team;
import com.project.service.TeamService;

@RestController 
public class TeamController {
	
	@Autowired 
 private TeamService teamservice; 
	
	@PostMapping("/AddTeam")
	@CrossOrigin(origins = "http://localhost:4200")
	public Team AddTeam(@RequestBody Team team) {
		
		return teamservice.saveProduct(team);
	}
	
	@GetMapping("/GetTeam")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Team> FinsAllTeam() {
		return teamservice.GetAllTeam();
	}
}

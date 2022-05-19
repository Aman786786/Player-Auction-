package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Player;
import com.project.Entity.Team;
import com.project.services.PlayerService;
import com.project.services.ValidationStatus;

import java.util.List;

@RestController 
public class PlayerController {

	
	
	@Autowired 
	private PlayerService playerservice;
	
	
	@PostMapping("/AddPlayer")
	@CrossOrigin(origins = "http://localhost:4200")
	public ValidationStatus createPlayers(@RequestBody Player player) {
		
		return playerservice.createPlayers(player);
	}
	
	@GetMapping("/GetPlayerByTeamId/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Player> GetPlayerByTeamId(@PathVariable int id) {
		
		return playerservice.GetPlayerByTeamId(id);
	}
	
	@GetMapping("/GetPlayer/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Player> GetPlayerById(@PathVariable int id) {
		return playerservice.GetPlayerByPlayerId(id);
	}
}



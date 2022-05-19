package com.project.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Player;
import com.project.Entity.Team;
import com.project.Repository.PlayerRepository;

//import antlr.collections.List;


@Service
public class PlayerService {
	
	@Autowired 
	private PlayerRepository playerrepository;
	
	
	public ValidationStatus createPlayers(Player player) {
		List<Player> players = playerrepository.findAll();
		
		for(Player Myplayer: players) {
			if(Myplayer.getPlayername().equals(player.getPlayername())) {
				System.out.println("Player With This Name Already Exist!");
				return ValidationStatus.PLAYER_ALEREDY_EXISTS;
			}
		}
		playerrepository.save(player);
		System.out.println("New Player"+ player.getPlayername()+"Created Successfully" );
		return ValidationStatus.SUCCESS;
		
	}
	
//	public Player SavePlayer(Player player) {
//		
//		return playerrepository.save(player);
//		
//		
//		
//	}
	
	public List<Player> GetPlayerByTeamId(int id) {
		return playerrepository.findByTeamId(id);
	}

	
	public List<Player> GetPlayerByPlayerId(int id) {
		return playerrepository.findById(id);
	}

}

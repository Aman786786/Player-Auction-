package com.project.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	List<Player> findByTeamId(int id);
	List<Player> findById(int id);
}

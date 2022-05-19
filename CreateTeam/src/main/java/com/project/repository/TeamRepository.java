package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>  {
	
	

}

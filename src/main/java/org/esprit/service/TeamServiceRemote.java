package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Team;

@Remote
public interface TeamServiceRemote {
	
	public List<Team> findAll();
}

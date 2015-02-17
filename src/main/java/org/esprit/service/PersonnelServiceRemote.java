package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Personnel;

@Remote
public interface PersonnelServiceRemote {

	
	public void addPersonnel(Personnel u);
	public void updatePersonnel(Personnel u);
	public Personnel findPersonnel(int idPersonnel);
	public void deletePersonnel(int p);
	public List<Personnel> findAll();
	public Personnel findBYid(int idPersonnel);
	
	
}

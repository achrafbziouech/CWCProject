package org.esprit.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Team
 *
 */
@Entity
@Table(name = "t_team")
public class Team implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	
private int id_team;
private String team_name;


public Team() {
	super();
}



@Id
public int getId_team() {
	return id_team;
}

public void setId_team(int id_team) {
	this.id_team = id_team;
}



public String getTeam_name() {
	return team_name;
}



public void setTeam_name(String team_name) {
	this.team_name = team_name;
}





}
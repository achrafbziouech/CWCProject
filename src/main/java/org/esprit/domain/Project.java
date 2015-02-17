package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;


import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Project
 *
 */
@Entity
@Table(name="t_project")

public class Project implements Serializable {

	   
	
	private int project_id;
	private String project_name;
	private String description;
	private Date start_date;
	private Date delivery_date;
	
	private State state;

	
	
	private static final long serialVersionUID = 1L;
/**
 * 
 * 
 */

	@Id
	public int getProject_id() {
		return this.project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}   
	public String getProject_name() {
		return this.project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}   
	public Date getStart_date() {
		return this.start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}   
	public Date getDelivery_date() {
		return this.delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	@Enumerated(EnumType.STRING)
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
   
}

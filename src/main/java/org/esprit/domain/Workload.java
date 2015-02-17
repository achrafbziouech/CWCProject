package org.esprit.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Workload
 *
 */
@Entity

public class Workload implements Serializable {

	   
	@Id
	private int workload_id;
	private float working_hours;
	private float extra_hours;
	private int completed_task;
	private static final long serialVersionUID = 1L;
	@ManyToMany
	private List<Personnel> personnels;
	
	
	public Workload() {
		super();
	}   
	public int getWorkload_id() {
		return this.workload_id;
	}

	public void setWorkload_id(int workload_id) {
		this.workload_id = workload_id;
	}   
	public float getWorking_hours() {
		return this.working_hours;
	}

	public void setWorking_hours(float working_hours) {
		this.working_hours = working_hours;
	}   
	public float getExtra_hours() {
		return this.extra_hours;
	}

	public void setExtra_hours(float extra_hours) {
		this.extra_hours = extra_hours;
	}   
	public int getCompleted_task() {
		return this.completed_task;
	}

	public void setCompleted_task(int completed_task) {
		this.completed_task = completed_task;
	}
   
}

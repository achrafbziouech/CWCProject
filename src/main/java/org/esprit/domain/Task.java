package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Task
 *
 */
@Entity
@Table(name="t_task")
public class Task implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int id_task;
	private String task_name;
	private String description;
	private String durree;
	//private project project;
	/*private Date deadLine;
	private Date startDate;*/
	
	public Task() {
		super();
	}   
	@Id
	public int getId_task() {return id_task;}
	public void setId_task(int id_task) {this.id_task = id_task;}
	
	public String getTask_name() {return task_name;}
	public void setTask_name(String task_name) {this.task_name = task_name;}  
	
	public String getDescription() {return this.description;}
	public void setDescription(String description) {this.description = description;}
	/*public Date getDeadLine() {return this.deadLine;}
	public void setDeadLine(Date deadLine) {this.deadLine = deadLine;}   
	
	public Date getStartDate() {return this.startDate;}
	public void setStartDate(Date startDate) {this.startDate = startDate;}*/
	public String getDurree() {
		return durree;
	}
	public void setDurree(String durree) {
		this.durree = durree;
	}
	/*@ManyToOne
	public project getProject() {
		return project;
	}
	public void setProject(project project) {
		this.project = project;
	}*/
  
		
}
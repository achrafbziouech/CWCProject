package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Task;

@Remote
public interface TaskServiceRemote {
	public void Addtask(Task t);
	public void updateTask(Task t);
	public Task findtask(int idtask) ;
	public void deleteTask(Task t);
	public List<Task> findAll();
}

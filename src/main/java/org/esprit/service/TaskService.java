package org.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.esprit.domain.Task;

/**
 * Session Bean implementation class TaskService
 */
@Stateless
@LocalBean
public class TaskService implements TaskServiceRemote {
	@PersistenceContext
	private EntityManager em ;

    /**
     * Default constructor. 
     */
    public TaskService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void Addtask(Task t) {
		// TODO Auto-generated method stub
		em.persist(t);
		
		
	}

	@Override
	public void updateTask(Task t) {
		// TODO Auto-generated method stub
		em.merge(t);
		
	}
	public Task findtask(int idtask) {
		Task t1 = em.find(Task.class, idtask);
		return t1;
	}
	@Override
	public void deleteTask(Task t) {
		// TODO Auto-generated method stub
		em.remove(em.merge(t));
		
	}

	@Override
	public List<Task> findAll() {
		// TODO Auto-generated method stub
		Query q	=em.createQuery("Select t from Task t");
		return (List<Task>)q.getResultList();
	}

}

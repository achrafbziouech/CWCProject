package org.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esprit.domain.Activity;










/**
 * Session Bean implementation class Activities
 */
@Stateless
@LocalBean
public class Activities implements ActivitiesRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public Activities() {
        
    }
    
    public void addActivity(Activity a) {
		
		em.persist(a);
		
	}
    
    public void updateActivity(Activity a) {

		em.merge(a);
		
	}
    
    
	public Activity findActivity(int idActivity) {
		
		return em.find(Activity.class, idActivity);
		
	}

	
	public void deleteCategorie(int a) {
		//em.remove(em.find(Activity.class, a.getActivity_id()));	
		Activity	c = findActivity(a);
		em.remove(c);
		
	}
	
public List<Activity> getAllProject() {	
		
		Query q = em.createQuery("select p from Activity p ");
		return (List<Activity>) q.getResultList();
		
		//return lp;
		//return q.getResultList();
		
	}

}

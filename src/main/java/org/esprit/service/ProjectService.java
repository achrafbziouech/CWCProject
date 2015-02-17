package org.esprit.service;

import java.util.List;



import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esprit.domain.Project;


/**
 * Session Bean implementation class ProjectService
 */
@Stateless
@LocalBean
public class ProjectService implements ProjectServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;

	Project project;
    public ProjectService() {
        // TODO Auto-generated constructor stub
    	
    }

	@Override
	public void addProject(Project p) {
		// TODO Auto-generated method stub
		em.persist(p);
		
	}

	@Override
	public void updateProject(Project p) {
		// TODO Auto-generated method stub
		em.merge(p);
		
	}

	@Override
	public Project findProject(int project_id) {
		// TODO Auto-generated method stub
		return em.find(Project.class, project_id );
	}

	@Override
	public void deleteProject( Project p) {
		// TODO Auto-generated method stub
		em.remove(em.find(Project.class, p.getProject_id()));
		
	}


	@Override
	public List<Project> findAll() {
		Query query = em.createQuery("select p from Project p",Project.class);
		return (List<Project>) query.getResultList();

	
	}

	@Override
	public Project findProjectByName(String name) {
		return (Project) em.createNamedQuery("findProjectByName")
				.getResultList();
	}

	
	

}

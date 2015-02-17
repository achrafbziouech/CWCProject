package org.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esprit.domain.Project;
import org.esprit.domain.Team;

/**
 * Session Bean implementation class TeamService
 */
@Stateless
@LocalBean
public class TeamService implements TeamServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public TeamService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Team> findAll() {
		
			Query query = em.createQuery("select t from Team t");
			return (List<Team>) query.getResultList();
	}

}

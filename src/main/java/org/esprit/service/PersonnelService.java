package org.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.esprit.domain.Personnel;

/**
 * Session Bean implementation class PersonnelService
 */
@Stateless
@LocalBean
public class PersonnelService implements PersonnelServiceRemote {

	@PersistenceContext
	EntityManager em; 
    public PersonnelService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addPersonnel(Personnel u) {
		em.persist(u);
		
	}

	@Override
	public void updatePersonnel(Personnel u) {
		em.merge(u);
		
	}

	@Override
	public Personnel findPersonnel(int idPersonnel) {
		return em.find(Personnel.class,idPersonnel );
	}
		

	@Override
	public void deletePersonnel(int p) {
		Personnel personnel = findPersonnel(p);
		em.remove(personnel);
		
	}

	@Override
	public List<Personnel> findAll() {
		
		return em.createQuery("Select p from Personnel p ",Personnel.class).getResultList();
	}

	@Override
	public Personnel findBYid(int idPersonnel) {
		String jpq1="Select p from Personnel p where p.Id =:param";
		Query query =(Query) em.createQuery(jpq1);
		((javax.persistence.Query) query).setParameter("param", idPersonnel);
		
		return (Personnel) ((javax.persistence.Query) query).getSingleResult();
	}

}

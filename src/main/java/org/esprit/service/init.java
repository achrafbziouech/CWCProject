package org.esprit.service;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Startup
@Singleton
public class init {
@PersistenceContext 

EntityManager em ;
	
	@PostConstruct
	public void init()
	{/*Administrator adm = new Administrator();
	adm.setLogin_admin("oumaima");
	adm.setPassword_admin("oumaima");
		em.persist(adm);*/
		
	}
}

package org.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esprit.domain.Employee;

/**
 * Session Bean implementation class AuthEmp
 */
@Stateless
@LocalBean
public class AuthEmp implements AuthEmpRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager entityManager;
    public AuthEmp() {
        // TODO Auto-generated constructor stub
    }

    public Employee authentificate(String login, String password) {
		Employee Type = null;
		Query query = entityManager
				.createQuery("select e  from Employee e where login=:l and password=:p");
		query.setParameter("l",login).setParameter("p", password);
		try {
			Type = (Employee) query.getSingleResult();
			//if admin == director ......

		} catch (Exception e) {
			Type = null;
			// TODO: handle exception
		}
		return Type;

	}
	@SuppressWarnings("unchecked")
	public List<Employee> findByProperty(String propertyName, final Object value) {
		
		try {
			final String queryString = "select model from Employee model where model."
					+ propertyName + "= :propertyValue";
			Query query1 = entityManager.createQuery(queryString);
			query1.setParameter("propertyValue", value);
			return query1.getResultList();
		} catch (RuntimeException re) {
		
			throw re;
		}
	}

	@Override
	public Employee findByLogin(String login) {
		return findByProperty("login", login).get(0) ;
	}

	@Override
	public void update(Employee Employee) {
		entityManager.merge(Employee) ;
		
	}

	
}
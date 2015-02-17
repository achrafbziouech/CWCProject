package org.esprit.service;

import javax.ejb.Remote;


import org.esprit.domain.Employee;

@Remote
public interface AuthEmpRemote {
	public Employee authentificate(String login, String password);

	public Employee findByLogin(String login );
	
	public void update(Employee admin);
	

}

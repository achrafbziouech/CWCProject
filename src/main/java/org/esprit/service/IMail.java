package org.esprit.service;

import javax.ejb.Remote;

import org.esprit.domain.Employee;

@Remote
public interface IMail {
	
	void send(Employee p);

}


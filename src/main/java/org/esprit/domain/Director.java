package org.esprit.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Director
 *
 */
@Entity

public class Director extends Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	
	public Director() {
		super();
	}
   
}

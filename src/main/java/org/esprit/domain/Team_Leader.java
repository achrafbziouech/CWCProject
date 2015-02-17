package org.esprit.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Team_Leader _
 *
 */
@Entity

public class Team_Leader extends Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	public Team_Leader() {
		super();
	}
   
}

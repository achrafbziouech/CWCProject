package org.esprit.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.esprit.domain.Employee;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity

public class Administrator extends Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}
   
}

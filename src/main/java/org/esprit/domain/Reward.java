package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reward
 *
 */
@Entity

public class Reward implements Serializable {

	   
	@Id
	private int reward_id;
	private String reward_type;
	private static final long serialVersionUID = 1L;
	


	public Reward() {
		super();
	}   
	public int getReward_id() {
		return this.reward_id;
	}

	public void setReward_id(int reward_id) {
		this.reward_id = reward_id;
	}   
	public String getReward_type() {
		return this.reward_type;
	}

	public void setReward_type(String reward_type) {
		this.reward_type = reward_type;
	}
   
}

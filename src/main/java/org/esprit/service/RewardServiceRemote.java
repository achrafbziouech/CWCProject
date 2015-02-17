package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Reward;

@Remote
public interface RewardServiceRemote {

	public void addReward(Reward r);
	public void updateReward(Reward r);
	public Reward findReward(int reward_id);
	public void deleteReward(Reward r);
	public List<Reward> findAll();
	public Reward findRewardByName(String name);
	public List<Reward> findBestReward();


}

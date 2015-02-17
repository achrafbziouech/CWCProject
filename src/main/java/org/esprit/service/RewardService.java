package org.esprit.service;

import java.util.List;






import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esprit.domain.Reward;




/**
 * Session Bean implementation class rewardService
 */
@Stateless
@LocalBean
public class RewardService implements RewardServiceRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;

	Reward reward;
	
    public RewardService() {
    	
    }

	@Override
	public void addReward(Reward r) {
		// TODO Auto-generated method stub
		em.persist(r);
		
	}

	@Override
	public void updateReward(Reward r) {
		// TODO Auto-generated method stub
		em.merge(r);
	}

	@Override
	public Reward findReward(int reward_id) {
		// TODO Auto-generated method stub
		return em.find(Reward.class, reward_id );
	}

	@Override
	public void deleteReward(Reward r) {
		em.remove(em.find(Reward.class, r.getReward_id()));// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reward> findAll() {
		return (List<Reward>) em.createNamedQuery("findAllCategory")
				.getResultList();
	}

	@Override
	public Reward findRewardByName(String name) {
		return (Reward) em.createNamedQuery("findCategoryByName")
				.getResultList();
	}

	@Override
	public List<Reward> findBestReward() {
		return (List<Reward>) em.createNamedQuery("findBestCategory")
				.getResultList();
	}

	

}

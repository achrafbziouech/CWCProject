package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Activity;

@Remote
public interface ActivitiesRemote {

	public void addActivity(Activity c);
	public void updateActivity(Activity a);
	public Activity findActivity(int idActivity);
	public void deleteCategorie(int a);
	public  List<Activity> getAllProject();

}

package org.esprit.service;

import java.util.List;


import javax.ejb.Remote;

import org.esprit.domain.Project;


@Remote
public interface ProjectServiceRemote {
	public void addProject(Project p);
	public void updateProject(Project p);
	public Project findProject(int project_id);
	public void deleteProject(Project p);
	public List<Project> findAll();
	public Project findProjectByName(String name);

}

//Created by Giuliano Bertoti - Software Engineering class - 2020-1

package hello;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<User> users = new LinkedList<User>();
	private List<Project> projects = new LinkedList<Project>();
	
	public void addUser (User user) {
		users.add(user);
	}
	
	public void addProject(Project project) {
		projects.add(project);
	}
	
	public Project searchProjectByID(String id) {
		for(Project project:projects) {
			if(project.getId().equals(id)) return project;
		}
		return null;
	}

}

package hello;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<User> users = new LinkedList<User>();
	private List<Project> projects = new LinkedList<Project>();
	
	public void addUser (User user) {
		users.add(user);
	}
	
	
	//View is observing the Model
	public User login(String email, String password) {
		for(User user:users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) return user;
		}
		return null;
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
	
	public List<Project> searchProjectsByEmailOwner(String email){
		List<Project> projectsFound = new LinkedList<Project>();
		for(Project project: projects) {
			if(project.getEmailOwner().equals(email)) projectsFound.add(project);
		}
		return projectsFound;
	}

}

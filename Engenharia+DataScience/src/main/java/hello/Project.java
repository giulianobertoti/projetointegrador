package hello;

import java.util.List;
import java.util.LinkedList;

public class Project {
	
	private String id;
	private String emailOwner;
	private List<Task> tasks =new LinkedList<Task>(); 
	
	
	
	public Project(String id, String emailOwner) {

		this.id = id;
		this.emailOwner = emailOwner;
	}



	public void addTask(Task task) {
		tasks.add(task);
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getEmailOwner() {
		return emailOwner;
	}



	public void setEmailOwner(String emailOwner) {
		this.emailOwner = emailOwner;
	}
	
}

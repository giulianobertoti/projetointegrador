//Created by Giuliano Bertoti - Software Engineering class - 2020-1

package hello;

public class Task {
	
	private String id;
	private String name;
	private String resource;
	private int time;
	private int percentDone;
	private String dependency;
	
	
	public Task(String id, String name, String resource, int time, int percentDone, String dependency) {
		this.id = id;
		this.name = name;
		this.resource = resource;
		this.time = time;
		this.percentDone = percentDone;
		this.dependency = dependency;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getResource() {
		return resource;
	}


	public void setResource(String resource) {
		this.resource = resource;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public int getPercentDone() {
		return percentDone;
	}


	public void setPercentDone(int percentDone) {
		this.percentDone = percentDone;
	}


	public String getDependency() {
		return dependency;
	}


	public void setDependency(String dependency) {
		this.dependency = dependency;
	}
	
	
	
	

}

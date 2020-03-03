//Created by Giuliano Bertoti - Software Engineering class - 2020-1

package hello;

public class User {
	
	private String email;
	private String password;
	
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

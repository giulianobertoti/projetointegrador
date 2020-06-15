package hello;

import static spark.Spark.*;


public class MainServer {
	
	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 1234;
        }
        port(port);

		//Serve html js css files
		staticFileLocation("/static");

		inicializarCarros();

		Controller controller = new Controller(model);
		
		controller.login();
		controller.listAllProjectsByOwner(); //do not forget to call the new route here
		
    }
    
    public static void inicializarCarros(){
    	
    	
    
    	model.addUser(new User("joao@bertoti.com", "thomasandfriends"));
    	
    	
    	Task task1 = new Task("3dmodels", "Generate 3D models", "2 aeronautic people", 50, 75, null);
    	Task task2 = new Task("VR_env", "Generate 3D Env", "3 CS people", 100, 0, "3dmodels");
    	
    	Project project1 = new Project("latecoere", "joao@bertoti.com");
    	
    	project1.addTask(task1);
    	project1.addTask(task2);
    	
    	model.addProject(project1);
    }
}

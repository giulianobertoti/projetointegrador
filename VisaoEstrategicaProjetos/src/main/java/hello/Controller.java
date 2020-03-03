//Created by Giuliano Bertoti - Software Engineering class - 2020-1

package hello;

import static spark.Spark.get;



import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	//REST route using GET HTTP method to access a project and its tasks
	public void searchProject(){
		get("/project/:id", (req, res) -> {
			
			Project project = model.searchProjectByID(req.params(":id"));
			return new Gson().toJson(project);
			
		});
	}
	
}

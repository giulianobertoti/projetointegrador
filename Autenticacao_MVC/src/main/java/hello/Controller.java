package hello;


import static spark.Spark.post;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void login(){
		post("/login", (request, response) -> {
		
			response.header("Access-Control-Allow-Origin", "*");

        	
        	
	        JSONObject json = new JSONObject(request.body());
	        	
	        String email = json.getString("email");
	           
	        String password = json.getString("password");
	        
	        User user = model.login(email, password);
	        
	        //if user exists, return it
	        if(user != null) {
	        	return new Gson().toJson(user);
	        } else { //if not, return a status 0
	        	
        	    JSONObject jsonObj = new JSONObject();

        	    jsonObj.put("status", 0);
       		
            	
            	return jsonObj;
	        }
	        
	        
			
		});
	}
	

	
	

}

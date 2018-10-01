package com.avatar.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.avatar.backend.Entity.Persona;
import com.avatar.backend.Service.PersonaService;

@Controller
public class PersonaController {
	
	@Autowired
	  private PersonaService personaService;
	
	@RequestMapping(value = "/persona", method = RequestMethod.GET)		
	@ResponseBody
	public Object index(){ 
		return personaService.findAll();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)	  
	@ResponseBody
	public String create(@RequestBody Persona persona) {
		  String userId = "";
	    try {	    
	    	personaService.save(persona);
	      userId = String.valueOf(persona.getId());
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created with id = " + userId;
	  }	
	
	  @RequestMapping("/delete/{id}")
	  @ResponseBody
	  public String delete(@PathVariable long id) {
	    try {
	    	Persona user = personaService.findById(id);
	    	personaService.delete(user);
	    }
	    catch (Exception ex) {
	      return "Error deleting the user:" + ex.toString();
	    }
	    return "User succesfully deleted!";
	  }	
	  
	  @RequestMapping("/get-by-email")
	  @ResponseBody
	  public String getByName(String name) {
	    String userId = "";
	    try {
	    	Persona user = personaService.findByName(name);
	        userId = String.valueOf(user.getId());
	    }
	    catch (Exception ex) {
	      return "User not found";
	    }
	    return "The user id is: " + userId;
	  }
	  @RequestMapping("/update/{id}")
	  @ResponseBody
	  public String updateUser(@RequestBody Persona persona,@PathVariable Long id) {
		try {
	    	persona.setId(id);
	    	personaService.save(persona);
	    }
	    catch (Exception ex) {
	      return "Error updating the user: " + ex.toString();
	    }
	    return "User succesfully updated!";
	  }
	  

}

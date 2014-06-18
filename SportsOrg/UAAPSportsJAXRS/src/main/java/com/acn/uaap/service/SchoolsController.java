package com.acn.uaap.service;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Singleton
@Path("/schools")
public class SchoolsController {

	public SchoolsController(){
		//do something here
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getSchools")
	public JSONObject getSchools(){
		JSONObject obj = new JSONObject();
		
		List<String> schools = new ArrayList<String>();
		schools.add("DLSU");
		schools.add("ADMU");
		schools.add("UST");
		schools.add("UP");
		schools.add("FEU");
		schools.add("UE");
		schools.add("NU");
		
		try {
			obj.put("schools", schools);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
}

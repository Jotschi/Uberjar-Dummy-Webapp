package de.jotschi.uberjardummy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello/")
public class SimpleResource {

	@GET
	@Produces("text/plain")
	public String getGreeting() {
		return "Hi ! ";
	}

}

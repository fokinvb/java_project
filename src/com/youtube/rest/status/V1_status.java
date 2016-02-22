package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status/")
public class V1_status {

	private static final String api_version = "00.00.01";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>JAVA Web Service</p>";
	}
	
	 @Path("/version")
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String returnVersion() 
	  {
		return "<p>Version:</p>" + api_version;
	  }
	 
}

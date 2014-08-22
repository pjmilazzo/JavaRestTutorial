package org.paul.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * This is a the root path for our restful api service
 * In the web.xml file, we specified that /api/* needs to be in the URL to
 * get to this class.
 * 
 * We are versioning the class in the url path .
 * 
 * Example how to get to this root of this api resource:
 * http://localhost:8080/JavaRestTutorial/api/v1/status
 * 
 * @author paul.j.milazzo
 *
 */

@Path("/v1/status")
public class Status {
	
	private static final String api_version = "1.0";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}

	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		return "<p>Version:  " + api_version + "</p>";
	}
	


}

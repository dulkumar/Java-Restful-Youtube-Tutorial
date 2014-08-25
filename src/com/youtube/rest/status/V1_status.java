package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status
{
	private static final String API_VERSION	 = "00.01.00";
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return "<p>Java Rest Service POW!</p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion()
	{
		return "<p>Version:</p>" + API_VERSION;
	}
}

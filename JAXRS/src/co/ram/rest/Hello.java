package co.ram.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayString()
	{
		return "Hello from Jersy..";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello()
	{
		return "<html<body><h3>Hello from Jersy..<h3></body></html>";
	}
}


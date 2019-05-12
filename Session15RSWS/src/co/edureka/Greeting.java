package co.edureka;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.servlet.ServletContainer;

@Path("/greeting")
public class Greeting { // Greeting Class shall represent WebService
	
	//ServletContainer : Configure this Servlet in web.xml file | Jersey REST specs :)

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){ // Web Methods 
		Date date = new Date();
		String plainResponse = "Plain Hello from Greeting Web Service :) on "+date;
		return plainResponse;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		Date date = new Date();
		String htmlResponse = "<html><body><h3>HTML Hello from Greeting Web Service :) on "+date+"</h3></body></html>";
		return htmlResponse;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		Date date = new Date();
		String xmlResponse = "<?xml version='1.0' encoding='UTF-8'?><greeting>XML Hello from Greeting Web Service :) on "+date+"</greeting>";
		return xmlResponse;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		Date date = new Date();
		String jsonResponse = "{'hello':'JSON Hello from Greeting Web Service on "+date+" '}";
		return jsonResponse;
	}
	
}

package tm;

import javax.ws.rs.*;

@Path("helloworld")
public class HelloWorld {

	@GET
	@Produces("text/plain")
	public String getTextPlain() {
		return "Hello world" ;
	}

	@GET
	@Produces("text/xml")
	@Path("/xml")
	public String getXmlPlain() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello World en xml" + "</hello>";
	}

	@GET
	@Produces("text/html")
	@Path("/html")
	public String getHtmlPlain() {
		return "<html> " + "<title>" + "Hello world" + "</title>"
        + "<body><h1>" + "Hello Wordl en html" + "</body></h1>" + "</html> ";
	}

	@GET
	@Produces("text/plain")
	@Path("/q3/{id}")
	public String getHelloWorldId(@PathParam("id") String id) {
		return "Bienvenue -> " + id ;
	}

	@GET
	@Produces("text/plain")
	@Path("/q4")
	public String getHelloWorldIdQ4(@DefaultValue("Mathieu")@QueryParam("nom") String nom, @DefaultValue("Thomas")@QueryParam("prenom") String prenom) {
		return "Bienvenue -> " + nom + "  " + prenom ;
	}
}
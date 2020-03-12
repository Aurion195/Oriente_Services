package tm;

import tm.*;
import java.util.*;
import javax.ws.rs.*;

@Path("/Annuaire")
public class Annuaire {

	private static Carnet carnet = new Carnet();

	@GET
	@Produces("text/plain")
	@Path("/carnet")
	public String getCarnet() {
		carnet.remplirCarnet() ;

		if(carnet.listeVide()) {
			return "Le carnet est vide" ;
		}

		String tmp = carnet.getListeContact();

		return tmp ;
	}

	@GET
	@Produces("text/plain")
	@Path("/numeroContact/{name}")
	public String getCarnet(@PathParam("name") String name) {
		carnet.remplirCarnet() ;

		return carnet.avoirNumero(name) ;
	}

	@POST
	@Path("/q3")
	@Produces("text/plain")
	@Consumes("APPLICATION_FORM_URLENCODED")
	public String remplirContact(@FormParam("name")String name, @FormParam("numero")String numero) {
		/*carnet.remplirCarnet() ;

		String result = carnet.ajouterContact(name, numero) ;*/
		return "blabla" ;
	}
}
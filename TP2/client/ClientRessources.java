
import java.net.URI;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import org.glassfish.jersey.client.*;

public class ClientRessources {

    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();

        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target(getBaseURI());

    
        //String xmlAnswer = target.path("/carnet").request(MediaType.TEXT_PLAIN).get(String.class);
        //String q2Answer = target.path("/numeroContact/Lucien").request(MediaType.TEXT_PLAIN).get(String.class);
      
        Form form =new Form();
        form.param("name", "Charlie");
        form.param("numero", "12");
        Response q3Answer = target.path("q3").request().post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED), Response.class);

        //System.out.println(xmlAnswer);
        //System.out.println("===================================");
        //System.out.println(q2Answer);
        //System.out.println("===================================");
        System.out.println(q3Answer.readEntity(String.class));
        System.out.println("===================================");

        
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/WSREST/Annuaire").build();
    }
}
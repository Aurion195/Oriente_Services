
import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class ClientRessources {

    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();

        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target(getBaseURI());

        String plainAnswer = target.request(MediaType.TEXT_PLAIN).get(String.class);
        String xmlAnswer = target.path("/xml").request(MediaType.TEXT_XML).get(String.class);
        String htmlAnswer = target.path("/html").request(MediaType.TEXT_HTML).get(String.class);
        String q4Answer = target.path("/q4").queryParam("nom", "Garcia").queryParam("prenom", "Jeremy").request(MediaType.TEXT_PLAIN).get(String.class);
        String q4AnswerDefaultValue = target.path("/q4").request(MediaType.TEXT_PLAIN).get(String.class);

        System.out.println(plainAnswer);
        System.out.println("===================================");
        System.out.println(xmlAnswer);
        System.out.println("===================================");
        System.out.println(htmlAnswer);
        System.out.println("===================================");
        System.out.println(q4Answer);
        System.out.println("===================================");
        System.out.println(q4AnswerDefaultValue);

    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/WSREST/helloworld").build();
    }
}
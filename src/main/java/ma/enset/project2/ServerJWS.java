package ma.enset.project2;

import jakarta.xml.ws.Endpoint;
import ma.enset.project2.wepservice.ConsulteReleve;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9393/", new ConsulteReleve());
        System.out.println("Web service deploye sur: http://0.0.0.0:9393/");
    }
}

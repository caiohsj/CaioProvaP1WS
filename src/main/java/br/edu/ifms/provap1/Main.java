package br.edu.ifms.provap1;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Caio Henrique
 */
public class Main {
    public static void main(String[] args) {
        Webservice ws = new Webservice();
        String url = "http://localhost:8000/provap1ws";
        System.out.println("Webservice rodando em "+url);
        Endpoint.publish(url, ws);
    }
}

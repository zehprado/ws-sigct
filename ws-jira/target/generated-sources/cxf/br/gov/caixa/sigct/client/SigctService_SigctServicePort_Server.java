
package br.gov.caixa.sigct.client;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-09-27T11:15:43.550-03:00
 * Generated source version: 2.7.0
 * 
 */
 
public class SigctService_SigctServicePort_Server{

    protected SigctService_SigctServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new SigctServiceImpl();
        String address = "http://sigct.caixa.gov.br/sigct-client/SigctService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new SigctService_SigctServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconsumoapisjava11;

import java.net.URI;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

/**
 *
 * @author pipet
 */
public class PruebaConsumoApisJava11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Service miServicio=new Service("http://127.0.0.1:8080");
        miServicio.GET("/usuarios");
        miServicio.GET("/usuarios/626d6a2d3a5e697a7f6020e4");
        
        JSONObject student1 = new JSONObject();
        
        student1.put("seudonimo", " Felipe Buitrago");
        student1.put("correo", "felipe@misiontic.gov.co");
        student1.put("contrasena", "123");
        
        //miServicio.POST("/usuarios",student1);
        //miServicio.PUT("/usuarios/627a9a76cbc5fa067e502f11",student1);
        miServicio.DELETE("/usuarios/627a9a76cbc5fa067e502f11");
        
    }
    
}

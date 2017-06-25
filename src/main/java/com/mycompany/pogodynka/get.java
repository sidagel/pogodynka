/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pogodynka;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import static rest.WeatherCall.URL;
import weather.Weather;

/**
 *
 * @author sidagel
 */
@WebServlet(name = "get", urlPatterns = {"/get"})
public class get extends HttpServlet {

    public static final String URL = "http://localhost:8080/pogodynka/rest/weather";
            
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String city = request.getParameter("id");
        
        Weather pogoda = ClientBuilder
                .newClient()
                .target(URL)
                .path(city)
                .request(MediaType.APPLICATION_JSON)
                .get()
                .readEntity(Weather.class);
    
        response.setContentType(MediaType.TEXT_HTML);
        PrintWriter out = response.getWriter();

        if( pogoda != null )
        {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pogoda dla miasta " + pogoda.getName() +" </title>");
            out.println("</head>");
            out.println("<body bgcolor=\"white\">");
            out.println("<h1>" + pogoda.getName() + "</h1>");
            out.println("<h2>Last Update:" + pogoda.getDt() + " UTC</h2>");
            out.println("<h3>Dlugosc:" + pogoda.getCoord().getLon() + " Szerokosc" + pogoda.getCoord().getLat() +"</h3>");
            out.println("<br>Temperatura:" + pogoda.getMain().getTemp() + " &#8451;");
            out.println("<br>Minimalna temperatura:" + pogoda.getMain().getTempMin() + " &#8451;");
            out.println("<br>Maksymalna temperatura:" + pogoda.getMain().getTempMax() + " &#8451;");
            out.println("<br>Wilgotnosc:" + pogoda.getMain().getHumidity() +"%");
            out.println("<br>Cisnienie:" + pogoda.getMain().getPressure()+"hPa");
            out.println("<br>Predkosc wiatru:" + pogoda.getWind().getSpeed()+" m/s");
            out.println("<br>Zachmurzenie:" + pogoda.getClouds().getAll() +"%");
            out.println("<br><br><form action=\"index.html\"><input type=\"submit\" value=\"Powrot\" /></form>");
            out.println("</body>");
            out.println("</html>");
            
        }
        else
        {
            out.println("Cos poszlo nie tak");
        }
    
    }
}

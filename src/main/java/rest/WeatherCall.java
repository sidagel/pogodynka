/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import weather.Weather;

/**
 *
 * @author sidagel
 */
@Path("/weather")
public class WeatherCall {
    public static final String URL = "http://api.openweathermap.org/data/2.5/weather";
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCity(@PathParam("id") int id)
    {
        return Response.ok(ClientBuilder
                .newClient()
                .target(URL)
                .queryParam("APPID", "c2a345c4cec22bfc74f12a9b44291623")
                .queryParam( "id", id)
                .queryParam( "units", "metric")
                .request(MediaType.APPLICATION_JSON)
                .get()
                .readEntity(Weather.class)).build();
    }    
}

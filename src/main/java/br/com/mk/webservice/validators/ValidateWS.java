package br.com.mk.webservice.validators;


import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

public class ValidateWS {

    public static Response status(Object collection){

        if(collection == null)
            return Response.status(HttpServletResponse.SC_NOT_FOUND).build();
        else
            return Response.ok(collection).build();
    }

}

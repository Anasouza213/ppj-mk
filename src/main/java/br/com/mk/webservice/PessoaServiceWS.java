package br.com.mk.webservice;

import br.com.mk.entity.Pessoa;
import br.com.mk.service.PessoaService;
import br.com.mk.webservice.validators.ValidateWS;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pessoaws")
@RequestScoped
public class PessoaServiceWS {

    @Inject
    private PessoaService pessoaService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll(){
        return ValidateWS.status(pessoaService.findAll());
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa save(Pessoa pessoa){
        return pessoaService.save(pessoa);
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") Long id){
        return ValidateWS.status(pessoaService.find(id));
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") Long id){
        pessoaService.delete(id);
    }


}

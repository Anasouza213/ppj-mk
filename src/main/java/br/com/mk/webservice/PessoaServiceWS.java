package br.com.mk.webservice;

import br.com.mk.entity.Pessoa;
import br.com.mk.service.PessoaService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/pessoaws")
@RequestScoped
public class PessoaServiceWS {

    @Inject
    private PessoaService pessoaService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Pessoa> findAll(){
      return pessoaService.findAll();
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
    public Pessoa find(@PathParam("id") Long id){
        return pessoaService.find(id);
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") Long id){
        pessoaService.delete(id);
    }


}

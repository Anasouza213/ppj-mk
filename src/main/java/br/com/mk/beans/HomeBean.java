package br.com.mk.beans;

import br.com.mk.entity.Pessoa;
import br.com.mk.service.PessoaService;
import br.com.mk.util.FacesUtil;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named("homeBean")
@RequestScoped
public class HomeBean implements Serializable{

    @Inject
    private PessoaService pessoaService;

    @Inject
    private Pessoa pessoa;

    //Methods Bean
    public void save(){
        if(pessoa != null) {
            pessoaService.save(pessoa);
            FacesUtil.sucess("SAVED SUCCESSFULLY.");
        }else{
            FacesUtil.error("FAILED TO SAVE.");
        }

        this.pessoa = new Pessoa();
    }

    //Getters and Setters
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}

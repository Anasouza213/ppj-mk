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
    public void salvar(){
        if(pessoa != null) {
            pessoaService.salvar(pessoa);
            FacesUtil.sucesso("GRAVADO COM SUCESSO");
        }else{
            FacesUtil.error("FALHA AO SALVAR OBJETO");
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

package br.com.mk.service;


import br.com.mk.entity.Pessoa;

import java.io.Serializable;

public interface PessoaService extends Serializable{

    public Pessoa salvar(Pessoa pessoa);

}

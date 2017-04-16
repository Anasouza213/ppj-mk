package br.com.mk.repository;


import br.com.mk.entity.Pessoa;

import java.io.Serializable;

public interface PessoaRepository extends Serializable{

    public Pessoa salvar(Pessoa pessoa);
}

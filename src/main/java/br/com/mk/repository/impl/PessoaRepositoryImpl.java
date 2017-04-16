package br.com.mk.repository.impl;


import br.com.mk.entity.Pessoa;
import br.com.mk.repository.PessoaRepository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class PessoaRepositoryImpl implements PessoaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        this.entityManager.persist(pessoa);
        return pessoa;
    }
}

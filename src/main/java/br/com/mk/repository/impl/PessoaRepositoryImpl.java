package br.com.mk.repository.impl;


import br.com.mk.entity.Pessoa;
import br.com.mk.repository.PessoaRepository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Collection;

public class PessoaRepositoryImpl implements PessoaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public Pessoa save(Pessoa pessoa) {
        this.entityManager.persist(pessoa);
        return pessoa;
    }

    @Override
    public Pessoa change(Pessoa pessoa) {
        return this.entityManager.merge(pessoa);
    }

    @Override
    public Boolean delete(Pessoa pessoa) {
        this.entityManager.remove(pessoa);
        return true;
    }

    @Override
    public void delete(Long id) {
        Pessoa pessoa = this.find(id);
        this.entityManager.remove(pessoa);
    }

    @Override
    public Pessoa find(Long id) {
        return this.entityManager.find(Pessoa.class, id);
    }

    @Override
    public Pessoa find(Pessoa pessoa) {
        return this.entityManager.find(pessoa.getClass(), pessoa.getId());
    }

    @Override
    public Collection<Pessoa> findAll() {
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Pessoa> criteria = builder.createQuery(Pessoa.class);
        criteria.from(Pessoa.class);

        return this.entityManager.createQuery(criteria).getResultList();
    }
}

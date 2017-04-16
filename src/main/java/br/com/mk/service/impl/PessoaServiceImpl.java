package br.com.mk.service.impl;

import br.com.mk.entity.Pessoa;
import br.com.mk.repository.PessoaRepository;
import br.com.mk.service.PessoaService;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.Collection;

@Stateless
public class PessoaServiceImpl implements PessoaService{

    @Inject
    private PessoaRepository pessoaRepository;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Pessoa change(Pessoa pessoa) {
        return pessoaRepository.change(pessoa);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Boolean delete(Pessoa pessoa) {
        return pessoaRepository.delete(pessoa);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void delete(Long id) {
        pessoaRepository.delete(id);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Pessoa find(Long id) {
        return pessoaRepository.find(id);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Pessoa find(Pessoa pessoa) {
        return pessoaRepository.find(pessoa);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Collection<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }
}

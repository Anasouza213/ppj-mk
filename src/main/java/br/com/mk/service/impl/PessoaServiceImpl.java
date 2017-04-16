package br.com.mk.service.impl;

import br.com.mk.entity.Pessoa;
import br.com.mk.repository.PessoaRepository;
import br.com.mk.service.PessoaService;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
public class PessoaServiceImpl implements PessoaService{

    @Inject
    private PessoaRepository pessoaRepository;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.salvar(pessoa);
    }
}

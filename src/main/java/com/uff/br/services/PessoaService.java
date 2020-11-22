package com.uff.br.services;

import com.uff.br.entities.Pessoa;
import com.uff.br.repository.PessoaRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

   /* public Pessoa salvar(Pessoa pessoa) {
        Pessoa p = new Pessoa();
        p.setSexo(pessoa.getSexo());
        p.setCelular(pessoa.getCelular());
        p.setCpf(pessoa.getCpf());
        p.setDtNasc(pessoa.getDtNasc());
        p.setEmail(pessoa.getEmail());
        p.setEndereco(pessoa.getEndereco());
        p.setIdentidade(pessoa.getIdentidade());
        p.setNome(pessoa.getNome());
        return pessoaRepository.save(p);
    }*/

    public Iterable<Pessoa> getAll() { return pessoaRepository.findAll(); }

    public RequestStatus removePessoa (int id) {
        pessoaRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value());
    }
}
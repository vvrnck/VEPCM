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

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Iterable<Pessoa> getAll() { return pessoaRepository.findAll(); }

    public RequestStatus removePessoa (int id) {
        pessoaRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value());
    }
}
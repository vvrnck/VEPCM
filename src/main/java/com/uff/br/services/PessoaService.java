package com.uff.br.services;

import com.uff.br.entities.Endereco;
import com.uff.br.entities.Pessoa;
import com.uff.br.repository.PessoaRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa salvar(Pessoa pessoa) { return pessoaRepository.save(pessoa); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), pessoaRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), pessoaRepository.findById(id));
    }

    public RequestStatus removePessoa (int id) {
        pessoaRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Pessoa removida com sucesso!");
    }

    public Pessoa atualizaPessoa (int id, Pessoa pessoa) {
        Optional<Pessoa> p = pessoaRepository.findById(id);
        if (p.isPresent()) {
            p.get().setSexo(pessoa.getSexo());
            p.get().setCelular(pessoa.getCelular());
            p.get().setCpf(pessoa.getCpf());
            p.get().setDtNasc(pessoa.getDtNasc());
            //p.get().setEmail(pessoa.getEmail());
            p.get().setEndereco(pessoa.getEndereco());
            p.get().setIdentidade(pessoa.getIdentidade());
            p.get().setNome(pessoa.getNome());
            p.get().setUsuario(pessoa.getUsuario());
            p.get().setAlunos(pessoa.getAlunos());
            p.get().setResponsavel(pessoa.getResponsavel());
        }
        return pessoaRepository.save(p.get());
    }

}
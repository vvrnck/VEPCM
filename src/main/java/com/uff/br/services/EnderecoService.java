package com.uff.br.services;

import com.uff.br.entities.Endereco;
import com.uff.br.repository.EnderecoRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

   /* public Endereco salvar(Endereco endereco) { return enderecoRepository.save(endereco);} */

    public Iterable<Endereco> getAll() { return enderecoRepository.findAll(); }

    public RequestStatus removeEndereco (int id) {
        enderecoRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value());
    }
}
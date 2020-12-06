package com.uff.br.services;


import com.uff.br.entities.*;
import com.uff.br.repository.ResponsavelRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResponsavelService {

    private final ResponsavelRepository responsavelRepository;



    @Autowired
    public ResponsavelService(ResponsavelRepository responsavelRepository) {
        this.responsavelRepository = responsavelRepository;


    }

    public Responsavel salvar(Responsavel responsavel) {
        return responsavelRepository.save(responsavel);
    }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), responsavelRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), responsavelRepository.findById(id));
    }

    public RequestStatus removeResponsavel(int id) {
        responsavelRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Responsavel removido com sucesso!");
    }

    public Responsavel atualizaResponsavel(int id, Responsavel responsavel) {
        Optional<Responsavel> r = responsavelRepository.findById(id);
        if (r.isPresent()) {
            r.get().setIdPessoa(responsavel.getIdPessoa());
            r.get().setIdResponsavelAluno(responsavel.getIdResponsavelAluno());
            r.get().setIdSolicitacaoRespAluno(responsavel.getIdSolicitacaoRespAluno());
        }
        return responsavelRepository.save(r.get());
    }

}


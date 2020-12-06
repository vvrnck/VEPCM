package com.uff.br.services;

import com.uff.br.entities.ResponsavelAluno;
import com.uff.br.repository.ResponsavelAlunoRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResponsavelAlunoService {

    private final ResponsavelAlunoRepository responsavelAlunoRepository;

    @Autowired
    public ResponsavelAlunoService(ResponsavelAlunoRepository responsavelAlunoRepository) {
        this.responsavelAlunoRepository = responsavelAlunoRepository;
    }
    public ResponsavelAluno salvar(ResponsavelAluno responsavelAluno) { return responsavelAlunoRepository.save(responsavelAluno); }

    public RequestStatus getAll() { return new RequestStatus(HttpStatus.OK.value(), responsavelAlunoRepository.findAll());
    }
    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), responsavelAlunoRepository.findById(id));
    }

    public RequestStatus removeResponsavelAluno (int id) {
        responsavelAlunoRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Responsavel - Aluno removido com sucesso!");
    }

    public ResponsavelAluno atualizaResponsavelAluno (int id, ResponsavelAluno responsavelAluno) {
        Optional<ResponsavelAluno> ra = responsavelAlunoRepository.findById(id);
        if (ra.isPresent()) {
            ra.get().setIdResponsavel(responsavelAluno.getIdResponsavel());
            ra.get().setIdAluno(responsavelAluno.getIdAluno());
        }
        return responsavelAlunoRepository.save(ra.get());
    }

}
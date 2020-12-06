package com.uff.br.services;

import com.uff.br.entities.SolicitacaoRespAluno;
import com.uff.br.repository.SolicitacaoRespAlunoRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SolicitacaoRespAlunoService {

    private final SolicitacaoRespAlunoRepository solicitacaoRespAlunoRepository;

    @Autowired
    public SolicitacaoRespAlunoService(SolicitacaoRespAlunoRepository solicitacaoRespAlunoRepository) {
        this.solicitacaoRespAlunoRepository = solicitacaoRespAlunoRepository;
    }

    public SolicitacaoRespAluno salvar(SolicitacaoRespAluno solicitacaoRespAluno) {

        return solicitacaoRespAlunoRepository.save(solicitacaoRespAluno); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), solicitacaoRespAlunoRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), solicitacaoRespAlunoRepository.findById(id));
    }

    public RequestStatus removeSolicitacaoRespAluno (int id) {
        solicitacaoRespAlunoRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "SolicitacaoRespAluno removido com sucesso!");
    }

    public SolicitacaoRespAluno atualizaSolicitacaoRespAluno (int id, SolicitacaoRespAluno solicitacaoRespAluno) {
        Optional<SolicitacaoRespAluno> sra = solicitacaoRespAlunoRepository.findById(id);
        if (sra.isPresent()) {
            sra.get().setIdResponsavel(solicitacaoRespAluno.getIdResponsavel());
            sra.get().setIdAluno(solicitacaoRespAluno.getIdAluno());
            sra.get().setIdSolicitacao(solicitacaoRespAluno.getIdSolicitacao());
            sra.get().setIdUnidadeEscolar(solicitacaoRespAluno.getIdUnidadeEscolar());
            sra.get().setIdAnoEscolaridade(solicitacaoRespAluno.getIdAnoEscolaridade());
        }
        return solicitacaoRespAlunoRepository.save(sra.get());
    }
}
package com.uff.br.services;

import com.uff.br.entities.AnoEscolaridade;
import com.uff.br.repository.AnoEscolaridadeRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnoEscolaridadeService {

    private final AnoEscolaridadeRepository anoEscolaridadeRepository;

    @Autowired
    public AnoEscolaridadeService(AnoEscolaridadeRepository anoEscolaridadeRepository) {
        this.anoEscolaridadeRepository = anoEscolaridadeRepository;
    }

    public AnoEscolaridade salvar(AnoEscolaridade anoEscolaridade) { return anoEscolaridadeRepository.save(anoEscolaridade); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), anoEscolaridadeRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), anoEscolaridadeRepository.findById(id));
    }

    public RequestStatus removeAnoEscolaridade (int id) {
        anoEscolaridadeRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Ano Escolaridade removida com sucesso!");
    }

    public AnoEscolaridade atualizaAnoEscolaridade (int id, AnoEscolaridade anoEscolaridade) {
        Optional<AnoEscolaridade> ae = anoEscolaridadeRepository.findById(id);
        if (ae.isPresent()) {
            ae.get().setNome(anoEscolaridade.getNome());
            ae.get().setDescricao(anoEscolaridade.getDescricao());
            ae.get().setUnidadeEscolar(anoEscolaridade.getUnidadeEscolar());
            ae.get().setIdSolicitacaoRespAluno(anoEscolaridade.getIdSolicitacaoRespAluno());
        }
        return anoEscolaridadeRepository.save(ae.get());
    }

}
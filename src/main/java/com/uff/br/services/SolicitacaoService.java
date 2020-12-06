package com.uff.br.services;

import com.uff.br.entities.Solicitacao;
import com.uff.br.repository.SolicitacaoRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SolicitacaoService {

    private final SolicitacaoRepository solicitacaoRepository;

    @Autowired
    public SolicitacaoService(SolicitacaoRepository solicitacaoRepository) {
        this.solicitacaoRepository = solicitacaoRepository;
    }

    public Solicitacao salvar(Solicitacao solicitacao) { return solicitacaoRepository.save(solicitacao); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), solicitacaoRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), solicitacaoRepository.findById(id));
    }

    public RequestStatus removeSolicitacao (int id) {
        solicitacaoRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Solicitacao removida com sucesso!");
    }

    public Solicitacao atualizaSolicitacao (int id, Solicitacao solicitacao) {
        Optional<Solicitacao> s = solicitacaoRepository.findById(id);
        if (s.isPresent()) {
            s.get().setData(solicitacao.getData());
            s.get().setProtocolo(solicitacao.getProtocolo());
            s.get().setIdSolicitacaoRespAluno(solicitacao.getIdSolicitacaoRespAluno());
        }
        return solicitacaoRepository.save(s.get());
    }

}

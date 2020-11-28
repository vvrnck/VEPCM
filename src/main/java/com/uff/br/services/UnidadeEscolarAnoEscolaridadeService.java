/*
package com.uff.br.services;

import com.uff.br.entities.UnidadeEscolarAnoEscolaridade;
import com.uff.br.repository.UnidadeEscolarAnoEscolaridadeRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UnidadeEscolarAnoEscolaridadeService {

    private final UnidadeEscolarAnoEscolaridadeRepository unidadeEscolarAnoEscolaridadeRepository;

    @Autowired
    public UnidadeEscolarAnoEscolaridadeService(UnidadeEscolarAnoEscolaridadeRepository unidadeEscolarAnoEscolaridadeRepository) {
        this.unidadeEscolarAnoEscolaridadeRepository = unidadeEscolarAnoEscolaridadeRepository;
    }

    public UnidadeEscolarAnoEscolaridade salvar(UnidadeEscolarAnoEscolaridade unidadeEscolarAnoEscolaridade) { return unidadeEscolarAnoEscolaridadeRepository.save(unidadeEscolarAnoEscolaridade); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), unidadeEscolarAnoEscolaridadeRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), unidadeEscolarAnoEscolaridadeRepository.findById(id));
    }

    public RequestStatus removeUnidadeEscolarAnoEscolaridade (int id) {
        unidadeEscolarAnoEscolaridadeRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Unidade Escolar - Ano Escolaridade removida com sucesso!");
    }

    public UnidadeEscolarAnoEscolaridade atualizaUnidadeEscolarAnoEscolaridade (int id, UnidadeEscolarAnoEscolaridade unidadeEscolarAnoEscolaridade) {
        Optional<UnidadeEscolarAnoEscolaridade> ueae = unidadeEscolarAnoEscolaridadeRepository.findById(id);
        if (ueae.isPresent()) {
            ueae.get().setNome(unidadeEscolarAnoEscolaridade.getNome());
            ueae.get().setNumVagas(unidadeEscolarAnoEscolaridade.getNumVagas());
            ueae.get().setData(unidadeEscolarAnoEscolaridade.getData());
 ueae.get().setSolicitacao(unidadeEscolarAnoEscolaridade.getSolicitacao());

            ueae.get().setAnoEscolaridade(unidadeEscolarAnoEscolaridade.getAnoEscolaridade());
            ueae.get().setUnidadeEscolar(unidadeEscolarAnoEscolaridade.getUnidadeEscolar());
        }
        return unidadeEscolarAnoEscolaridadeRepository.save(ueae.get());
    }

}
*/

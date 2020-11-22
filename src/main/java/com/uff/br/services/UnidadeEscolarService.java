package com.uff.br.services;

import com.uff.br.entities.UnidadeEscolar;
import com.uff.br.repository.UnidadeEscolarRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UnidadeEscolarService {

    private final UnidadeEscolarRepository unidadeEscolarRepository;

    @Autowired
    public UnidadeEscolarService(UnidadeEscolarRepository unidadeEscolarRepository) {
        this.unidadeEscolarRepository = unidadeEscolarRepository;
    }

    public UnidadeEscolar salvar(UnidadeEscolar unidadeEscolar) { return unidadeEscolarRepository.save(unidadeEscolar); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), unidadeEscolarRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), unidadeEscolarRepository.findById(id));
    }

    public RequestStatus removeUnidadeEscolar (int id) {
        unidadeEscolarRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Unidade escolar removida com sucesso!");
    }

    public UnidadeEscolar atualizaUnidadeEscolar (int id, UnidadeEscolar unidadeEscolar) {
        Optional<UnidadeEscolar> ue = unidadeEscolarRepository.findById(id);
        if (ue.isPresent()) {
            ue.get().setEndereco(unidadeEscolar.getEndereco());
            ue.get().setData(unidadeEscolar.getData());
            ue.get().setNome(unidadeEscolar.getNome());
            ue.get().setNumVagas(unidadeEscolar.getNumVagas());
            ue.get().setAnoEscolaridade(unidadeEscolar.getAnoEscolaridade());
        }
        return unidadeEscolarRepository.save(ue.get());
    }

}
package com.uff.br.services;


import com.uff.br.entities.ListaEspera;
import com.uff.br.repository.ListaEsperaRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListaEsperaService {

    private final ListaEsperaRepository listaEsperaRepository;

    @Autowired
    public ListaEsperaService(ListaEsperaRepository listaEsperaRepository) {
        this.listaEsperaRepository = listaEsperaRepository;
    }

    public ListaEspera salvar(ListaEspera listaEspera) {

        return listaEsperaRepository.save(listaEspera); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), listaEsperaRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), listaEsperaRepository.findById(id));
    }

    public RequestStatus removeListaEspera (int id) {
        listaEsperaRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Lista Espera removida com sucesso!");
    }

    public ListaEspera atualizaListaEspera (int id, ListaEspera listaEspera) {
        Optional<ListaEspera> le = listaEsperaRepository.findById(id);
        if (le.isPresent()) {
            le.get().setData(listaEspera.getData());
            le.get().setIdAluno(listaEspera.getIdAluno());
        }
        return listaEsperaRepository.save(le.get());
    }

}
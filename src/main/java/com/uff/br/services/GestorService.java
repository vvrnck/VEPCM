package com.uff.br.services;

import com.uff.br.entities.Gestor;
import com.uff.br.repository.GestorRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GestorService {

    private final GestorRepository gestorRepository;

    @Autowired
    public GestorService(GestorRepository gestorRepository) {
        this.gestorRepository = gestorRepository;
    }

    public Gestor salvar(Gestor gestor) {

        return gestorRepository.save(gestor); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), gestorRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), gestorRepository.findById(id));
    }

    public RequestStatus removeGestor (int id) {
        gestorRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Gestor removido com sucesso!");
    }

    public Gestor atualizaGestor (int id, Gestor gestor) {
        Optional<Gestor> g = gestorRepository.findById(id);
        if (g.isPresent()) {
            g.get().setId(gestor.getId());
            g.get().setMatricula(gestor.getMatricula());
            g.get().setIdPessoa(gestor.getIdPessoa());

        }
        return gestorRepository.save(g.get());
    }

}

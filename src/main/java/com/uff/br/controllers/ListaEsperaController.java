package com.uff.br.controllers;

import com.uff.br.entities.ListaEspera;
import com.uff.br.repository.ListaEsperaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.uff.br.utils.RequestStatus;

@Controller // This means that this class is a Controller
@RequestMapping(path="/ListaEspera") // This means URL's start with /demo (after Application path)
public class ListaEsperaController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private ListaEsperaRepository listaesperaRepository;

    @PostMapping(path="") // Map ONLY POST Requests
    public @ResponseBody RequestStatus addNewListaEspera (@RequestBody ListaEspera listaespera) {
        ListaEspera newListaEspera = listaesperaRepository.save(listaespera);
        return new RequestStatus(HttpStatus.OK.value(), newListaEspera);
    }

    @GetMapping(path="")
    public @ResponseBody Iterable<ListaEspera> getAllListaEspera() {
        // This returns a JSON or XML with the users
        return listaesperaRepository.findAll();
    }

    @DeleteMapping(path="/{id}")
    public @ResponseBody RequestStatus removeListaEspera (@PathVariable int id) {
        listaesperaRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value());
    }
}
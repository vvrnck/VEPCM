package com.uff.br.controllers;

import com.uff.br.DTO.ListaEsperaDTO;
import com.uff.br.DTO.ListaEsperaRespostaDTO;
import com.uff.br.entities.ListaEspera;
import com.uff.br.services.ListaEsperaService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/le", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class ListaEsperaController {
    private final ListaEsperaService listaEsperaService;

    @Autowired
    public ListaEsperaController(ListaEsperaService listaEsperaService) {
        this.listaEsperaService = listaEsperaService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<ListaEsperaRespostaDTO> addNewListaEspera (@RequestBody ListaEsperaDTO dto) {
        ListaEspera le = listaEsperaService.salvar(dto.convertToObject());
        return new ResponseEntity<>(ListaEsperaRespostaDTO.convertToDTO(le), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return listaEsperaService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return listaEsperaService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeListaEspera (@PathVariable int id) {
        return listaEsperaService.removeListaEspera(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<ListaEsperaRespostaDTO> updateListaEspera(@PathVariable int id, @RequestBody ListaEsperaDTO dto) {
        ListaEspera le = listaEsperaService.atualizaListaEspera(id, dto.convertToObject());
        return new ResponseEntity<>(ListaEsperaRespostaDTO.convertToDTO(le), HttpStatus.OK);
    }
}
package com.uff.br.controllers;

import com.uff.br.DTO.UnidadeEscolarDTO;
import com.uff.br.DTO.UnidadeEscolarRespostaDTO;
import com.uff.br.entities.UnidadeEscolar;
import com.uff.br.services.UnidadeEscolarService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/ue", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class UnidadeEscolarController {
    private final UnidadeEscolarService unidadeEscolarService;

    @Autowired
    public UnidadeEscolarController(UnidadeEscolarService unidadeEscolarService) {
        this.unidadeEscolarService = unidadeEscolarService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<UnidadeEscolarRespostaDTO> addNewUE (@RequestBody UnidadeEscolarDTO dto) {
        UnidadeEscolar ue = unidadeEscolarService.salvar(dto.convertToObject());
        return new ResponseEntity<>(UnidadeEscolarRespostaDTO.convertToDTO(ue), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return unidadeEscolarService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return unidadeEscolarService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeUE (@PathVariable int id) {
        return unidadeEscolarService.removeUnidadeEscolar(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<UnidadeEscolarRespostaDTO> updateUE(@PathVariable int id, @RequestBody UnidadeEscolarDTO dto) {
        UnidadeEscolar ue = unidadeEscolarService.atualizaUnidadeEscolar(id, dto.convertToObject());
        return new ResponseEntity<>(UnidadeEscolarRespostaDTO.convertToDTO(ue), HttpStatus.OK);
    }
}
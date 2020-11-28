/*
package com.uff.br.controllers;


import com.uff.br.DTO.UnidadeEscolarAnoEscolaridadeDTO;
import com.uff.br.DTO.UnidadeEscolarAnoEscolaridadeRespostaDTO;
import com.uff.br.entities.UnidadeEscolarAnoEscolaridade;
import com.uff.br.services.UnidadeEscolarAnoEscolaridadeService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/ueae", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class UnidadeEscolarAnoEscolaridadeController {
    private final UnidadeEscolarAnoEscolaridadeService unidadeEscolarAnoEscolaridadeService;

    @Autowired
    public UnidadeEscolarAnoEscolaridadeController(UnidadeEscolarAnoEscolaridadeService unidadeEscolarAnoEscolaridadeService) {
        this.unidadeEscolarAnoEscolaridadeService = unidadeEscolarAnoEscolaridadeService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<UnidadeEscolarAnoEscolaridadeRespostaDTO> addNewUEAE (@RequestBody UnidadeEscolarAnoEscolaridadeDTO dto) {
        UnidadeEscolarAnoEscolaridade ueae = unidadeEscolarAnoEscolaridadeService.salvar(dto.convertToObject());
        return new ResponseEntity<>(UnidadeEscolarAnoEscolaridadeRespostaDTO.convertToDTO(ueae), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return unidadeEscolarAnoEscolaridadeService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return unidadeEscolarAnoEscolaridadeService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeUEAE (@PathVariable int id) {
        return unidadeEscolarAnoEscolaridadeService.removeUnidadeEscolarAnoEscolaridade(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<UnidadeEscolarAnoEscolaridadeRespostaDTO> updateUEAE(@PathVariable int id, @RequestBody UnidadeEscolarAnoEscolaridadeDTO dto) {
        UnidadeEscolarAnoEscolaridade ueae = unidadeEscolarAnoEscolaridadeService.atualizaUnidadeEscolarAnoEscolaridade(id, dto.convertToObject());
        return new ResponseEntity<>(UnidadeEscolarAnoEscolaridadeRespostaDTO.convertToDTO(ueae), HttpStatus.OK);
    }
}*/

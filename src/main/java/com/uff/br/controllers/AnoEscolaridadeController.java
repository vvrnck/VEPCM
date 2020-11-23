package com.uff.br.controllers;

import com.uff.br.DTO.AnoEscolaridadeDTO;
import com.uff.br.DTO.AnoEscolaridadeRespostaDTO;
import com.uff.br.entities.AnoEscolaridade;
import com.uff.br.services.AnoEscolaridadeService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/ae", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class AnoEscolaridadeController {
    private final AnoEscolaridadeService anoEscolaridadeService;

    @Autowired
    public AnoEscolaridadeController(AnoEscolaridadeService anoEscolaridadeService) {
        this.anoEscolaridadeService = anoEscolaridadeService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<AnoEscolaridadeRespostaDTO> addNewAE (@RequestBody AnoEscolaridadeDTO dto) {
        AnoEscolaridade ae = anoEscolaridadeService.salvar(dto.convertToObject());
        return new ResponseEntity<>(AnoEscolaridadeRespostaDTO.convertToDTO(ae), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return anoEscolaridadeService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return anoEscolaridadeService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeAE (@PathVariable int id) {
        return anoEscolaridadeService.removeAnoEscolaridade(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<AnoEscolaridadeRespostaDTO> updateAE(@PathVariable int id, @RequestBody AnoEscolaridadeDTO dto) {
        AnoEscolaridade ae = anoEscolaridadeService.atualizaAnoEscolaridade(id, dto.convertToObject());
        return new ResponseEntity<>(AnoEscolaridadeRespostaDTO.convertToDTO(ae), HttpStatus.OK);
    }
}
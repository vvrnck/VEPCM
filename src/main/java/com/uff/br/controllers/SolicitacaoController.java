/*
package com.uff.br.controllers;


import com.uff.br.DTO.SolicitacaoDTO;
import com.uff.br.DTO.SolicitacaoRespostaDTO;
import com.uff.br.entities.Solicitacao;
import com.uff.br.services.SolicitacaoService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/solicitacao", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class SolicitacaoController {
    private final SolicitacaoService solicitacaoService;

    @Autowired
    public SolicitacaoController(SolicitacaoService solicitacaoService) {
        this.solicitacaoService = solicitacaoService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<SolicitacaoRespostaDTO> addNewSolicitacao (@RequestBody SolicitacaoDTO dto) {
        Solicitacao s = solicitacaoService.salvar(dto.convertToObject());
        return new ResponseEntity<>(SolicitacaoRespostaDTO.convertToDTO(s), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return solicitacaoService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return solicitacaoService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeSolicitacao (@PathVariable int id) {
        return solicitacaoService.removeSolicitacao(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<SolicitacaoRespostaDTO> updateSolicitacao(@PathVariable int id, @RequestBody SolicitacaoDTO dto) {
        Solicitacao s = solicitacaoService.atualizaSolicitacao(id, dto.convertToObject());
        return new ResponseEntity<>(SolicitacaoRespostaDTO.convertToDTO(s), HttpStatus.OK);
    }
}*/

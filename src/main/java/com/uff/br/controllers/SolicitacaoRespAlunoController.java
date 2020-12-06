package com.uff.br.controllers;

import com.uff.br.DTO.SolicitacaoRespAlunoDTO;
import com.uff.br.DTO.SolicitacaoRespAlunoRespostaDTO;
import com.uff.br.entities.SolicitacaoRespAluno;
import com.uff.br.services.SolicitacaoRespAlunoService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/sra", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class SolicitacaoRespAlunoController {
    private final SolicitacaoRespAlunoService solicitacaoRespAlunoService;

    @Autowired
    public SolicitacaoRespAlunoController(SolicitacaoRespAlunoService solicitacaoRespAlunoService) {
        this.solicitacaoRespAlunoService = solicitacaoRespAlunoService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<SolicitacaoRespAlunoRespostaDTO> addNewSolicitacaoRespAluno (@RequestBody SolicitacaoRespAlunoDTO dto) {
        SolicitacaoRespAluno s = solicitacaoRespAlunoService.salvar(dto.convertToObject());
        return new ResponseEntity<>(SolicitacaoRespAlunoRespostaDTO.convertToDTO(s), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return solicitacaoRespAlunoService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return solicitacaoRespAlunoService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeSolicitacaoRespAluno (@PathVariable int id) {
        return solicitacaoRespAlunoService.removeSolicitacaoRespAluno(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<SolicitacaoRespAlunoRespostaDTO> updateSolicitacaoRespAluno(@PathVariable int id, @RequestBody SolicitacaoRespAlunoDTO dto) {
        SolicitacaoRespAluno sra = solicitacaoRespAlunoService.atualizaSolicitacaoRespAluno(id, dto.convertToObject());
        return new ResponseEntity<>(SolicitacaoRespAlunoRespostaDTO.convertToDTO(sra), HttpStatus.OK);
    }
}

package com.uff.br.controllers;

import com.uff.br.DTO.AlunoDTO;
import com.uff.br.DTO.AlunoRespostaDTO;
import com.uff.br.entities.Aluno;
import com.uff.br.services.AlunoService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/aluno", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class AlunoController {
    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<AlunoRespostaDTO> addNewAluno (@RequestBody AlunoDTO dto) {
        Aluno a = alunoService.salvar(dto.convertToObject());
        return new ResponseEntity<>(AlunoRespostaDTO.convertToDTO(a), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return alunoService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return alunoService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeAluno (@PathVariable int id) {
        return alunoService.removeAluno(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<AlunoRespostaDTO> updateAluno(@PathVariable int id, @RequestBody AlunoDTO dto) {
        Aluno a = alunoService.atualizaAluno(id, dto.convertToObject());
        return new ResponseEntity<>(AlunoRespostaDTO.convertToDTO(a), HttpStatus.OK);
    }
}
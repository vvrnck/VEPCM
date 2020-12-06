package com.uff.br.controllers;


import com.uff.br.DTO.ResponsavelAlunoDTO;
import com.uff.br.DTO.ResponsavelAlunoRespostaDTO;
import com.uff.br.entities.ResponsavelAluno;
import com.uff.br.services.ResponsavelAlunoService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/ra", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class ResponsavelAlunoController {
    private final ResponsavelAlunoService responsavelAlunoService;

    @Autowired
    public ResponsavelAlunoController(ResponsavelAlunoService responsavelAlunoService) {
        this.responsavelAlunoService = responsavelAlunoService;
    }

    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<ResponsavelAlunoRespostaDTO> addNewResponsavelAluno (@RequestBody ResponsavelAlunoDTO dto) {
        ResponsavelAluno ra = responsavelAlunoService.salvar(dto.convertToObject());
        return new ResponseEntity<>(ResponsavelAlunoRespostaDTO.convertToDTO(ra), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return responsavelAlunoService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return responsavelAlunoService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeResponsavelAluno (@PathVariable int id) {
        return responsavelAlunoService.removeResponsavelAluno(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<ResponsavelAlunoRespostaDTO> updateResponsavelAluno(@PathVariable int id, @RequestBody ResponsavelAlunoDTO dto) {
        ResponsavelAluno ra = responsavelAlunoService.atualizaResponsavelAluno(id, dto.convertToObject());
        return new ResponseEntity<>(ResponsavelAlunoRespostaDTO.convertToDTO(ra), HttpStatus.OK);
    }
}
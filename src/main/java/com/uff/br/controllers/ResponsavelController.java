package com.uff.br.controllers;


import com.uff.br.DTO.AlunoDTO;
import com.uff.br.DTO.ResponsavelDTO;
import com.uff.br.DTO.ResponsavelRespostaDTO;
import com.uff.br.DTO.UsuarioDTO;
import com.uff.br.entities.Aluno;
import com.uff.br.entities.Responsavel;
import com.uff.br.services.AlunoService;
import com.uff.br.services.ResponsavelService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/responsavel", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class ResponsavelController {
    private final ResponsavelService responsavelService;
    private final AlunoService alunoService;


    @Autowired
    public ResponsavelController(ResponsavelService responsavelService, AlunoService alunoService) {
        this.responsavelService = responsavelService;
        this.alunoService = alunoService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<ResponsavelRespostaDTO> addNewResponsavel (@RequestBody ResponsavelDTO dto) {
        Responsavel r = responsavelService.salvar(dto.convertToObject());
        return new ResponseEntity<>(ResponsavelRespostaDTO.convertToDTO(r), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return responsavelService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return responsavelService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeResponsavel (@PathVariable int id) {
        return responsavelService.removeResponsavel(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<ResponsavelRespostaDTO> updateResponsavel(@PathVariable int id, @RequestBody ResponsavelDTO dto) {
        Responsavel r = responsavelService.atualizaResponsavel(id, dto.convertToObject());

        return new ResponseEntity<>(ResponsavelRespostaDTO.convertToDTO(r), HttpStatus.OK);
    }
}
package com.uff.br.controllers;

import com.uff.br.DTO.PessoaDTO;
import com.uff.br.DTO.PessoaRespostaDTO;
import com.uff.br.entities.Pessoa;
import com.uff.br.services.PessoaService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/pessoa") // This means URL's start with /demo (after Application path)
public class PessoaController {
    private final PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
/*

    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<PessoaRespostaDTO> addNewPerson (@RequestBody PessoaDTO dto) {
        Pessoa p = pessoaService.salvar(dto.convertToObject());

        return new ResponseEntity<>(PessoaRespostaDTO.convertToDTO(p), HttpStatus.CREATED);
    }
*/

    @GetMapping(path="")
    public Iterable<Pessoa> findAll () {
        return pessoaService.getAll();
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removePerson (@PathVariable int id) {
        return pessoaService.removePessoa(id);
    }
}
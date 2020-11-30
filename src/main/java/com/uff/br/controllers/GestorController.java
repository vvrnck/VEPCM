package com.uff.br.controllers;

import com.uff.br.DTO.AlunoDTO;
import com.uff.br.DTO.AlunoRespostaDTO;
import com.uff.br.DTO.GestorDTO;
import com.uff.br.DTO.GestorRespostaDTO;
import com.uff.br.entities.Aluno;
import com.uff.br.entities.Gestor;
import com.uff.br.services.AlunoService;
import com.uff.br.services.GestorService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/gestor", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class GestorController {
    private final GestorService gestorService;

    @Autowired
    public GestorController(GestorService gestorService) {this.gestorService = gestorService; }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<GestorRespostaDTO> addNewGestor (@RequestBody GestorDTO dto) {
        Gestor g = gestorService.salvar(dto.convertToObject());
        return new ResponseEntity<>(GestorRespostaDTO.convertToDTO(g), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return gestorService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return gestorService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeGestor (@PathVariable int id) {
        return gestorService.removeGestor(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<GestorRespostaDTO> updateGestor(@PathVariable int id, @RequestBody GestorDTO dto) {
       Gestor g = gestorService.atualizaGestor(id, dto.convertToObject());
        return new ResponseEntity<>(GestorRespostaDTO.convertToDTO(g), HttpStatus.OK);
    }
}
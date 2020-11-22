package com.uff.br.controllers;

import com.uff.br.DTO.UsuarioDTO;
import com.uff.br.DTO.UsuarioRespostaDTO;
import com.uff.br.entities.Usuario;
import com.uff.br.services.UsuarioService;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // This means that this class is a Controller
@RequestMapping(path="/usuario", produces = MediaType.APPLICATION_JSON_VALUE) // This means URL's start with /demo (after Application path)
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<UsuarioRespostaDTO> addNewUser (@RequestBody UsuarioDTO dto) {
        Usuario u = usuarioService.salvar(dto.convertToObject());
        return new ResponseEntity<>(UsuarioRespostaDTO.convertToDTO(u), HttpStatus.CREATED);
    }

    @GetMapping(path="")
    public RequestStatus findAll () {
        return usuarioService.getAll();
    }

    @GetMapping(path="/{id}")
    public RequestStatus findById (@PathVariable int id) {
        return usuarioService.getById(id);
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeUser (@PathVariable int id) {
        return usuarioService.removeUsuario(id);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<UsuarioRespostaDTO> updateUser(@PathVariable int id, @RequestBody UsuarioDTO dto) {
        Usuario u = usuarioService.atualizaUsuario(id, dto.convertToObject());
        return new ResponseEntity<>(UsuarioRespostaDTO.convertToDTO(u), HttpStatus.OK);
    }
}
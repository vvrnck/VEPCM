package com.uff.br.controllers;


import com.uff.br.DTO.EnderecoDTO;
import com.uff.br.DTO.EnderecoRespostaDTO;
import com.uff.br.entities.Endereco;
import com.uff.br.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.uff.br.utils.RequestStatus;


@RestController // This means that this class is a Controller
@RequestMapping(path="/endereco") // This means URL's start with /demo (after Application path)
public class EnderecoController {
    private final EnderecoService enderecoService;

    @Autowired
    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

   /* @PostMapping(path="") // Map ONLY POST Requests
    public ResponseEntity<EnderecoRespostaDTO> addNewEndereco (@RequestBody EnderecoDTO dto) {
        Endereco e = enderecoService.salvar(dto.convertToObject());
        return new ResponseEntity<>(EnderecoRespostaDTO.convertToDTO(e), HttpStatus.CREATED);
    }
*/
    @GetMapping(path="")
    public Iterable<Endereco> findAll () {
        return enderecoService.getAll();
    }

    @DeleteMapping(path="/{id}")
    public RequestStatus removeEndereco (@PathVariable int id) {
        return enderecoService.removeEndereco(id);
    }
}




package com.uff.br.controllers;


import com.uff.br.entities.Endereco;
import com.uff.br.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.uff.br.utils.RequestStatus;

@Controller // This means that this class is a Controller
@RequestMapping(path="/endereco") // This means URL's start with /demo (after Application path)
public class EnderecoController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private EnderecoRepository enderecoRepository;

    @PostMapping(path="") // Map ONLY POST Requests
    public @ResponseBody RequestStatus addNewEndereco (@RequestBody Endereco endereco) {
        Endereco newEndereco = enderecoRepository.save(endereco);
        return new RequestStatus(HttpStatus.OK.value(), newEndereco);
    }

    @GetMapping(path="")
    public @ResponseBody Iterable<Endereco> getAllEndereco() {
        // This returns a JSON or XML with the users
        return enderecoRepository.findAll();
    }

    @DeleteMapping(path="/{id}")
    public @ResponseBody RequestStatus removeEndereco (@PathVariable int id) {
        enderecoRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value());
    }
}
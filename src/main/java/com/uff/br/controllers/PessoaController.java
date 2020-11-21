package com.uff.br.controllers;

import com.uff.br.repository.PessoaRepository;
import com.uff.br.entities.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.uff.br.utils.RequestStatus;

@Controller // This means that this class is a Controller
@RequestMapping(path="/pessoa") // This means URL's start with /demo (after Application path)
public class PessoaController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private PessoaRepository pessoaRepository;

    @PostMapping(path="") // Map ONLY POST Requests
    public @ResponseBody RequestStatus addNewPerson (@RequestBody Pessoa pessoa) {
        Pessoa newPerson = pessoaRepository.save(pessoa);
        return new RequestStatus(HttpStatus.OK.value(), newPerson);
    }

    @GetMapping(path="")
    public @ResponseBody Iterable<Pessoa> getAllPersons() {
        // This returns a JSON or XML with the users
        return pessoaRepository.findAll();
    }

    @DeleteMapping(path="/{id}")
    public @ResponseBody RequestStatus removePerson (@PathVariable int id) {
        pessoaRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value());
    }
}
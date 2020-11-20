package com.uff.br.controllers;

import com.uff.br.entities.UnidadeEscolar;
import com.uff.br.repository.PessoaRepository;
import com.uff.br.entities.Pessoa;
import com.uff.br.repository.UnidadeEscolarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.uff.br.utils.RequestStatus;

@Controller // This means that this class is a Controller
@RequestMapping(path="/UnidadeEscolar") // This means URL's start with /demo (after Application path)
public class UnidadeEscolarController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UnidadeEscolarRepository unidadeescolarRepository;

    @PostMapping(path="") // Map ONLY POST Requests
    public @ResponseBody RequestStatus addNewUnidadeEscolar(@RequestBody UnidadeEscolar unidadeescolar) {
        UnidadeEscolar newUnidadeEscolar = UnidadeEscolarRepository.save(unidadeescolar);
        return new RequestStatus(HttpStatus.OK.value(), newUnidadeEscolar);
    }

    @GetMapping(path="")
    public @ResponseBody Iterable<UnidadeEscolar> getAllUniadeEscolar() {
        // This returns a JSON or XML with the users
        return unidadeescolarRepository.findAll();
    }

    @DeleteMapping(path="/{id}")
    public @ResponseBody RequestStatus removePerson (@PathVariable int id) {
       unidadeescolarRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value());
    }
}
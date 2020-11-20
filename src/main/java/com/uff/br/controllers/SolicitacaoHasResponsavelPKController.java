package com.uff.br.controllers;

import com.uff.br.entities.SolicitacaoHasResponsavelPK;
import com.uff.br.repository.PessoaRepository;
import com.uff.br.entities.Pessoa;
import com.uff.br.repository.SolicitacaoHasResponsavelPKRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.uff.br.utils.RequestStatus;

@Controller // This means that this class is a Controller
@RequestMapping(path="/SolicitacaoHasResponsavelPK") // This means URL's start with /demo (after Application path)
public class SolicitacaoHasResponsavelPKController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private SolicitacaoHasResponsavelPKRepository solicitacaoHasResponsavelPKRepository;

    @PostMapping(path="") // Map ONLY POST Requests
    public @ResponseBody RequestStatus addNewSolicitacaoHasResponsavelPK (@RequestBody SolicitacaoHasResponsavelPK soliresppk) {
        SolicitacaoHasResponsavelPK newSoliRespPK = solicitacaoHasResponsavelPKRepository.save(soliresppk);
        return new RequestStatus(HttpStatus.OK.value(), newSoliRespPK);
    }

    @GetMapping(path="")
    public @ResponseBody Iterable<SolicitacaoHasResponsavelPK> getAllSolicitacaoHasResponsavelPK() {
        // This returns a JSON or XML with the users
        return solicitacaoHasResponsavelPKRepository.findAll();
    }

    @DeleteMapping(path="/{id}")
    public @ResponseBody RequestStatus removePerson (@PathVariable int id) {
        solicitacaoHasResponsavelPKRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value());
    }
}
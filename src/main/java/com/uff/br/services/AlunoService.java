package com.uff.br.services;

import com.uff.br.entities.Aluno;
import com.uff.br.entities.Endereco;
import com.uff.br.entities.Pessoa;
import com.uff.br.repository.AlunoRepository;
import com.uff.br.repository.PessoaRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno salvar(Aluno aluno) {

        return alunoRepository.save(aluno); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), alunoRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), alunoRepository.findById(id));
    }

    public RequestStatus removeAluno (int id) {
        alunoRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Aluno removido com sucesso!");
    }

    public Aluno atualizaAluno (int id, Aluno aluno) {
        Optional<Aluno> a = alunoRepository.findById(id);
        if (a.isPresent()) {
            a.get().setNaturalidade(aluno.getNaturalidade());
            a.get().setNomeMae(aluno.getNomeMae());
            a.get().setNomePai(aluno.getNomePai());
            a.get().setIdPessoa(aluno.getIdPessoa());
            a.get().setIdResponsavelAluno(aluno.getIdResponsavelAluno());
            a.get().setListaEspera(aluno.getListaEspera());
            a.get().setIdSolicitacaoRespAluno(aluno.getIdSolicitacaoRespAluno());
        }
        return alunoRepository.save(a.get());
    }
}
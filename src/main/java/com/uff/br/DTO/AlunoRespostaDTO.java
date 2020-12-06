package com.uff.br.DTO;

import com.uff.br.entities.*;

import java.util.Set;

public class AlunoRespostaDTO {
    private int id;
    private String naturalidade;
    private String nomeMae;
    private String nomePai;
    private Pessoa idPessoa;
    private ResponsavelAluno idResponsavelAluno;
    private Set<ListaEspera> listaEspera;
    private SolicitacaoRespAluno idSolicitacaoRespAluno;


    private AlunoRespostaDTO(int id, String naturalidade, String nomeMae, String nomePai, Pessoa idPessoa, ResponsavelAluno idResponsavelAluno, Set<ListaEspera> listaEspera, SolicitacaoRespAluno idSolicitacaoRespAluno){
        this.id = id;
        this.naturalidade = naturalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.idPessoa= idPessoa;
        this.idResponsavelAluno = idResponsavelAluno;
        this.listaEspera = listaEspera;
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;

    }

    public static AlunoRespostaDTO convertToDTO(Aluno aluno) {
        return new AlunoRespostaDTO(aluno.getId(), aluno.getNaturalidade(), aluno.getNomeMae(), aluno.getNomePai(), aluno.getIdPessoa(), aluno.getIdResponsavelAluno(), aluno.getListaEspera(), aluno.getIdSolicitacaoRespAluno());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    public ResponsavelAluno getIdResponsavelAluno() {
        return idResponsavelAluno;
    }

    public void setIdResponsavelAluno(ResponsavelAluno idResponsavelAluno) {
        this.idResponsavelAluno = idResponsavelAluno;
    }

    public Set<ListaEspera> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(Set<ListaEspera> listaEspera) {
        this.listaEspera = listaEspera;
    }

    public SolicitacaoRespAluno getIdSolicitacaoRespAluno() {
        return idSolicitacaoRespAluno;
    }

    public void setIdSolicitacaoRespAluno(SolicitacaoRespAluno idSolicitacaoRespAluno) {
        this.idSolicitacaoRespAluno = idSolicitacaoRespAluno;
    }
}
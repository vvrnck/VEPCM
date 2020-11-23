package com.uff.br.DTO;

import com.uff.br.entities.Aluno;
import com.uff.br.entities.Pessoa;

public class AlunoRespostaDTO {
    private int id;
    private String naturalidade;
    private String nomeMae;
    private String nomePai;
    private Pessoa idPessoa;
    private Pessoa idResponsavel;


    private AlunoRespostaDTO(int id, String naturalidade, String nomeMae, String nomePai, Pessoa idPessoa, Pessoa idResponsavel){
        this.id = id;
        this.naturalidade = naturalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.idPessoa= idPessoa;
        this.idResponsavel = idResponsavel;

    }

    public static AlunoRespostaDTO convertToDTO(Aluno aluno) {
        return new AlunoRespostaDTO(aluno.getId(), aluno.getNaturalidade(), aluno.getNomeMae(), aluno.getNomePai(), aluno.getIdPessoa(), aluno.getIdResponsavel());
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

    public Pessoa getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Pessoa idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
}
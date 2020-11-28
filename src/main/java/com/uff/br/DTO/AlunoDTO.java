package com.uff.br.DTO;


import com.uff.br.entities.Aluno;
import com.uff.br.entities.ListaEspera;
import com.uff.br.entities.Pessoa;
//import com.uff.br.entities.Responsavel;

import java.util.Set;


public class AlunoDTO {
    private String naturalidade;
    private String nomeMae;
    private String nomePai;
    private Pessoa idPessoa;
    /*private Responsavel idResponsavel;
    */private Set<ListaEspera> listaEspera;

    public Aluno convertToObject() {
        return new Aluno (naturalidade, nomeMae, nomePai, idPessoa,/* idResponsavel,*/ listaEspera);
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
/*
    public Responsavel getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Responsavel idResponsavel) {
        this.idResponsavel = idResponsavel;
    }*/

    public Set<ListaEspera> getListaEspera() {
        return listaEspera;
    }

    public void setListaEspera(Set<ListaEspera> listaEspera) {
        this.listaEspera = listaEspera;
    }
}

package com.uff.br.DTO;

import com.uff.br.entities.Aluno;
import com.uff.br.entities.ListaEspera;
import com.uff.br.entities.Pessoa;
//import com.uff.br.entities.Responsavel;

import java.util.Set;

public class AlunoRespostaDTO {
    private int id;
    private String naturalidade;
    private String nomeMae;
    private String nomePai;
    private Pessoa idPessoa;
//    private Responsavel idResponsavel;
    private Set<ListaEspera> listaEspera;


    private AlunoRespostaDTO(int id, String naturalidade, String nomeMae, String nomePai, Pessoa idPessoa, /*Responsavel idResponsavel,*/ Set<ListaEspera> listaEspera){
        this.id = id;
        this.naturalidade = naturalidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.idPessoa= idPessoa;
//        this.idResponsavel = idResponsavel;
        this.listaEspera = listaEspera;

    }

    public static AlunoRespostaDTO convertToDTO(Aluno aluno) {
        return new AlunoRespostaDTO(aluno.getId(), aluno.getNaturalidade(), aluno.getNomeMae(), aluno.getNomePai(), aluno.getIdPessoa(), /*aluno.getIdResponsavel(),*/ aluno.getListaEspera());
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

    /*public Responsavel getIdResponsavel() {
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
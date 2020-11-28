/*
package com.uff.br.DTO;

import com.uff.br.entities.*;


public class UnidadeEscolarAnoEscolaridadeRespostaDTO {
    private int id;
    private String nome;
    private int numVagas;
    private String data;
 */
/*   private Set<Solicitacao> solicitacao;*//*

    private  AnoEscolaridade anoEscolaridade;
    private UnidadeEscolar unidadeEscolar;


    private UnidadeEscolarAnoEscolaridadeRespostaDTO(int id, String nome, int numVagas, String data, AnoEscolaridade anoEscolaridade, UnidadeEscolar unidadeEscolar){
        this.id = id;
        this.nome = nome;
        this.numVagas = numVagas;
        this.data = data;
       */
/* this.solicitacao = solicitacao;*//*

        this.anoEscolaridade = anoEscolaridade;
        this.unidadeEscolar = unidadeEscolar;
    }

    public static UnidadeEscolarAnoEscolaridadeRespostaDTO convertToDTO(UnidadeEscolarAnoEscolaridade ueae) {
        return new UnidadeEscolarAnoEscolaridadeRespostaDTO(ueae.getId(), ueae.getNome(), ueae.getNumVagas(), ueae.getData(), */
/*ueae.getSolicitacao(),*//*
 ueae.getAnoEscolaridade(), ueae.getUnidadeEscolar());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

  */
/*  public Set<Solicitacao> getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Set<Solicitacao> solicitacao) {
        this.solicitacao = solicitacao;
    }*//*


    public AnoEscolaridade getAnoEscolaridade() {
        return anoEscolaridade;
    }

    public void setAnoEscolaridade(AnoEscolaridade anoEscolaridade) {
        this.anoEscolaridade = anoEscolaridade;
    }

    public UnidadeEscolar getUnidadeEscolar() {
        return unidadeEscolar;
    }

    public void setUnidadeEscolar(UnidadeEscolar unidadeEscolar) {
        this.unidadeEscolar = unidadeEscolar;
    }
}

*/

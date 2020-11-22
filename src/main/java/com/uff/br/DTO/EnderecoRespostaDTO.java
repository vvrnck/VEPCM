package com.uff.br.DTO;

import com.uff.br.entities.Endereco;


public class EnderecoRespostaDTO {
    private int id;
    private String logradouro;
    private String numero;
    private String cep;
    private String uf;
    private String municipio;
    private String bairro;

    private EnderecoRespostaDTO(int id, String logradouro, String numero, String cep, String uf, String municipio, String bairro){
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.uf = uf;
        this.municipio = municipio;
        this.bairro = bairro;
    }

    public static EnderecoRespostaDTO convertToDTO(Endereco endereco) {
        return new EnderecoRespostaDTO(endereco.getId(), endereco.getLogradouro(), endereco.getNumero(), endereco.getCep(), endereco.getUf(), endereco.getMunicipio(), endereco.getBairro());
    }
}

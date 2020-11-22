package com.uff.br.DTO;

import com.uff.br.entities.Endereco;

public class EnderecoDTO {
    private String logradouro;
    private String numero;
    private String cep;
    private String uf;
    private String municipio;
    private String bairro;


    public Endereco convertToObject() {
        return new Endereco(logradouro, numero, cep, uf, municipio, bairro);
    }

}

package com.uff.br.entities;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "cep")
    private String cep;

    @Column(name = "uf")
    private String uf;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "bairro")
    private String bairro;

}

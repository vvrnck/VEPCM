package com.uff.br.entities;

import javax.persistence.*;


@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    //    //@OneToMany(cascade = CascadeType.ALL)
//    @Column(name = "endereco")
//    private Endereco endereco;

    @Column(name = "identidade")
    private String identidade;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "celular")
    private String celular;

    @Column(name = "dtNasc")
    private String dtNasc;

}

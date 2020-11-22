package com.uff.br.entities;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")
        , @NamedQuery(name = "Pessoa.findById", query = "SELECT p FROM Pessoa p WHERE p.id = :id")
        , @NamedQuery(name = "Pessoa.findByIdentidade", query = "SELECT p FROM Pessoa p WHERE p.identidade = :identidade")
        , @NamedQuery(name = "Pessoa.findByNome", query = "SELECT p FROM Pessoa p WHERE p.nome = :nome")
        , @NamedQuery(name = "Pessoa.findByEmail", query = "SELECT p FROM Pessoa p WHERE p.email = :email")
        , @NamedQuery(name = "Pessoa.findByCpf", query = "SELECT p FROM Pessoa p WHERE p.cpf = :cpf")
        , @NamedQuery(name = "Pessoa.findBySexo", query = "SELECT p FROM Pessoa p WHERE p.sexo = :sexo")
        , @NamedQuery(name = "Pessoa.findByCelular", query = "SELECT p FROM Pessoa p WHERE p.celular = :celular")
        , @NamedQuery(name = "Pessoa.findByDtNasc", query = "SELECT p FROM Pessoa p WHERE p.dtNasc = :dtNasc")})
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "identidade")
    private String identidade;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "celular")
    private String celular;

    @Column(name = "dtNasc")
    private String dtNasc;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco", referencedColumnName = "id")
    private Endereco endereco;

    public Pessoa() {}

    public Pessoa(String nome, String email, String identidade, String cpf, String sexo, String celular, String dtNasc, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.identidade = identidade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.celular = celular;
        this.dtNasc = dtNasc;
        this.endereco = endereco;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }
}

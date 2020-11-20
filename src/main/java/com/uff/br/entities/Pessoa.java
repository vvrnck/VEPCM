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

    /*@OneToOne(optional = false, mappedBy = "pessoa")
    private Usuario usuario;*/

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    /*public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;

    }

     */
}

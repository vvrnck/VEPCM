package com.uff.br.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.uff.br.utils.TipoUsuario;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    private TipoUsuario tipoUsuario;

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa", referencedColumnName = "id")
    private Pessoa pessoa;



    public Usuario() {}

    public Usuario(String email, String senha, TipoUsuario tipoUsuario, Pessoa pessoa) {
        this.email = email;
        this.senha = senha;
        this.pessoa = pessoa;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}

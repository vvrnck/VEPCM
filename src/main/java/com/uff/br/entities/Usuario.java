package com.uff.br.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;


@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @OneToOne(optional = false)
    @JoinColumn(name = "pessoa_id", nullable = false)
    @NonNull
    private Pessoa pessoa;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "senha")
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    @NonNull
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(@NonNull Pessoa pessoa) {
        this.pessoa = pessoa;
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

}

package com.uff.br.DTO;

import com.uff.br.entities.*;

import java.util.Set;

public class PessoaDTO {
    private String nome;
    //private String email;
    private String identidade;
    private String cpf;
    private String sexo;
    private String celular;
    private String dtNasc;
    private Endereco endereco;
    private Usuario usuario;
    private Set<Aluno> alunos;
    private Set<Responsavel> responsavel;
    private Set<Gestor>gestores;

    public Pessoa convertToObject() {
        return new Pessoa(nome, identidade, cpf, sexo, celular, dtNasc, endereco, usuario, alunos, responsavel, gestores);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
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

    public String getDtNasc() { return dtNasc; }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Set<Responsavel> getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Set<Responsavel> responsavel) {
        this.responsavel = responsavel;}

    public Set<Gestor> getGestores() {
        return gestores;
    }

    public void setGestores(Set<Gestor> gestores) {
        this.gestores = gestores;

    }
}

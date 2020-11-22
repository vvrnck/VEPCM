package com.uff.br.DTO;

import com.uff.br.entities.Endereco;
import com.uff.br.entities.Pessoa;
import com.uff.br.entities.Usuario;

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

    public Pessoa convertToObject() {
        return new Pessoa(nome, identidade, cpf, sexo, celular, dtNasc, endereco, usuario);
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

    public String getDtNasc() {
        return dtNasc;
    }

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
}

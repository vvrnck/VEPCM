package com.uff.br.DTO;

import com.uff.br.entities.Endereco;
import com.uff.br.entities.Pessoa;
import com.uff.br.entities.Usuario;

public class PessoaRespostaDTO {
    private int id;
    private String nome;
    //private String email;
    private String cpf;
    private String identidade;
    private String sexo;
    private String celular;
    private String dtNasc;
    private Endereco endereco;
    private Usuario usuario;

    private PessoaRespostaDTO(int id, String nome, String cpf, String identidade, String sexo, String celular, String dtNasc, Endereco endereco, Usuario usuario){
        this.id = id;
        this.nome = nome;
        //this.email = email;
        this.cpf = cpf;
        this.identidade = identidade;
        this.sexo = sexo;
        this.celular = celular;
        this.dtNasc = dtNasc;
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public static PessoaRespostaDTO convertToDTO(Pessoa pessoa) {
        return new PessoaRespostaDTO(pessoa.getId(), pessoa.getNome(), pessoa.getCpf(), pessoa.getIdentidade(), pessoa.getSexo(), pessoa.getCelular(), pessoa.getDtNasc(), pessoa.getEndereco(), pessoa.getUsuario());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
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

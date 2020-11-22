package com.uff.br.DTO;

import com.uff.br.entities.Endereco;
import com.uff.br.entities.Pessoa;

public class PessoaRespostaDTO {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String identidade;
    private String sexo;
    private String celular;
    private String dtNasc;
    private Endereco endereco;

    private PessoaRespostaDTO(int id, String nome, String email, String cpf, String identidade, String sexo, String celular, String dtNasc, Endereco endereco){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.identidade = identidade;
        this.sexo = sexo;
        this.celular = celular;
        this.dtNasc = dtNasc;
        this.endereco = endereco;
    }

    public static PessoaRespostaDTO convertToDTO(Pessoa pessoa) {
        return new PessoaRespostaDTO(pessoa.getId(), pessoa.getNome(), pessoa.getEmail(), pessoa.getCpf(), pessoa.getIdentidade(), pessoa.getSexo(), pessoa.getCelular(), pessoa.getDtNasc(), pessoa.getEndereco());
    }
}

package com.uff.br.DTO;

import com.uff.br.entities.Endereco;
import com.uff.br.entities.Pessoa;

public class PessoaDTO {
    private String nome;
    private String email;
    private String identidade;
    private String cpf;
    private String sexo;
    private String celular;
    private String dtNasc;
    private Endereco endereco;

    public Pessoa convertToObject() {
        return new Pessoa(nome, email, identidade, cpf, sexo, celular, dtNasc, endereco);
    }

}

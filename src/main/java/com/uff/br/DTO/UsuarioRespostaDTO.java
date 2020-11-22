package com.uff.br.DTO;

import com.uff.br.entities.Endereco;
import com.uff.br.entities.Pessoa;
import com.uff.br.entities.Usuario;

public class UsuarioRespostaDTO {
    private int id;
    private String email;
    private String senha;
    private Pessoa pessoa;

    private UsuarioRespostaDTO(int id, String email, String senha, Pessoa pessoa){
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.pessoa = pessoa;
    }

    public static UsuarioRespostaDTO convertToDTO(Usuario u) {
        return new UsuarioRespostaDTO(u.getId(), u.getEmail(), u.getSenha(), u.getPessoa());
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
}

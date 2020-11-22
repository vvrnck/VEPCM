package com.uff.br.DTO;


import com.uff.br.entities.Pessoa;
import com.uff.br.entities.Usuario;
import com.uff.br.utils.TipoUsuario;

public class UsuarioDTO {

    private String email;
    private String senha;
    private Pessoa pessoa;
    private TipoUsuario tipoUsuario;

    public Usuario convertToObject() {
        return new Usuario(email, senha, tipoUsuario, pessoa);
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

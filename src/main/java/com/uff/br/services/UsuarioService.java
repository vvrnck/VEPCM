package com.uff.br.services;

import com.uff.br.entities.Endereco;
import com.uff.br.entities.Pessoa;
import com.uff.br.entities.Usuario;
import com.uff.br.repository.PessoaRepository;
import com.uff.br.repository.UsuarioRepository;
import com.uff.br.utils.RequestStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) { return usuarioRepository.save(usuario); }

    public RequestStatus getAll() {
        return new RequestStatus(HttpStatus.OK.value(), usuarioRepository.findAll());
    }

    public RequestStatus getById(int id) {
        return new RequestStatus(HttpStatus.OK.value(), usuarioRepository.findById(id));
    }

    public RequestStatus removeUsuario (int id) {
        usuarioRepository.deleteById(id);
        return new RequestStatus(HttpStatus.OK.value(), "Usuário removido com sucesso!");
    }

    public Usuario atualizaUsuario (int id, Usuario usuario) {
        Optional<Usuario> u = usuarioRepository.findById(id);
        if (u.isPresent()) {
            u.get().setEmail(usuario.getEmail());
            u.get().setSenha(usuario.getSenha());
            u.get().setPessoa(usuario.getPessoa());
            u.get().setTipoUsuario(usuario.getTipoUsuario());
        }
        return usuarioRepository.save(u.get());
    }

}
package com.sinqia.participants.module.Cadastro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinqia.participants.module.Cadastro.Repository.UsuarioRepository;
import com.sinqia.participants.module.Cadastro.model.Usuario;
import com.sinqia.participants.module.Utils.UsuarioConverter;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    private UsuarioConverter usuarioConverter; 

    public Usuario cadastrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarUsuarioPorCodigoExterno(Long codigoExterno) {
        return usuarioRepository.findById(codigoExterno);
    }

  
    public Usuario atualizarUsuario(Long codigoExterno, Usuario usuarioAtualizado) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(codigoExterno);
        if (usuarioOptional.isPresent()) {
            Usuario usuarioExistente = usuarioOptional.get();
            usuarioExistente.setCodigoExterno(usuarioAtualizado.getCodigoExterno());
            usuarioExistente.setNome(usuarioAtualizado.getNome());
            usuarioExistente.setEmail(usuarioAtualizado.getEmail());
            usuarioExistente.setCpf(usuarioAtualizado.getCpf());
            usuarioExistente.setSexo(usuarioAtualizado.getSexo());
            usuarioExistente.setEstadoCivil(usuarioAtualizado.getEstadoCivil());
            usuarioExistente.setConjuge(usuarioAtualizado.getConjuge());
            usuarioExistente.setDocumentoIdentificacao(usuarioAtualizado.getDocumentoIdentificacao());
            usuarioExistente.setObservacao(usuarioAtualizado.getObservacao());
            usuarioExistente.setCondicaoPessoal(usuarioAtualizado.getCondicaoPessoal());
            usuarioExistente.setTelefone(usuarioAtualizado.getTelefone());
            usuarioExistente.setTelefoneCelular(usuarioAtualizado.getTelefoneCelular());
            usuarioExistente.setValidadeFicha(usuarioAtualizado.getValidadeFicha());
            usuarioExistente.setDataNascimento(usuarioAtualizado.getDataNascimento());
            usuarioExistente.setToken(usuarioAtualizado.getToken());
            usuarioExistente.setPoliticamenteExposta(usuarioAtualizado.getPoliticamenteExposta());
            usuarioExistente.setAssinaturaDigital(usuarioAtualizado.getAssinaturaDigital());
    
            return usuarioRepository.save(usuarioExistente);
        } else {
            return null; 
        }
    }

    public void excluirUsuario(Long codigoExterno) {
        usuarioRepository.deleteById(codigoExterno);
    }

}
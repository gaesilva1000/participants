package com.sinqia.participants.module.Utils;

import com.sinqia.participants.module.Cadastro.Dto.UsuarioDTO;
import com.sinqia.participants.module.Cadastro.model.Usuario;

public class UsuarioConverter {

    public static Usuario convertToUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setCodigoExterno(usuarioDTO.getCodigoExterno());
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setCpf(usuarioDTO.getCpf());
        usuario.setSexo(usuarioDTO.getSexo());
        usuario.setEstadoCivil(usuarioDTO.getEstadoCivil());
        usuario.setConjuge(usuarioDTO.getConjuge());
        usuario.setDocumentoIdentificacao(usuarioDTO.getDocumentoIdentificacao());
        usuario.setObservacao(usuarioDTO.getObservacao());
        usuario.setCondicaoPessoal(usuarioDTO.getCondicaoPessoal());
        usuario.setTelefone(usuarioDTO.getTelefone());
        usuario.setTelefoneCelular(usuarioDTO.getTelefoneCelular());
        usuario.setValidadeFicha(usuarioDTO.getValidadeFicha());
        usuario.setDataNascimento(usuarioDTO.getDataNascimento());
        usuario.setToken(usuarioDTO.getToken());
        usuario.setPoliticamenteExposta(usuarioDTO.getPoliticamenteExposta());
        usuario.setAssinaturaDigital(usuarioDTO.getAssinaturaDigital());
        return usuario;
    }

    public static UsuarioDTO convertToUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setCodigoExterno(usuario.getCodigoExterno());
        usuarioDTO.setNome(usuario.getNome());
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setCpf(usuario.getCpf());
        usuarioDTO.setSexo(usuario.getSexo());
        usuarioDTO.setEstadoCivil(usuario.getEstadoCivil());
        usuarioDTO.setConjuge(usuario.getConjuge());
        usuarioDTO.setDocumentoIdentificacao(usuario.getDocumentoIdentificacao());
        usuarioDTO.setObservacao(usuario.getObservacao());
        usuarioDTO.setCondicaoPessoal(usuario.getCondicaoPessoal());
        usuarioDTO.setTelefone(usuario.getTelefone());
        usuarioDTO.setTelefoneCelular(usuario.getTelefoneCelular());
        usuarioDTO.setValidadeFicha(usuario.getValidadeFicha());
        usuarioDTO.setDataNascimento(usuario.getDataNascimento());
        usuarioDTO.setToken(usuario.getToken());
        usuarioDTO.setPoliticamenteExposta(usuario.getPoliticamenteExposta());
        usuarioDTO.setAssinaturaDigital(usuario.getAssinaturaDigital());
        return usuarioDTO;
    }
}
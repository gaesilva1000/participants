package com.sinqia.participants.module.Cadastro.Dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UsuarioDTO {

    private Long codigoExterno;
    private String nome;
    private String email;
    private String cpf;
    private String sexo;
    private String estadoCivil;
    private String conjuge;
    private String documentoIdentificacao;
    private String observacao;
    private String condicaoPessoal;
    private String telefone;
    private String telefoneCelular;
    private LocalDate validadeFicha;
    private LocalDate dataNascimento;
    private Boolean token;
    private Boolean politicamenteExposta;
    private Boolean assinaturaDigital;

}
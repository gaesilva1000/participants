package com.sinqia.participants.module.Cadastro.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    private Long codigoExterno;

    @Column(name = "nome_column")
    private String nome;

    @Column(name = "email_column")
    private String email;

    @Column(name = "cpf_column")
    private String cpf;

    @Column(name = "sexo_column")
    private String sexo;

    @Column(name = "estado_civil_column")
    private String estadoCivil;

    @Column(name = "conjuge_column")
    private String conjuge;

    @Column(name = "documento_identificacao_column")
    private String documentoIdentificacao;

    @Column(name = "observacao_column")
    private String observacao;

    @Column(name = "condicao_pessoal_column")
    private String condicaoPessoal;

    @Column(name = "telefone_column")
    private String telefone;

    @Column(name = "telefone_celular_column")
    private String telefoneCelular;

    @Column(name = "validade_ficha_column")
    private LocalDate validadeFicha;

    @Column(name = "data_nascimento_column")
    private LocalDate dataNascimento;

    @Column(name = "token_column")
    private Boolean token;

    @Column(name = "politicamente_exposta_column")
    private Boolean politicamenteExposta;

    @Column(name = "assinatura_digital_column")
    private Boolean assinaturaDigital;
}
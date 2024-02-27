package com.sinqia.participants.module.Cadastro.Repository;

import com.sinqia.participants.module.Cadastro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
package com.jecesario.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jecesario.blog.models.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	public Optional<Usuarios> findByUsuario(String usuario);
}

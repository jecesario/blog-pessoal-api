 package com.jecesario.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jecesario.blog.models.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}

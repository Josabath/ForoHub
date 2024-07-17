package com.forohub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findByEstadoActivoTrue(Pageable paginacion);

    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}
package com.forohub.domain.topico;

import com.forohub.domain.curso.NombreCurso;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull Long id,
        String mensaje,
        String titulo,
        NombreCurso nombreCurso
) {
}
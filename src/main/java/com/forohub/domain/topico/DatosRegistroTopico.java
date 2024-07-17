package com.forohub.domain.topico;

import com.forohub.domain.curso.NombreCurso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor,
        @NotNull NombreCurso nombreCurso) {
}
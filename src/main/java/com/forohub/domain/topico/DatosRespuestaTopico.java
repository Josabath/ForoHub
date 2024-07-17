package com.forohub.domain.topico;

import com.forohub.domain.curso.NombreCurso;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, String fechaCrecacion,
                                   Boolean estadoActivo, String autor, NombreCurso nombreCurso) {
}
package com.forohub.domain.topico;

import com.forohub.domain.curso.NombreCurso;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        Boolean estadoActivo,
        String fechaCreacion,
        String autor,
        NombreCurso nombreCurso
) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.isEstadoActivo(), topico.getFechaCreacion()
                , topico.getAutor(), topico.getNombreCurso());
    }
}
package com.forohub.domain.topico;

import com.forohub.domain.curso.NombreCurso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    private boolean estadoActivo;
    private String autor;
    @Enumerated(EnumType.STRING)
    private NombreCurso nombreCurso;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.estadoActivo = true;
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.autor = datosRegistroTopico.autor();
        this.nombreCurso = datosRegistroTopico.nombreCurso();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.fechaCreacion = LocalDateTime.now().format(formatter);
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {

        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.nombreCurso() != null) {
            this.nombreCurso = datosActualizarTopico.nombreCurso();
        }
    }

    public void desactivarTopico() {
        this.estadoActivo = false;
    }
}
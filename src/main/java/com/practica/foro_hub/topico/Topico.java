package com.practica.foro_hub.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaDeCreacion;
    private String status;
    private String autor;
    private String curso;

    public Topico(DatosRegistrarTopico datosTopico){
        this.titulo = datosTopico.titulo();
        this.mensaje = datosTopico.mensaje();
        this.fechaDeCreacion = datosTopico.fechaDeCreacion();
        this.status = datosTopico.status();
        this.autor = datosTopico.autor();
        this.curso = datosTopico.curso();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if(datosActualizarTopico.fechaDeCreacion() != null){
            this.fechaDeCreacion = datosActualizarTopico.fechaDeCreacion();
        }
        if(datosActualizarTopico.status() != null){
            this.status = datosActualizarTopico.status();
        }
        if(datosActualizarTopico.autor() != null){
            this.autor = datosActualizarTopico.autor();
        }
        if(datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();
        }
    }
}

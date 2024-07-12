package com.practica.foro_hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistrarTopico(
        @NotNull @NotBlank
        String titulo,
        @NotNull @NotBlank
        String mensaje,
        @NotNull
        LocalDateTime fechaDeCreacion,
        @NotNull @NotBlank
        String status,
        @NotNull @NotBlank
        String autor,
        @NotNull @NotBlank
        String curso
) {
}

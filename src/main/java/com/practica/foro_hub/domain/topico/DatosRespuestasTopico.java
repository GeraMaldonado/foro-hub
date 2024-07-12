package com.practica.foro_hub.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestasTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaDeCreacion,
        String status,
        String autor,
        String curso
) {
}

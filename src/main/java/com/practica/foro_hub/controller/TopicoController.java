package com.practica.foro_hub.controller;

import com.practica.foro_hub.domain.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

@RestController
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestasTopico> registrarTopico(@RequestBody @Valid DatosRegistrarTopico datosRegistrarTopico, UriComponentsBuilder uriComponentsBuilder){
        Topico topico = topicoRepository.save(new Topico(datosRegistrarTopico));
        DatosRespuestasTopico datosRespuestasTopico = new DatosRespuestasTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getStatus(), topico.getAutor(), topico.getCurso());
        URI url =  uriComponentsBuilder.path("/topico/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestasTopico);
    }

    @GetMapping
    public ResponseEntity<Page<DatosRespuestasTopico>> listadoTopicos(@PageableDefault(size = 10) Pageable paginacion) {
        return ResponseEntity.ok(topicoRepository.findAllByOrderByFechaDeCreacionAsc(paginacion).map(t -> new DatosRespuestasTopico(t.getId(), t.getTitulo(), t.getMensaje(), t.getFechaDeCreacion(), t.getStatus(), t.getAutor(), t.getCurso())));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestasTopico> consultarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        var datosRespuestasTopico = new DatosRespuestasTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getStatus(), topico.getAutor(), topico.getCurso());
        return ResponseEntity.ok(datosRespuestasTopico);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity actualizarTopico(@RequestBody DatosActualizarTopico datosActualizarTopico, @PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topico.actualizarDatos(datosActualizarTopico);
        return ResponseEntity.ok(new DatosRespuestasTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getStatus(), topico.getAutor(), topico.getCurso()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarTopico(@PathVariable Long id){
        topicoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

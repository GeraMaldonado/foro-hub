package com.practica.foro_hub.controller;

import com.practica.foro_hub.topico.DatosRegistrarTopico;
import com.practica.foro_hub.topico.Topico;
import com.practica.foro_hub.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistrarTopico datosRegistrarTopico){
        topicoRepository.save(new Topico(datosRegistrarTopico));
    }

    @GetMapping
    public Page<Topico> listadoTopicos(@PageableDefault(size = 10) Pageable paginacion) {
        return topicoRepository.findAllByOrderByFechaDeCreacionAsc(paginacion);
    }

    @GetMapping("/{id}")
    public Optional<Topico> consultarTopico(@PathVariable Long id){
        return topicoRepository.findById(id);
    }
}

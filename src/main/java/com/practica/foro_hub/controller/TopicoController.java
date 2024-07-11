package com.practica.foro_hub.controller;

import com.practica.foro_hub.topico.DatosRegistrarTopico;
import com.practica.foro_hub.topico.Topico;
import com.practica.foro_hub.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistrarTopico datosRegistrarTopico){
        topicoRepository.save(new Topico(datosRegistrarTopico));
    }
}

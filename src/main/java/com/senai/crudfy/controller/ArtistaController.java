package com.senai.crudfy.controller;

import com.senai.crudfy.entity.Artista;
import com.senai.crudfy.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("artista")
public class ArtistaController {

    @Autowired
    ArtistaService artistaService;

    @GetMapping
    public List<Artista> mostrar (){
        return artistaService.mostrarArtista();
    }
}

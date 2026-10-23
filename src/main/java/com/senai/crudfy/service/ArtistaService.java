package com.senai.crudfy.service;

import com.senai.crudfy.entity.Artista;
import com.senai.crudfy.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistaService {

    @Autowired
    ArtistaRepository artistaRepository;

    @GetMapping
    public List<Artista> mostrarArtista(){
        List<Artista> lista = new ArrayList<>();
        lista = artistaRepository.findAll();
        return lista;
    }
}

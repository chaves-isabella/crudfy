package com.senai.crudfy.repository;

import com.senai.crudfy.entity.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository <Musica, Integer> {


}

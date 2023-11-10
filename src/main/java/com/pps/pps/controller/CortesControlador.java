package com.pps.pps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pps.pps.modelos.CortesModelo;
import com.pps.pps.repositorios.CortesRepositorio;


@RestController
@RequestMapping("api/v1")
public class CortesControlador {
    @Autowired
    private CortesRepositorio repositorio;

    @GetMapping("/cortes")
     public List<CortesModelo> guardarCortes(){
        return repositorio.findAll();
     }
}

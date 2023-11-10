package com.pps.pps.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pps.pps.ResourceNotFoundException;
import com.pps.pps.modelos.CajaModelo;
import com.pps.pps.repositorios.CajaRepositorio;

@RestController
@RequestMapping("api/v2")
@CrossOrigin(origins = "http://localhost:56156/administracion")
public class CajaControlador {
    @Autowired
    private CajaRepositorio repositorio;

     @PostMapping("/caja")
     public CajaModelo guardarCaja(@RequestBody CajaModelo cajamodelo){
        return repositorio.save(cajamodelo);
     }

     @GetMapping("/caja/{id}") 
        public ResponseEntity<CajaModelo> obtenerCajaporId(@PathVariable Long id){
            CajaModelo cajaModelo = repositorio.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("no existe la caja con el ID:" + id));
            return ResponseEntity.ok(cajaModelo);

        }
        
    }

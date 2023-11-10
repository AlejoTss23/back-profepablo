package com.pps.pps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pps.pps.modelos.CajaModelo;

@Repository
public interface CajaRepositorio extends JpaRepository<CajaModelo, Long>{
    
}

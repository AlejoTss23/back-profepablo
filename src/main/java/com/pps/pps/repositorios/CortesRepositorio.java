package com.pps.pps.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pps.pps.modelos.CortesModelo;


@Repository
public interface CortesRepositorio extends JpaRepository<CortesModelo, Long> {

  
    
}

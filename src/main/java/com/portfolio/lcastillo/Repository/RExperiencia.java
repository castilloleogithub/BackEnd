/*
Proyecto: Mi porfolio
Autor: lcastillo
© Argentina Programa 2022
*/
package com.portfolio.lcastillo.Repository;

import com.portfolio.lcastillo.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}

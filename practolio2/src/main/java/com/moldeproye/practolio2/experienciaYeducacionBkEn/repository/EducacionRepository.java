package com.moldeproye.practolio2.experienciaYeducacionBkEn.repository;

import com.moldeproye.practolio2.experienciaYeducacionBkEn.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{

    
}


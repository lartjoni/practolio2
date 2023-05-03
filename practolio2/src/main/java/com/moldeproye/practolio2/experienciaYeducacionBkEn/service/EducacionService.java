package com.moldeproye.practolio2.experienciaYeducacionBkEn.service;

import com.moldeproye.practolio2.experienciaYeducacionBkEn.model.Educacion;
import com.moldeproye.practolio2.experienciaYeducacionBkEn.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository educaRepo;
    
    @Override
    public List<Educacion> verEducaciones() {
       return educaRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
       educaRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        educaRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educaRepo.findById(id).orElse(null);
    }


    
}

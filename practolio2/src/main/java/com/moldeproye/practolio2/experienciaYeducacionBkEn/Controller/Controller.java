package com.moldeproye.practolio2.experienciaYeducacionBkEn.Controller;
import com.moldeproye.practolio2.experienciaYeducacionBkEn.model.Educacion;
import com.moldeproye.practolio2.experienciaYeducacionBkEn.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
       
   @Autowired
    private IEducacionService educaServ;
    
   @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion educ) {
      educaServ.crearEducacion(educ);
    }
   
    @GetMapping ("/ver/educaciones")
    @ResponseBody
    public List<Educacion> verEducaciones () {
       return educaServ.verEducaciones();
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        educaServ.borrarEducacion(id);
    }
   
  
}

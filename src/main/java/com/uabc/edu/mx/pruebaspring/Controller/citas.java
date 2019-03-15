package com.uabc.edu.mx.pruebaspring.Controller;
import com.uabc.edu.mx.pruebaspring.Modelo.mModelo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class citas {

private List<mModelo> valor=new ArrayList<>();
    @GetMapping(value ="/datos")
    public String CitasHome(Model model) {

        mModelo l= new mModelo();

        model.addAttribute("Datos", new mModelo());
        model.addAttribute("addDatos", valor);

                return "plantilla";
    }

  @PostMapping(value = "/datos")
  public String addDatos(@ModelAttribute("Datos") mModelo addDatos
          , Model model) {

      valor.add(addDatos);

      model.addAttribute("addDatos", valor);

      return "plantilla";
  }
}



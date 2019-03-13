package com.uabc.edu.mx.pruebaspring.Controller;

import com.uabc.edu.mx.pruebaspring.Modelo.mModelo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController 



    public class citas {


    @GetMapping(value ="/datos")

    public String CitasHome(Model model) {

        mModelo l= new mModelo();


        model.addAttribute("Datos", new mModelo());

                return "plantilla";
            }
   @PostMapping(value = "/datos")
    public String addComment(@ModelAttribute("Datos") mModelo Datos
           , Model model) {
        model.addAttribute("addDatos",Datos);
        return "plantilla";
    }








        }



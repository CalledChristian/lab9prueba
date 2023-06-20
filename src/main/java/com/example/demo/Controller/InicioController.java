package com.example.demo.Controller;


import com.example.demo.entity.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping(value = "/")

public class InicioController {
    @GetMapping(value = "")
    public String inicio() {

        return "formularioregistro";
    }


    @PostMapping (value = "/guardarusuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {

        return "redirect:/";
    }
}
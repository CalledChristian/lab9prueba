package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private int idusuario;

    private String nombre;

    private String apellido;
    private String correo;
    private String contrasena;
    private String fechaNacimiento;


}
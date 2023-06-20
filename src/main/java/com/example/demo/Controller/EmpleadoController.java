/*package com.example.demo.Controller;


import com.example.demo.Entity.Empleado;
import com.example.demo.Repository.DepartamentoRepository;
import com.example.demo.Repository.EmpleadoRepository;
import com.example.demo.Repository.JobRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;
import java.util.Optional;

@Controller

@RequestMapping(value = "/empleados")

public class EmpleadoController {

    final EmpleadoRepository empleadoRepository;
    final JobRepository jobRepository;
    final DepartamentoRepository departamentoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository,JobRepository jobRepository,DepartamentoRepository departamentoRepository) {

        this.empleadoRepository = empleadoRepository;
        this.jobRepository = jobRepository;
        this.departamentoRepository = departamentoRepository;
    }

    @GetMapping(value = "")
    public String empleados(Model model) {
        model.addAttribute("listaempleados",empleadoRepository.findAll());
        return "empleados/listaempleados";
    }

    @GetMapping(value = "/nuevoempleado")
    public String nuevoEmpleado(Model model){
        model.addAttribute("listaPuestos",jobRepository.findAll());
        model.addAttribute("listaDepartamentos",departamentoRepository.findAll());
        model.addAttribute("listaJefes",empleadoRepository.findAll());
        return"empleados/nuevoempleado";
    }

    @PostMapping("/buscar")
    public String buscar(@RequestParam("texto") String texto, Model model){
        model.addAttribute("listaempleados",empleadoRepository.buscarEmpleados(texto));
        return "empleados/listaempleados";
    }


    @PostMapping(value = "/guardarempleado")
    @Transactional
    public String guardarEmpleado(RedirectAttributes redirectAttributes,
                                  @RequestParam("nombre") String nombre,
                                  @RequestParam("apellido") String apellido,
                                  @RequestParam("email") String email,
                                  @RequestParam("contrasena") String contrasena,
                                  @RequestParam("puesto") String puesto,
                                  @RequestParam("sueldo") BigDecimal sueldo,
                                  @RequestParam("jefe") Integer idJefe,
                                  @RequestParam("departamento") Integer departamento) {

        empleadoRepository.nuevoEmpleado(nombre,apellido,email,contrasena,puesto,sueldo,idJefe,departamento);
        redirectAttributes.addFlashAttribute("msg","Empleado creado exitosamente");
        return "redirect:/empleados";
    }

    @GetMapping(value = "/borrarempleado")
    public String borrarEmpleado(RedirectAttributes redirectAttributes, @RequestParam("id") int idEmpleado) {
        Optional<Empleado> optionalEmpleado = Optional.ofNullable(empleadoRepository.buscarEmpleadoPorId(idEmpleado));
        if (optionalEmpleado.isPresent()){
            empleadoRepository.deleteById(idEmpleado);
            redirectAttributes.addFlashAttribute("msg","Empleado borrado exitosamente");
            return "redirect:/empleados";
        }else {
            return "redirect:/empleados";
        }

    }


} */
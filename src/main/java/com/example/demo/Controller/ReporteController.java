/*package com.example.demo.Controller;


import com.example.demo.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping(value = "/reportes")

public class ReporteController {

    final JobRepository jobRepository;

    public ReporteController(JobRepository jobRepository) {

        this.jobRepository = jobRepository;

    }

    @GetMapping(value = "")
    public String reportes() {
        return "reportes/inicio";
    }


    @GetMapping(value = "/reportesalarios")
    public String reporteSalarios(Model model) {
        model.addAttribute("listaSalarios", jobRepository.reporteSalarios());
        return "reportes/salarios";
    }

    @GetMapping(value = "/tentativaaumento")
    public String tentativaAumento() {
        return "reportes/tentativaaumento";
    }

}*/
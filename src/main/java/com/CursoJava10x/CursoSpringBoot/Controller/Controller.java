package com.CursoJava10x.CursoSpringBoot.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Hello, World!!";
    }

}

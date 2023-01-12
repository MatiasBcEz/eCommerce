package cl.duoc.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController{

    @GetMapping("")
    public String getPerspma(){
        return "Juanito Perez";
    }
}

package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Correcta anotación
public class HomeController {  // Nombre de clase más específico
    @GetMapping("/index")
    public String index() {
        return "index";  // Retorna el nombre del archivo HTML sin la extensión
    }
}

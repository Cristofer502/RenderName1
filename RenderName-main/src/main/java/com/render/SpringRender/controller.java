package com.render.SpringRender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/miNombre")
    public String miNombre() {
        return "Christopher Antonio Cox Leon";  // Nombre
    }
}
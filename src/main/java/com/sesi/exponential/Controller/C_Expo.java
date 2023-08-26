package com.sesi.exponential.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Expo {
    @GetMapping("/")
    public String getBarra(){
        return "Index/index";
    }

    @PostMapping("/")
    public String postBarra(@RequestParam("number") Integer number, Model model) {
        Integer resultado = number * number;
        String resultadoFinal = number.toString() + "² = " + resultado.toString();
        model.addAttribute("resultado", resultadoFinal);
        return "Index/index";
    }

}

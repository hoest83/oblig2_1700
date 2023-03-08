package com.example.oblig2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oblig2Controller {
    @GetMapping("/")
    public String hei(String navn){
        int antallBokstaver = navn.length();
        return "hei verden " + navn + "! Navnet ditt er " + antallBokstaver + "langt";
    }
}

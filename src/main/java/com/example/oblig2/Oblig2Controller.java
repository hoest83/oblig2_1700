package com.example.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Oblig2Controller {

    public final List<oslomet.webprog.Billett> alleBilletter = new ArrayList<>();

    @GetMapping("/lagre")
    public void lagreBillett(oslomet.webprog.Billett innBillett){
        alleBilletter.add(innBillett);
    }
    @GetMapping("/hentAlle")
    public List<oslomet.webprog.Billett> hentAlle(){
        return alleBilletter;
    }

    @GetMapping("/slettAlle")
    public void slett(oslomet.webprog.Billett innBillett){
        alleBilletter.clear();
    }

}


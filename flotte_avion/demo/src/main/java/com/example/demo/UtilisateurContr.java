package com.example.demo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UtilisateurContr {
    @Autowired
    UtilServ userv;
    @GetMapping("/login")
    public String login(@RequestParam (value = "nom")String nom,@RequestParam(value = "mdp")String mdp) {
        return userv.log(nom, mdp);

    }
    @GetMapping("/deco")
    public Boolean deco(@RequestParam (value = "nom")String nom,@RequestParam(value = "mdp")String mdp) {
        return userv.deco(nom, mdp);

    }
    @GetMapping("/token")
    public String generer(@RequestParam(value = "name")String name){
        return userv.genererToken(name);
    }

    @GetMapping("/check")
    public Boolean ckeck(@RequestParam(value = "nom")String nom){
        return userv.check_token_si_valide(nom);

    }
}

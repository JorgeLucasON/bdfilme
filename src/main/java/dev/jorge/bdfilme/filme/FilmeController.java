package dev.jorge.bdfilme.filme;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FilmeController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa e minha primeira rota";
    }


}

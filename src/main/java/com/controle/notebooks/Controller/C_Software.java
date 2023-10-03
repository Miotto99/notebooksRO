package com.controle.notebooks.Controller;

import com.controle.notebooks.Service.S_Software;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Software {

    @GetMapping("/cadastroSoftware")
    public String getcadastro(){
        return "software/cadastroSoftware";
    }

    @PostMapping("/cadastroSoftware")
    @ResponseBody
    public String cadastrarSoftware(@RequestParam("nome") String nome,
                                    @RequestParam("exige_licensa") boolean exige_licensa){
        return S_Software.cadastroSoftware(nome, exige_licensa);
    }
}

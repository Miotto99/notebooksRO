package com.controle.notebooks.Controller;

import com.controle.notebooks.Service.S_Notebooks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Notebooks {
    @GetMapping("/cadastroNote")
    public String getCadastroNote(){
        return "notebooks/cadastroNote";
    }

    @PostMapping("/cadastroNote")
    public String cadastroNotebooks(@RequestParam("numero") String numero,
                                    @RequestParam("patrimonio") String patrimonio){
        S_Notebooks.cadastrarNotebooks(numero, patrimonio);
        return "notebooks/cadastroNote";
    }
}

package com.controle.notebooks.Controller;

import com.controle.notebooks.Service.S_Notebooks;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Home {
    @GetMapping("/Home")
    public String getHome(HttpSession session,
                          Model model){
        if(session.getAttribute("usuario") != null) {
            model.addAttribute("usuario", session.getAttribute("usuario"));
            return "home/home";
        }else{
            return "redirect:/";
        }
    }

    @GetMapping("/home")
    public String getPartialHome(HttpServletRequest request){
        if(request.getHeader("Referer") != null){
            return "home/partial_home";
        }else{
            return "redirect:/";
        }
    }

    @PostMapping("/home")
    @ResponseBody
    public String cadastroLocacao(@RequestParam("data_comeco") String data_comeco,
                                   @RequestParam("data_final") String data_final,
                                   @RequestParam("id_not") String id_not,
                                   @RequestParam("matricula") String matricula){
        return S_Notebooks.cadastroLocacao(data_comeco,  data_final, matricula, id_not);
    }
}

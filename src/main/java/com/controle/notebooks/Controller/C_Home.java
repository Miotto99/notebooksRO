package com.controle.notebooks.Controller;

import com.controle.notebooks.Model.M_Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Home {
    @GetMapping("/home")
    public String getHome(HttpSession session, Model model){
        if(session.getAttribute("usuario") != null){
            model.addAttribute("usuario", session.getAttribute("usuario"));
            return "Home/home";
        }else{
            return "redirect:/";
        }

    }
}

package com.controle.notebooks.Service;

import com.controle.notebooks.Model.M_Software;
import com.controle.notebooks.Repository.R_Software;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Software {
    private static R_Software r_software;

    public S_Software(R_Software r_software) {
        this.r_software = r_software;
    }

    public static String cadastrarSoftware(String nome, boolean licenca){
        String mensagem = "";

        if(S_Generico.textoEstaVazio(nome)){
            mensagem += "O Nome precisa ser informado";
        }else{
            M_Software m_software = new M_Software();
            m_software.setNome(nome);
            m_software.setExigeLicenca(licenca);
            try{
                r_software.save(m_software);
                mensagem += "Software cadastrado com sucesso!";
            }catch (DataIntegrityViolationException e){
                mensagem += "Falha ao incluir o registro no banco de dados!";
            }
        }
        return mensagem;
    }
}

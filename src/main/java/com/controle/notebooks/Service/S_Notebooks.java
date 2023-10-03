package com.controle.notebooks.Service;

import com.controle.notebooks.Model.M_Notebooks;
import com.controle.notebooks.Repository.R_Note;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Notebooks {
    private static R_Note r_note;

    public S_Notebooks(R_Note r_note){
        this.r_note = r_note;
    }
    public static String cadastrarNotebooks(String numero, String patrimonio){
        boolean podeSalvar = true;
        String mensagem = "";

        if(S_Generico.textoEstaVazio(numero)){
            podeSalvar = false;
            mensagem += "O Numero do Notebooks precisa ser preenchido";
        }
        if(S_Generico.textoEstaVazio(patrimonio)) {
            podeSalvar = false;
            mensagem += "Patrimonio invalido";
        }

        if(podeSalvar){
            M_Notebooks m_notebooks = new M_Notebooks();
            m_notebooks.setNumero(Integer.parseInt(numero));
            m_notebooks.setPatrimonio(Long.parseLong(patrimonio));
            m_notebooks.setAtivo(true);
            try{
                r_note.save(m_notebooks);
                mensagem+="Deu bom";
            }catch (DataIntegrityViolationException e){
                mensagem+="Deu não";
            }
        }
        return mensagem;
    }
}

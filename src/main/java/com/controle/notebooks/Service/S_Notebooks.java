package com.controle.notebooks.Service;


import com.controle.notebooks.Model.M_Notebooks;
import com.controle.notebooks.Repository.R_Notebooks;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Notebooks {
    private static R_Notebooks r_notebooks;

    public S_Notebooks(R_Notebooks r_notebooks) {
        this.r_notebooks = r_notebooks;
    }

    public static String cadastrarNotebook(String numero, String patrimonio){
        boolean podeSalvar = true;
        String mensagem = "";

        if(S_Generico.textoEstaVazio(S_Generico.limparNumero(numero))){
            podeSalvar = false;
            mensagem += "O número do notebook deve ser informado!";
        }
        if(S_Generico.textoEstaVazio(S_Generico.limparNumero(patrimonio))){
            podeSalvar = false;
            mensagem += "\nO número do patrimônio deve ser informado!";
        }

        if(podeSalvar){
            M_Notebooks m_notebooks = new M_Notebooks();
            m_notebooks.setNumero(Integer.parseInt(numero));
            m_notebooks.setPatrimonio(Long.parseLong(patrimonio));
            m_notebooks.setAtivo(true);
            try {
                r_notebooks.save(m_notebooks);
                mensagem += "Registro Salvo com sucesso";
            }catch (DataIntegrityViolationException e){
                mensagem += "Falha ao inserir registro no banco de dados";
            }
        }
        return mensagem;
    }
}

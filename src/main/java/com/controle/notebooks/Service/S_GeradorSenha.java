package com.controle.notebooks.Service;

import java.util.Random;

public class S_GeradorSenha {
    public static String gerarSenha(int qtdletras, int qtdnumeros, int qtdespeciais) {
        final char[] caracteres_nao_numeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        final char[] caracteres_especiais = "!@#$%^&*()_+-=[]{}|;:,.<>?".toCharArray();
        final char[] caracteres_numericos = "012345679".toCharArray();
        String senha = "";
        Random rand = new Random();

        for(int i = 0; i < qtdletras; i++){
            senha += caracteres_nao_numeros[rand.nextInt(0,caracteres_nao_numeros.length)];
        }
        for(int i = 0; i < qtdletras; i++){
            senha += caracteres_numericos[rand.nextInt(0,caracteres_numericos.length)];
        }
        for(int i = 0; i < qtdletras; i++){
            senha += caracteres_especiais[rand.nextInt(0,caracteres_especiais.length)];
        }
        return senha;
    }
}

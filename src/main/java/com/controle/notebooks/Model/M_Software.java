package com.controle.notebooks.Model;

import jakarta.persistence.*;

@Entity
@Table(name="software")
public class M_Software {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean exige_licenca;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isExigeLicenca() {
        return exige_licenca;
    }

    public void setExigeLicenca(boolean exige_licenca) {
        this.exige_licenca = exige_licenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

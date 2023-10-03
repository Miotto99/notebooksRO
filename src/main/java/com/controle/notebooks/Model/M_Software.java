package com.controle.notebooks.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "software")
public class M_Software {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean exige_licensa;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isExigelicensa() {
        return exige_licensa;
    }

    public void setExigelicensa(boolean exige_licensa) {
        this.exige_licensa = exige_licensa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

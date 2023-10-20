package com.controle.notebooks.Model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "locacao")
public class M_Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long id_usuario;
    private Long id_not;
    private Date data_comeco;
    private Date data_final;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_not() {
        return id_not;
    }

    public void setId_not(Long id_not) {
        this.id_not = id_not;
    }

    public Date getData_comeco() {
        return data_comeco;
    }

    public void setData_comeco(Date data_comeco) {
        this.data_comeco = data_comeco;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }
}

package com.controle.notebooks.Repository;

import com.controle.notebooks.Model.M_Notebooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Notebooks extends JpaRepository<M_Notebooks, Long> {
}

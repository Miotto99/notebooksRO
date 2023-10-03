package com.controle.notebooks.Repository;

import com.controle.notebooks.Model.M_Software;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Software extends JpaRepository<M_Software, Long> {
}

package com.example.project_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project_crud.entities.Voluntarios;

public interface VoluntarioResporitory extends JpaRepository<Voluntarios, Long>{

    
}
package com.templateproject.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.templateproject.api.entity.Ressource;

import java.util.Optional;

@Repository
public interface RessourceRepository extends JpaRepository<Ressource, Integer> {

    Optional<Ressource> findByColonyId(int id);
}

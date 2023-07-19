package com.templateproject.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.templateproject.api.entity.Ressource;

import java.util.Optional;

@Repository
public interface RessourceRepository extends JpaRepository<Ressource, Integer> {

    Optional<Ressource> findByColonyId(int id);

    @Modifying
    @Query("update Ressource set numberOfCowboy = :nbCowboy where id = :id")
    void UpdateCowboy(@Param("id") int id, @Param("nbCowboy") int nbCowboy);
}

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

    @Modifying
    @Query("update Ressource set wood = :wood where id = :id")
    void UpdateWood(@Param("id") int id, @Param("wood") int wood);

    @Modifying
    @Query("update Ressource set iron = :iron where id = :id")
    void UpdateIron(@Param("id") int id, @Param("iron") int iron);

    @Modifying
    @Query("update Ressource set gold = :gold where id = :id")
    void UpdateGold(@Param("id") int id, @Param("gold") int gold);

    @Modifying
    @Query("update Ressource set sawMill = :sawmill where id = :id")
    void UpdateSawmill(@Param("id") int id, @Param("sawmill") int sawmill);

    @Modifying
    @Query("update Ressource set mine = :mine where id = :id")
    void UpdateMine(@Param("id") int id, @Param("mine") int mine);

    @Modifying
    @Query("update Ressource set forge = :forge where id = :id")
    void UpdateForge(@Param("id") int id, @Param("forge") int forge);
}

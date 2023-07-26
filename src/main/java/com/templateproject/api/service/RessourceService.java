package com.templateproject.api.service;

import com.templateproject.api.entity.Ressource;
import org.springframework.transaction.annotation.Transactional;

public interface RessourceService {
    Ressource createRessource(Ressource ressource);

    Ressource updateRessource(Ressource ressource);

    Ressource getRessourceOfColony(int colonyId);

    @Transactional
    void updateNumberCowboy(int ressourceId, int nbCowboy);

    @Transactional
    void updateWood(int ressourceId, int wood);

    @Transactional
    void updateIron(int ressourceId, int iron);

    @Transactional
    void updateGold(int ressourceId, int gold);

    @Transactional
    void updateSawmill(int ressourceId, int sawmill);

    @Transactional
    void updateForge(int ressourceId, int forge);

    @Transactional
    void updateMine(int ressourceId, int mine);
}

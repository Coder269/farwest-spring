package com.templateproject.api.service;

import com.templateproject.api.entity.Ressource;
import org.springframework.transaction.annotation.Transactional;

public interface RessourceService {
    Ressource createRessource(Ressource ressource);

    Ressource updateRessource(Ressource ressource);

    Ressource getRessourceOfColony(int colonyId);

    void updateNumberCowboy(int colonyId, int nbCowboy);

    @Transactional
    void updateWood(int colonyId, int wood);

    @Transactional
    void updateIron(int colonyId, int iron);

    @Transactional
    void updateGold(int colonyId, int gold);
}

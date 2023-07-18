package com.templateproject.api.service;

import com.templateproject.api.entity.Ressource;

public interface RessourceService {
    Ressource createRessource(Ressource ressource);

    Ressource updateRessource(Ressource ressource);

    Ressource getRessourceOfColony(int colonyId);
}

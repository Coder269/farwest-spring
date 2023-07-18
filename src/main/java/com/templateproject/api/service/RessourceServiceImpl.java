package com.templateproject.api.service;

import com.templateproject.api.entity.Ressource;
import com.templateproject.api.repository.RessourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RessourceServiceImpl implements RessourceService {

    @Autowired
    private RessourceRepository ressourceRepository;

    @Override
    public Ressource createRessource(Ressource ressource){
        return ressourceRepository.save(ressource);
    }

    @Override
    public Ressource updateRessource(Ressource ressource){
        return ressourceRepository.save(ressource);
    }

    @Override
    public Ressource getRessourceOfColony(int colonyId){
        return ressourceRepository.findByColonyId(colonyId).orElse(null);
    }

}

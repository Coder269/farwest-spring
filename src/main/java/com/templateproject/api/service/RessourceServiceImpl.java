package com.templateproject.api.service;

import com.templateproject.api.entity.Ressource;
import com.templateproject.api.repository.RessourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Override
    @Transactional
    public void updateNumberCowboy(int colonyId, int nbCowboy){
        ressourceRepository.UpdateCowboy(colonyId, nbCowboy);
    }

    @Override
    @Transactional
    public void updateWood(int colonyId, int wood){
        ressourceRepository.UpdateWood(colonyId, wood);
    }

    @Override
    @Transactional
    public void updateIron(int colonyId, int iron){
        ressourceRepository.UpdateIron(colonyId, iron);
    }

    @Override
    @Transactional
    public void updateGold(int colonyId, int gold){
        ressourceRepository.UpdateGold(colonyId, gold);
    }



}

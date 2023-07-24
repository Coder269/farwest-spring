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
    public void updateNumberCowboy(int ressourceId, int nbCowboy){
        ressourceRepository.UpdateCowboy(ressourceId, nbCowboy);
    }

    @Override
    @Transactional
    public void updateWood(int ressourceId, int wood){
        ressourceRepository.UpdateWood(ressourceId, wood);
    }

    @Override
    @Transactional
    public void updateIron(int ressourceId, int iron){
        ressourceRepository.UpdateIron(ressourceId, iron);
    }

    @Override
    @Transactional
    public void updateGold(int ressourceId, int gold){
        ressourceRepository.UpdateGold(ressourceId, gold);
    }

    @Override
    @Transactional
    public void updateSawmill(int ressourceId, int sawmill) {
        ressourceRepository.UpdateSawmill(ressourceId, sawmill);
    }

    @Override
    @Transactional
    public void updateForge(int ressourceId, int forge) {
        ressourceRepository.UpdateForge(ressourceId, forge);
    }

    @Override
    @Transactional
    public void updateMine(int ressourceId, int mine) {
        ressourceRepository.UpdateMine(ressourceId, mine);
    }



}

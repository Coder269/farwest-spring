package com.templateproject.api.service;

import com.templateproject.api.entity.Colony;
import com.templateproject.api.repository.ColonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColonyServiceImpl implements ColonyService {

    @Autowired
    private ColonyRepository colonyRepository;

    @Override
    public Colony createColony(Colony colony){
        return colonyRepository.save(colony);
    }

    @Override
    public Colony updateColony(Colony colony){
        return colonyRepository.save(colony);
    }

    @Override
    public void deleteColony(int id){
        colonyRepository.deleteById(id);
    }

    @Override
    public List<Colony> getAllColonies(){
        return colonyRepository.findAll();
    }

    @Override
    public List<Colony> getAllColoniesOfUser(int userId){
        return colonyRepository.findAllByUserId(userId);
    }

    @Override
    public Colony getColonyById(int id) {
        return colonyRepository.findById(id).orElse(null);
    }
}

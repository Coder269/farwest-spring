package com.templateproject.api.service;

import com.templateproject.api.entity.Colony;

import java.util.List;

public interface ColonyService {
    Colony createColony(Colony colony);

    Colony updateColony(Colony colony);

    void deleteColony(int id);

    List<Colony> getAllColonies();

    List<Colony> getAllColoniesOfUser(int id);

    Colony getColonyById(int id);
}

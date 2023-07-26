package com.templateproject.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.templateproject.api.entity.Colony;

import java.util.List;

@Repository
public interface ColonyRepository extends JpaRepository<Colony, Integer> {

    List<Colony> findAllByUserId(int id);

}

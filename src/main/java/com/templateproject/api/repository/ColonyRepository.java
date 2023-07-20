package com.templateproject.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor;
import org.springframework.stereotype.Repository;
import com.templateproject.api.entity.Colony;

import java.util.List;
import java.util.Optional;

@Repository
public interface ColonyRepository extends JpaRepository<Colony, Integer> {


    List<Colony> findAllByUserId(int id);


}

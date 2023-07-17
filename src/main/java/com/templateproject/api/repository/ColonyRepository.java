package com.templateproject.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.templateproject.api.entity.Colony;

@Repository
public interface ColonyRepository extends JpaRepository<Colony, Integer> {

}

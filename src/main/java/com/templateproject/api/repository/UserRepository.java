package com.templateproject.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.templateproject.api.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String userName);

    @Modifying
    @Query("update User set level = :level where id = :id")
    void UpdateUserLevel(@Param("id") int id, @Param("level") int level);

    @Modifying
    @Query("update User set money = :money where id = :id")
    void UpdateUserMoney(@Param("id") int id, @Param("money") int money);

}

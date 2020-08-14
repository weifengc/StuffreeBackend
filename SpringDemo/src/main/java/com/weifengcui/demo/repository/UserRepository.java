package com.weifengcui.demo.repository;

import com.weifengcui.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query(
            value = "SELECT * FROM user u where u.user_name = :username",
            nativeQuery = true
    )
    public Optional<User> findUserByUserName(@Param("username") String username);

}

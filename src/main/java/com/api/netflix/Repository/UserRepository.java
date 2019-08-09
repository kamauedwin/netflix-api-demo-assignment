package com.api.netflix.Repository;

import com.api.netflix.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {
    List<Users> findByUserId(int userID);
}

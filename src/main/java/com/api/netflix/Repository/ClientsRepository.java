package com.api.netflix.Repository;

import com.api.netflix.Model.Clients;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Integer> {

    List<Clients> findByTitleContainingOrContentContaining(String text, String textAgain);
}

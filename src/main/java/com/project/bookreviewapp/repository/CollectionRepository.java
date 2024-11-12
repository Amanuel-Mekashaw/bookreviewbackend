package com.project.bookreviewapp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bookreviewapp.entity.Collection;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, UUID> {

}

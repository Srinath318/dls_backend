package com.example.dirtyLittleSecret.repository;

import com.example.dirtyLittleSecret.model.dlsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface dlsRepo extends JpaRepository<dlsModel,Integer> {
    @Query(value = "SELECT * FROM dls_model ORDER BY RAND() LIMIT 1", nativeQuery = true)
    dlsModel randModel();
}

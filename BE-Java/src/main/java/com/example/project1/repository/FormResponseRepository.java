package com.example.project1.repository;

import com.example.project1.model.FormResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormResponseRepository extends JpaRepository<FormResponse,Long> {
}

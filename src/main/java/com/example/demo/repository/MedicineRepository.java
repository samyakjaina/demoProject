package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}

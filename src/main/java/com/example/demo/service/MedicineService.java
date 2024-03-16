package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Medicine;
@Service
public interface MedicineService {
	Medicine createMedicine(Medicine medicine);

	List<Medicine> getAllRecords();

	Medicine findById(Long id) throws Exception;

	String deleteById(Long id) throws Exception;

	Medicine update(Long id, Medicine medicine) throws Exception;

}

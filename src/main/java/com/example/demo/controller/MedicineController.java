package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Medicine;
import com.example.demo.service.MedicineService;

@RestController
@RequestMapping("/api")
public class MedicineController {
//extends MedicineExcepitionController{

	@Autowired
	private MedicineService medicineServiceImpl;

	@PostMapping("/create")
	public Medicine createMedicine(@Valid @RequestBody Medicine medicine) {
		return medicineServiceImpl.createMedicine(medicine);
	}

	@GetMapping("/getAllRecords")
	public List<Medicine> getAllRecords() {
		return medicineServiceImpl.getAllRecords();
	}

	@GetMapping("/findById/{id}")
	public Medicine findById(@PathVariable Long id) throws Exception {
		return medicineServiceImpl.findById(id);
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable Long id) throws Exception {
		return medicineServiceImpl.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public Medicine update(@PathVariable Long id, @RequestBody Medicine medicine) throws Exception {
		return medicineServiceImpl.update(id,medicine);
	}
}

package com.example.demo.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constant.ResponseMessage;
import com.example.demo.customException.CustomException;
import com.example.demo.domain.Medicine;
import com.example.demo.repository.MedicineRepository;
import com.example.demo.service.MedicineService;

@Service
public class MedicineServiceImpl  implements MedicineService {
	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public Medicine createMedicine(Medicine medicine) {
		medicine.setCreatedOn(new Date());
		medicine.setUpdatedOn(new Date());
		medicine.setUpdatedBy(medicine.getCreatedBy());
		return medicineRepository.save(medicine);
	}
	@Override
	public List<Medicine> getAllRecords() {
		System.exit(0);
		return medicineRepository.findAll();
	}
	@Override
	public Medicine findById( Long id) throws CustomException {
		return medicineRepository.findById(id).orElseThrow(() -> new CustomException(ResponseMessage.Null));
	}
	@Override
	public String deleteById( Long id) throws Exception {
		medicineRepository.findById(id).orElseThrow(() -> new CustomException(ResponseMessage.Null));
		medicineRepository.deleteById(id);
		return "Deleted SuccessFully";
	}
	@Override
	public Medicine update(Long id, Medicine medicine) throws Exception {
		Medicine updatedMedicine = medicineRepository.findById(id).orElseThrow(() -> new CustomException(ResponseMessage.Null));
		updatedMedicine.setName(medicine.getName());
		updatedMedicine.setPrice(medicine.getPrice());
		updatedMedicine.setContactNumber(medicine.getContactNumber());
		updatedMedicine.setUpdatedBy(medicine.getUpdatedBy());
		updatedMedicine.setUpdatedOn(new Date());
		medicineRepository.save(updatedMedicine);
		return updatedMedicine;
	}
}

package com.claims.assure.claim.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claims.assure.claim.entity.Pharmacy;
import com.claims.assure.claim.repository.PharmacyRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/pharmacies")
@RequiredArgsConstructor
public class PharmacyController {

	private final PharmacyRepository pharmacyRepository;
	
	@GetMapping
    public ResponseEntity<List<Pharmacy>> getAllPharmacies() {
        List<Pharmacy> pharmacies = pharmacyRepository.findAll();
        return new ResponseEntity<>(pharmacies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pharmacy> getPharmacyById(@PathVariable Integer id) {
        Optional<Pharmacy> pharmacy = pharmacyRepository.findById(id);
        return pharmacy.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}

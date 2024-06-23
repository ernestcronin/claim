package com.claims.assure.claim.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.claims.assure.claim.entity.ClaimItem;
import com.claims.assure.claim.repository.ClaimItemRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/claimItems")
@RequiredArgsConstructor
@Slf4j
public class ClaimItemController {

	private final ClaimItemRepository claimItemRepository;

	@GetMapping
	public ResponseEntity<List<ClaimItem>> getAllClaimItems(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "10") Integer pageSize) {

		log.info("get all claim items with page number = {} and page size = {}", pageNo, pageSize);
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<ClaimItem> pagedResult = claimItemRepository.findAll(paging);
		if (pagedResult.hasContent()) {
			log.info("return claim items of size: {size}", pagedResult.getContent().size());
			return new ResponseEntity<>(pagedResult.getContent(), HttpStatus.OK);
		} else {
			log.info("no claim items found.");
			return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<ClaimItem> getClaimItemById(@PathVariable Integer id) {

		log.info("retrieve claimItem by Id: {}", id);
		Optional<ClaimItem> claimItem = claimItemRepository.findClaimItemByClaimItemId(id);
		return claimItem.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@GetMapping("/byStatusAndPharamcyId")
	public ResponseEntity<List<ClaimItem>> getClaimItemByStatusAndPharmacyId(
			@RequestParam(required = true) String status, @RequestParam(required = true) Integer pharmacyId) {
		
		log.info("retrieve claim items by status {} and pharmacy id {}",
				status, pharmacyId);
		Optional<List<ClaimItem>> claimItems = claimItemRepository.findClaimItemsByStatusAndPharamcyId(status,
				pharmacyId);
		log.info("return claim items of size {size}", claimItems.get().size());
		return claimItems.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

}

package com.claims.assure.claim.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claims.assure.claim.entity.ClaimItem;

@Repository
public interface ClaimItemRepository extends JpaRepository<ClaimItem, Integer>{

	
	@Query("select ci from ClaimItem ci "
			+ "left join fetch ci.batch b "
			+ "left join fetch ci.patient p "
			+ "left join fetch ci.pharmacy pharm "
			+ "left join fetch ci.payment pyt " 
			+ "left join fetch pyt.paymentType pytType " 
			+ "where ci.claimItemId =:pid")
	public Optional<ClaimItem> findClaimItemByClaimItemId(@Param("pid") Integer pid);
	
	
	@Query("select ci from ClaimItem ci "
			+ "left join fetch ci.batch b "
			+ "left join fetch ci.patient p "
			+ "left join fetch ci.pharmacy pharm "
			+ "left join fetch ci.payment pyt " 
			+ "left join fetch pyt.paymentType pytType " 
			+ "where ci.status =:status "
			+ "and pharm.pharmacyId =:pharmacyId")
	public Optional<List<ClaimItem>> findClaimItemsByStatusAndPharamcyId(@Param("status") String status, 
			@Param("pharmacyId") Integer pharmacyId);
}

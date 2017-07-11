package com.guitar.repository;

import com.guitar.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@RepositoryRestResource(path = "mfgs", itemResourceRel = "mfgs", collectionResourceRel = "mfgs")
public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long> {
	List<Manufacturer> findByFoundedDateBefore(Date date);
	
	List<Manufacturer> findByActiveTrue();
	List<Manufacturer> findByActiveFalse();
	
	List<Manufacturer> getAllThatSellAcoustics(String name);
}

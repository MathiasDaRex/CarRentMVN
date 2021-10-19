package hu.mathiasProjects.carRent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.mathiasProjects.carRent.entity.Cars;


@Repository
public interface CarRentRepository extends JpaRepository<Cars, Long> {
	
}

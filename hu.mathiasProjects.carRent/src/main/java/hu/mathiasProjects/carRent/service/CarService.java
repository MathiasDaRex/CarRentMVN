package hu.mathiasProjects.carRent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.mathiasProjects.carRent.entity.Cars;
import hu.mathiasProjects.carRent.repository.CarRentRepository;

@Service
public class CarService {

	@Autowired
	public CarRentRepository cr;
	
	public List<Cars> getAll() {
		return cr.findAll();
	}

}

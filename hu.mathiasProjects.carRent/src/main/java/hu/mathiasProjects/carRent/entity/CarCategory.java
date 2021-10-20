package hu.mathiasProjects.carRent.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carCategoryId;
	private String carCategory;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "carCategory")
	private Cars car;
	
	
	public CarCategory(Integer carCategoryId, String carCategory) {
		this.carCategoryId = carCategoryId;
		this.carCategory = carCategory;
	}
	public CarCategory() {
	}
	public Integer getCarCategoryId() {
		return carCategoryId;
	}
	public void setCarCategoryId(Integer carCategoryId) {
		this.carCategoryId = carCategoryId;
	}
	public String getCarCategory() {
		return carCategory;
	}
	public void setCarCategory(String carCategory) {
		this.carCategory = carCategory;
	}
	public Cars getCar() {
		return car;
	}
	public void setCar(Cars car) {
		this.car = car;
	}
	
	
	
	
}

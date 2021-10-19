package hu.mathiasProjects.carRent.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carTypeId;
	private String carType;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "carType")
	private Cars car;
	
	
	public CarType(Integer carTypeId, String carType) {
		this.carTypeId = carTypeId;
		this.carType = carType;
	}
	public CarType() {
	}
	public Integer getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(Integer carTypeId) {
		this.carTypeId = carTypeId;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	
}

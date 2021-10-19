package hu.mathiasProjects.carRent.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Cars {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carId;
	private String carBrand;
	private String carTypeName;
	private Integer carTypeId;
	private Integer picId;
	private Integer manYear;
	private String licPlate;
	private String color;
	private String fuel;
	private Integer engineCapacity;
	private Double fuelCons;
	private Integer persons;
	private Boolean aircon;
	private Integer dailyCost;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "carTypeId", nullable = false, insertable = false, updatable = false)
	private CarType carType;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "picId", nullable = false, insertable = false, updatable = false)
	private CarPics pics;
	

	public Cars(Integer carId, String carBrand, String carTypeName, Integer carTypeId, Integer picId, Integer manYear,
			String licPlate, String color, String fuel, Integer engineCapacity, Double fuelCons, Integer persons,
			Boolean aircon, Integer dailyCost) {
		this.carId = carId;
		this.carBrand = carBrand;
		this.carTypeName = carTypeName;
		this.carTypeId = carTypeId;
		this.picId = picId;
		this.manYear = manYear;
		this.licPlate = licPlate;
		this.color = color;
		this.fuel = fuel;
		this.engineCapacity = engineCapacity;
		this.fuelCons = fuelCons;
		this.persons = persons;
		this.aircon = aircon;
		this.dailyCost = dailyCost;
	}

	public Cars() {
	}

	public Integer getCarId() {
		return carId;
	}


	public void setCarId(Integer carId) {
		this.carId = carId;
	}


	public String getCarBrand() {
		return carBrand;
	}


	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}


	public String getCarTypeName() {
		return carTypeName;
	}


	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}


	public Integer getCarTypeId() {
		return carTypeId;
	}


	public void setCarTypeId(Integer carTypeId) {
		this.carTypeId = carTypeId;
	}


	public Integer getPicId() {
		return picId;
	}


	public void setPicId(Integer picId) {
		this.picId = picId;
	}


	public Integer getManYear() {
		return manYear;
	}


	public void setManYear(Integer manYear) {
		this.manYear = manYear;
	}


	public String getLicPlate() {
		return licPlate;
	}


	public void setLicPlate(String licPlate) {
		this.licPlate = licPlate;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public Integer getEngineCapacity() {
		return engineCapacity;
	}


	public void setEngineCapacity(Integer engineCapacity) {
		this.engineCapacity = engineCapacity;
	}


	public Double getFuelCons() {
		return fuelCons;
	}


	public void setFuelCons(Double fuelCons) {
		this.fuelCons = fuelCons;
	}


	public Integer getPersons() {
		return persons;
	}


	public void setPersons(Integer persons) {
		this.persons = persons;
	}


	public Boolean getAircon() {
		return aircon;
	}


	public void setAircon(Boolean aircon) {
		this.aircon = aircon;
	}


	public Integer getDailyCost() {
		return dailyCost;
	}


	public void setDailyCost(Integer dailyCost) {
		this.dailyCost = dailyCost;
	}





	
	
	
	
	
 }

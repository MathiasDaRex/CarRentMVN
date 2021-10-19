package hu.mathiasProjects.carRent.entity;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CarPics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer picId;
	private Integer carId;
	// importálás nemmindegy
	private Blob pic;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "pics")
	@JoinColumn(name="carId", nullable = false, insertable = false, updatable = false)
	private Cars car;
	
	public CarPics(Integer picId, Integer carId, Blob pic) {
		this.picId = picId;
		this.carId = carId;
		this.pic = pic;
	}
	public CarPics() {
	}
	public Integer getPicId() {
		return picId;
	}
	public void setPicId(Integer picId) {
		this.picId = picId;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public Blob getPic() {
		return pic;
	}
	public void setPic(Blob pic) {
		this.pic = pic;
	}
	
	
	
}

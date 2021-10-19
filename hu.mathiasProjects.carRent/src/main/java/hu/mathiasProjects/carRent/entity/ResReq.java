package hu.mathiasProjects.carRent.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResReq {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer reqId;
	private Integer carId;
	private Integer userId;
	private Date borrowDate;
 	private Date backDate;
	private Integer price;
	
	public ResReq(Integer reqId, Integer carId, Integer userId, Date borrowDate, Date backDate, Integer price) {
		super();
		this.reqId = reqId;
		this.carId = carId;
		this.userId = userId;
		this.borrowDate = borrowDate;
		this.backDate = backDate;
		this.price = price;
	}

	public ResReq() {

	}
	

	public Integer getReqId() {
		return reqId;
	}

	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getBackDate() {
		return backDate;
	}

	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
	
	
	
 }

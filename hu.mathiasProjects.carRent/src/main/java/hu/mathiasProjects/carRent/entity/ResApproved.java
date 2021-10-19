package hu.mathiasProjects.carRent.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class ResApproved {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer approvalId;
	private Integer reqId;
	private Integer carId;
	private Integer userId;
	private Integer adminId;
	private Date borrowDate;
	private Date backDate;
	private Integer price;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "reqId", nullable = false, insertable = false, updatable = false)
	private ResReq resReq;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "carId", nullable = false, insertable = false, updatable = false)
	private Cars cars;

	
	public ResApproved() {
	}
	
	
	public ResApproved(Integer approvalId, Integer reqId, Integer carId, Integer userId, Integer adminId,
			Date borrowDate, Date backDate, Integer price) {
		this.approvalId = approvalId;
		this.reqId = reqId;
		this.carId = carId;
		this.userId = userId;
		this.adminId = adminId;
		this.borrowDate = borrowDate;
		this.backDate = backDate;
		this.price = price;
	}


	public Integer getApprovalId() {
		return approvalId;
	}


	public void setApprovalId(Integer approvalId) {
		this.approvalId = approvalId;
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


	public Integer getAdminId() {
		return adminId;
	}


	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
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


	public ResReq getResReq() {
		return resReq;
	}


	public void setResReq(ResReq resReq) {
		this.resReq = resReq;
	}


	public Cars getCars() {
		return cars;
	}


	public void setCars(Cars cars) {
		this.cars = cars;
	}
	
	

	
}

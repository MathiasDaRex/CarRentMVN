package hu.mathiasProjects.carRent.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FaqCat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer catId;
	private String catName;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "faqCat")
	private FaqQst faqQst;
	
	public FaqCat(Integer catId, String catName) {
		this.catId = catId;
		this.catName = catName;
	}

	public FaqCat() {
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "catId=" + catId + ", catName=" + catName;
	}
	
	
	
	
	
	
}

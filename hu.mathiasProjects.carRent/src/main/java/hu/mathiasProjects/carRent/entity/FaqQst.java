package hu.mathiasProjects.carRent.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class FaqQst {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer faqId;
	private Integer catId;
	private String qst;
	private String answ;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "catId", nullable = false, insertable = false, updatable = false)
	private FaqCat faqCat;
	
	
	public FaqQst(Integer faqId, Integer catId, String qst, String answ) {
		this.faqId = faqId;
		this.catId = catId;
		this.qst = qst;
		this.answ = answ;
	}
	
	public FaqQst() {
	}

	public Integer getFaqId() {
		return faqId;
	}

	public void setFaqId(Integer faqId) {
		this.faqId = faqId;
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getQst() {
		return qst;
	}

	public void setQst(String qst) {
		this.qst = qst;
	}

	public String getAnsw() {
		return answ;
	}

	public void setAnsw(String answ) {
		this.answ = answ;
	}
	
	
	
	
	
	
}

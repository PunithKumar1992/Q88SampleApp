package com.q88.sample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTURE_GRADE",schema = "CHOPS_WEB")
public class Q88_FixtureGrade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "FIXTUREGRADE_SEQID")
	private Integer fixturegrade_seqid;
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	@Column(name = "GRADENAME")
	private String gradeName;
	@Column(name = "FIXTURELISTSEQ_ID")
	private Integer fixturelistseq_id;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="fixturelistseq_id",referencedColumnName = "FIXTURELISTSEQ_ID",insertable=false, updatable=false)
	private Q88_Fixture q88fixturegrades;

	public Integer getFixturegrade_seqid() {
		return fixturegrade_seqid;
	}

	public void setFixturegrade_seqid(Integer fixturegrade_seqid) {
		this.fixturegrade_seqid = fixturegrade_seqid;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(Integer fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
	}

	public Q88_Fixture getQ88fixturegrades() {
		return q88fixturegrades;
	}

	public void setQ88fixturegrades(Q88_Fixture q88fixturegrades) {
		this.q88fixturegrades = q88fixturegrades;
	}

	@Override
	public String toString() {
		return "Q88_FixtureGrade [fixturegrade_seqid=" + fixturegrade_seqid + ", displayOrder=" + displayOrder
				+ ", gradeName=" + gradeName + ", fixturelistseq_id=" + fixturelistseq_id + ", q88fixturegrades="
				+ q88fixturegrades + "]";
	}

	
	
	
}

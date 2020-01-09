package com.bsol.q88.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VoyObj_Fixture_GradeCPK;

@Entity
@Table(name = "Q88_VOYOBJ_FIXTURE_GRADE")
@IdClass(Q88_VoyObj_Fixture_GradeCPK.class)
public class Q88_VoyObj_Fixture_Grade {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "FIXTURELST_SEQID")
	private Integer fixtureLst_SeqId;
	
	@Id
	@Column(name = "GRADE_SEQID")
	@SequenceGenerator(name = "FixGrade_SeqId", sequenceName = "Q88_VOYOBJ_FIXTURE_GRADE_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "FixGrade_SeqId")
	private Integer grade_SeqId;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	@Column(name = "GRADENAME")
	private String gradeName;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  @JoinColumn(name = "FIXTURELST_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "FIXTURELST_SEQID"),
	  })
	private Q88_VoyObj_FixtureLst voyFixtureGrade;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVoyageId() {
		return voyageId;
	}

	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}

	public Integer getFixtureLst_SeqId() {
		return fixtureLst_SeqId;
	}

	public void setFixtureLst_SeqId(Integer fixtureLst_SeqId) {
		this.fixtureLst_SeqId = fixtureLst_SeqId;
	}

	public Integer getGrade_SeqId() {
		return grade_SeqId;
	}

	public void setGrade_SeqId(Integer grade_SeqId) {
		this.grade_SeqId = grade_SeqId;
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

	public Q88_VoyObj_FixtureLst getVoyFixtureGrade() {
		return voyFixtureGrade;
	}

	public void setVoyFixtureGrade(Q88_VoyObj_FixtureLst voyFixtureGrade) {
		this.voyFixtureGrade = voyFixtureGrade;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Fixture_Grade [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", fixtureLst_SeqId="
				+ fixtureLst_SeqId + ", grade_SeqId=" + grade_SeqId + ", displayOrder=" + displayOrder + ", gradeName="
				+ gradeName + "]";
	}
	
	
	

}

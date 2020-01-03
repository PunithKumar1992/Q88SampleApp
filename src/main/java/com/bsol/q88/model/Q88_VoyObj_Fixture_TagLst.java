package com.bsol.q88.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VoyObj_Fixture_TagLstCPK;

@Entity
@Table(name = "Q88_VOYOBJ_FIXTURE_TAGLST")
@IdClass(Q88_VoyObj_Fixture_TagLstCPK.class)
public class Q88_VoyObj_Fixture_TagLst {

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "FIXTURELST_SEQID")
	private Integer fixtureLst_SeqId;
	
	@Column(name = "TAG_SEQID")
	private Integer tag_SeqId;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "VALUE")
	private String value;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  @JoinColumn(name = "FIXTURELST_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "FIXTURELST_SEQID"),
	  })
	private Q88_VoyObj_FixtureLst voyFixtureTagLst;

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

	public Integer getTag_SeqId() {
		return tag_SeqId;
	}

	public void setTag_SeqId(Integer tag_SeqId) {
		this.tag_SeqId = tag_SeqId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Q88_VoyObj_FixtureLst getVoyFixtureTagLst() {
		return voyFixtureTagLst;
	}

	public void setVoyFixtureTagLst(Q88_VoyObj_FixtureLst voyFixtureTagLst) {
		this.voyFixtureTagLst = voyFixtureTagLst;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Fixture_TagLst [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", fixtureLst_SeqId="
				+ fixtureLst_SeqId + ", tag_SeqId=" + tag_SeqId + ", category=" + category + ", value=" + value + "]";
	}
	
	
}

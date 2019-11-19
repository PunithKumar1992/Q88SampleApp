package com.bsol.q88.model;

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
@Table(name = "Q88_TAGDATA",schema = "CHOPS_WEB")
public class Q88_TagData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "TAGDATA_SEQID")
	private Integer tagdata_seqid;
	@Column(name = "CATEGORY")
	private String category;
	@Column(name = "VALUE")
	private String value;
	@Column(name = "FIXTURELISTSEQ_ID")
	private Integer fixturelistseq_id;
	
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="fixturelistseq_id",referencedColumnName = "FIXTURELISTSEQ_ID",insertable=false, updatable=false)
	private Q88_Fixture q88fixturetagdata;


	public Integer getTagdata_seqid() {
		return tagdata_seqid;
	}


	public void setTagdata_seqid(Integer tagdata_seqid) {
		this.tagdata_seqid = tagdata_seqid;
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


	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}


	public void setFixturelistseq_id(Integer fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
	}


	public Q88_Fixture getQ88fixturetagdata() {
		return q88fixturetagdata;
	}


	public void setQ88fixturetagdata(Q88_Fixture q88fixturetagdata) {
		this.q88fixturetagdata = q88fixturetagdata;
	}


	@Override
	public String toString() {
		return "Q88_TagData [tagdata_seqid=" + tagdata_seqid + ", category=" + category + ", value=" + value
				+ ", fixturelistseq_id=" + fixturelistseq_id + ", q88fixturetagdata=" + q88fixturetagdata + "]";
	}


	
	
}

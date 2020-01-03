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
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VoyObj_Fixture_PortCPK;

@Entity
@Table(name = "Q88_VOYOBJ_FIXTURE_PORT")
@IdClass(Q88_VoyObj_Fixture_PortCPK.class)
public class Q88_VoyObj_Fixture_Port {
	
	
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
	@Column(name = "PORT_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer port_SeqId;
	
	@Column(name = "PORTID")
	private Integer portId;
	
	@Column(name = "PORTNAME")
	private String portName;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	@Column(name = "ACTIVITYTYPE")
	private String activityType;
	
	@Column(name = "FIXTUREPORTLINKTOKEN")
	private String fixturePortLinkToken;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  @JoinColumn(name = "FIXTURELST_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "FIXTURELST_SEQID"),
	  })
	private Q88_VoyObj_FixtureLst voyFixtureProt;

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

	public Integer getPort_SeqId() {
		return port_SeqId;
	}

	public void setPort_SeqId(Integer port_SeqId) {
		this.port_SeqId = port_SeqId;
	}

	public Integer getPortId() {
		return portId;
	}

	public void setPortId(Integer portId) {
		this.portId = portId;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getFixturePortLinkToken() {
		return fixturePortLinkToken;
	}

	public void setFixturePortLinkToken(String fixturePortLinkToken) {
		this.fixturePortLinkToken = fixturePortLinkToken;
	}

	public Q88_VoyObj_FixtureLst getVoyFixtureProt() {
		return voyFixtureProt;
	}

	public void setVoyFixtureProt(Q88_VoyObj_FixtureLst voyFixtureProt) {
		this.voyFixtureProt = voyFixtureProt;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Fixture_Port [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", fixtureLst_SeqId="
				+ fixtureLst_SeqId + ", port_SeqId=" + port_SeqId + ", portId=" + portId + ", portName=" + portName
				+ ", displayOrder=" + displayOrder + ", activityType=" + activityType + ", fixturePortLinkToken="
				+ fixturePortLinkToken + "]";
	}
	
	
	

}

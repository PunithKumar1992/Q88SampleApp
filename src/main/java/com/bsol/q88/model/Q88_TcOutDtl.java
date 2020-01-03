
package com.bsol.q88.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_TcOutDtlCPK;

@Entity
@Table(name = "Q88_TCOUTDTL")
@IdClass(Q88_TcOutDtlCPK.class)
public class Q88_TcOutDtl implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;

	@Column(name = "DURATIONREDELIVERYDAYS")
	private Integer durationRedeliveryDays;

	@OneToOne(mappedBy = "q88TcOutListFixture", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_TCOutDtl_Contract contract;
	
	
	@OneToMany(mappedBy = "tcOutFixtureCommission", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Q88_TcOutDtl_CommissionList.class)
	List<Q88_TcOutDtl_CommissionList> commissionList = new ArrayList<Q88_TcOutDtl_CommissionList>();
	
	@OneToOne(mappedBy = "tcOutResults",fetch = FetchType.EAGER,cascade = CascadeType.ALL,optional = true)
	private Q88_TcOutDtl_Results results;
	
	@OneToMany(mappedBy = "q88TcOutPeriod",fetch = FetchType.LAZY,cascade = {CascadeType.ALL},targetEntity =Q88_TcOutDtl_Duration.class )
	private List<Q88_TcOutDtl_Duration> duration = new ArrayList<Q88_TcOutDtl_Duration>();
	
	@OneToMany(mappedBy = "q88TcOutVoyage",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_TcOutDtl_VoyageList.class)
	private List<Q88_TcOutDtl_VoyageList> voyageList = new ArrayList<Q88_TcOutDtl_VoyageList>();

	@OneToOne(mappedBy = "q88TcOutDelivery",fetch = FetchType.EAGER,cascade = CascadeType.ALL,optional = true)
	private Q88_TcOutDtl_Delivery tcOutDeliveryRedelivery;
	
	

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getTcOutIdEncrypted() {
		return tcOutIdEncrypted;
	}

	public void setTcOutIdEncrypted(String tcOutIdEncrypted) {
		this.tcOutIdEncrypted = tcOutIdEncrypted;
	}

	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}

	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}

	public Integer getDurationRedeliveryDays() {
		return durationRedeliveryDays;
	}

	public void setDurationRedeliveryDays(Integer durationRedeliveryDays) {
		this.durationRedeliveryDays = durationRedeliveryDays;
	}

	public Q88_TCOutDtl_Contract getContract() {
		return contract;
	}

	public void setContract(Q88_TCOutDtl_Contract contract) {
		if (contract == null) {
			if (this.contract != null) {
				this.contract.setQ88TcOutListFixture(null);
			}
		} else {
			contract.setQ88TcOutListFixture(this);
		}
		this.contract = contract;
	}

	public List<Q88_TcOutDtl_CommissionList> getCommissionList() {
		return commissionList;
	}

	public void addCommissionList(List<Q88_TcOutDtl_CommissionList> commissionList) {
		this.commissionList = commissionList;
	}
	
	public Q88_TcOutDtl_Results getResults() {
		return results;
	}

	public void setResults(Q88_TcOutDtl_Results results) {
		if(results ==null) {
			if(this.results !=null) {
				this.results.setTcOutResults(null);
			}
		}
		else {
			results.setTcOutResults(this);
		}
		this.results = results;
	}
	
	

	public List<Q88_TcOutDtl_Duration> getDuration() {
		return duration;
	}

	public void addDuration(List<Q88_TcOutDtl_Duration> duration) {
		this.duration = duration;
	}
	

	public List<Q88_TcOutDtl_VoyageList> getVoyageList() {
		return voyageList;
	}

	public void addVoyageList(List<Q88_TcOutDtl_VoyageList> voyageList) {
		this.voyageList = voyageList;
	}

	public Q88_TcOutDtl_Delivery getTcOutDeliveryRedelivery() {
		return tcOutDeliveryRedelivery;
	}

	public void setTcOutDeliveryRedelivery(Q88_TcOutDtl_Delivery tcOutDeliveryRedelivery) {
		if(tcOutDeliveryRedelivery ==null) {
			if(this.tcOutDeliveryRedelivery !=null) {
				this.tcOutDeliveryRedelivery.setQ88TcOutDelivery(this);
			}
		}
		this.tcOutDeliveryRedelivery = tcOutDeliveryRedelivery;
	}

	@Override
	public String toString() {
		return "Q88_TcOutDtl [trans_Id=" + trans_Id + ", tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted="
				+ vesselIdEncrypted + ", durationRedeliveryDays=" + durationRedeliveryDays + ", contract=" + contract
				+ ", commissionList=" + commissionList + ", results=" + results + ", duration=" + duration
				+ ", voyageList=" + voyageList + ", tcOutDeliveryRedelivery=" + tcOutDeliveryRedelivery + "]";
	}

	
	

	

	

	
	

}

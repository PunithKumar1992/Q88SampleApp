
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

import com.bsol.q88.model.cpk.Q88_TcOutListDetailsCPK;

@Entity
@Table(name = "Q88_TC_TCOUTLISTDETAILS")
@IdClass(Q88_TcOutListDetailsCPK.class)
public class Q88_TcOutListDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TCOUTDETAIL_SEQID")
	private Integer tcOutDetail_SeqId;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;

	@Column(name = "DURATIONREDELIVERYDAYS")
	private Integer durationRedeliveryDays;

	@OneToOne(mappedBy = "q88TcOutListFixture", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_TcoFixture contract;
	
	
	@OneToMany(mappedBy = "tcOutFixtureCommission", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Q88_TcOutFixtureCommission.class)
	List<Q88_TcOutFixtureCommission> commissionList = new ArrayList<Q88_TcOutFixtureCommission>();
	
	@OneToOne(mappedBy = "tcOutResults",fetch = FetchType.EAGER,cascade = CascadeType.ALL,optional = true)
	private Q88_TcOutResults results;
	
	@OneToMany(mappedBy = "q88TcOutPeriod",fetch = FetchType.LAZY,cascade = {CascadeType.ALL},targetEntity =Q88_TcOutPeriod.class )
	private List<Q88_TcOutPeriod> duration = new ArrayList<Q88_TcOutPeriod>();
	
	@OneToMany(mappedBy = "q88TcOutVoyage",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_TcOutVoyage.class)
	private List<Q88_TcOutVoyage> voyageList = new ArrayList<Q88_TcOutVoyage>();

	@OneToOne(mappedBy = "q88TcOutDelivery",fetch = FetchType.EAGER,cascade = CascadeType.ALL,optional = true)
	private Q88_TcOutDelivery tcOutDeliveryRedelivery;
	
	public Integer getTcOutDetail_SeqId() {
		return tcOutDetail_SeqId;
	}

	public void setTcOutDetail_SeqId(Integer tcOutDetail_SeqId) {
		this.tcOutDetail_SeqId = tcOutDetail_SeqId;
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

	public Q88_TcoFixture getContract() {
		return contract;
	}

	public void setContract(Q88_TcoFixture contract) {
		if (contract == null) {
			if (this.contract != null) {
				this.contract.setQ88TcOutListFixture(null);
			}
		} else {
			contract.setQ88TcOutListFixture(this);
		}
		this.contract = contract;
	}

	public List<Q88_TcOutFixtureCommission> getCommissionList() {
		return commissionList;
	}

	public void addCommissionList(List<Q88_TcOutFixtureCommission> commissionList) {
		this.commissionList = commissionList;
	}
	
	public Q88_TcOutResults getResults() {
		return results;
	}

	public void setResults(Q88_TcOutResults results) {
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
	
	

	public List<Q88_TcOutPeriod> getDuration() {
		return duration;
	}

	public void addDuration(List<Q88_TcOutPeriod> duration) {
		this.duration = duration;
	}
	

	public List<Q88_TcOutVoyage> getVoyageList() {
		return voyageList;
	}

	public void addVoyageList(List<Q88_TcOutVoyage> voyageList) {
		this.voyageList = voyageList;
	}

	public Q88_TcOutDelivery getTcOutDeliveryRedelivery() {
		return tcOutDeliveryRedelivery;
	}

	public void setTcOutDeliveryRedelivery(Q88_TcOutDelivery tcOutDeliveryRedelivery) {
		if(tcOutDeliveryRedelivery ==null) {
			if(this.tcOutDeliveryRedelivery !=null) {
				this.tcOutDeliveryRedelivery.setQ88TcOutDelivery(this);
			}
		}
		this.tcOutDeliveryRedelivery = tcOutDeliveryRedelivery;
	}

	@Override
	public String toString() {
		return "Q88_TcOutListDetails [tcOutDetail_SeqId=" + tcOutDetail_SeqId + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", durationRedeliveryDays=" + durationRedeliveryDays
				+ ", contract=" + contract + ", commissionList=" + commissionList + ", results=" + results
				+ ", duration=" + duration + ", voyageList=" + voyageList + ", tcOutDeliveryRedelivery="
				+ tcOutDeliveryRedelivery + "]";
	}

	

	

	

	
	

}


  package com.bsol.q88.model;
  
  import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

  
@Entity
@Table(name = "Q88_TC_TCOUTLISTDETAILS") 
public class Q88_TcOutListDetails implements Serializable{
	  
	
	private static final long serialVersionUID = 1L;
	
	  @Id
	  @Column(name = "TCOUTDETAIL_SEQID")
	  private String tcOutDetail_SeqId;
	  @Id
	  @Column(name = "TCOUTIDENCRYPTED")
	  private String tcOutIdEncrypted;
	  @Id
	  @Column(name = "VESSELIDENCRYPTED")
	  private String vesselIdEncrypted;
	  
	  @Column(name = "")
	  private Integer durationRedeliveryDays;
	  
	  @OneToOne(mappedBy = "q88TcOutListFixture",fetch = FetchType.EAGER,cascade = CascadeType.ALL,optional = true)
	  private Q88_TcoFixture contract;

	public String getTcOutDetail_SeqId() {
		return tcOutDetail_SeqId;
	}

	public void setTcOutDetail_SeqId(String tcOutDetail_SeqId) {
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
		this.contract = contract;
	}

	@Override
	public String toString() {
		return "Q88_TcOutListDetails [tcOutDetail_SeqId=" + tcOutDetail_SeqId + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", durationRedeliveryDays=" + durationRedeliveryDays
				+ ", contract=" + contract + "]";
	}
	  
	  
  
  }
 
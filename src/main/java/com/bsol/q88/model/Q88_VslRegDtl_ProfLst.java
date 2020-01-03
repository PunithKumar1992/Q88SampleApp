package com.bsol.q88.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_VSLREGDTL_PROFLST")
public class Q88_VslRegDtl_ProfLst {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELID")
	private String vesselId;
	
	@Id
	@Column(name = "VSLPROF_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer vslProf_SeqId;
	
	@Column(name = "PROFILENAME")
	private String profileName;

}

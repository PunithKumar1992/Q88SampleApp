package com.bsol.q88.mapper;

import com.bsol.q88.model.Q88_VslRegDtl;

public class CustomVslRegDtlMapper {

	private Q88_VslRegDtl vslregdtldto;
	private Integer trans_Id;
	private String vesselId;

	private CustomVslRegDtlMapper() {

	}

	public CustomVslRegDtlMapper(Q88_VslRegDtl vslregdtldto) {
		this.vslregdtldto = vslregdtldto;
		this.trans_Id = vslregdtldto.getTrans_Id();
		this.vesselId = vslregdtldto.getVesselId();
	}

	public Q88_VslRegDtl getVesselRegDtl() {

		Q88_VslRegDtl vslregdtl = new Q88_VslRegDtl();
		vslregdtl.setTrans_Id(trans_Id);
		vslregdtl.setVesselId(vesselId);
		vslregdtl.setName(vslregdtldto.getName());
		vslregdtl.setImo(vslregdtldto.getImo());
		vslregdtl.setAccountCode(vslregdtldto.getAccountCode());
		vslregdtl.setHireRate(vslregdtldto.getHireRate());
		vslregdtl.setMastersEmail(vslregdtldto.getMastersEmail());

		return vslregdtl;
	}

	

}

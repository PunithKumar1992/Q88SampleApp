package com.bsol.q88.util.dataconvertor;

import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomVesselHDContrctDtlMapper;
import com.bsol.q88.model.Q88_HdCntrtDTL;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_Dlvr;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_Durtn;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_RDlvr;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_Terms;

@Component
public class Q88_VslHeadContractDtlTransferImpl implements Q88_VslHeadContractDtlTransfer {

	@Override
	public <T> T getVslHeadContractDtl(Q88_HdCntrtDTL vslHdCntrct, Class<T> type) {
		CustomVesselHDContrctDtlMapper custom = new CustomVesselHDContrctDtlMapper(vslHdCntrct);
		if(type == Q88_HdCntrtDTL.class) {
			 return (T) custom.getVslHeadCntrctDtl();
		}else if(type == Q88_HdCntrtDTL_Cntrt.class) {
			 return (T) custom.getvslHeadContract();
		}else if (type == Q88_HdCntrtDTL_Cntrt_Durtn.class) {
			return (T) custom.getVslHdContractDuration();
		}else if(type == Q88_HdCntrtDTL_Cntrt_Terms.class) {
			return (T) custom.getvslHdContctTerms();
		}else if (type == Q88_HdCntrtDTL_Cntrt_Dlvr.class) {
			return (T) custom.getvslHdContracrtDelivery();
		}else if (type == Q88_HdCntrtDTL_Cntrt_RDlvr.class ) {
			return (T) custom.getVslHdCntrctReDelivery();
		}
		return null;
	}

}

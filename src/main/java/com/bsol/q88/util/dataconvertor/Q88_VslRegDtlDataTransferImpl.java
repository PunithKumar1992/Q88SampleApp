package com.bsol.q88.util.dataconvertor;

import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomVslRegDtlMapper;
import com.bsol.q88.model.Q88_VslRegDtl;

@Component
public class Q88_VslRegDtlDataTransferImpl implements Q88_VslRegDtlDataTransfer{

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getVslRegDtl(Q88_VslRegDtl vslregdtl, Class<T> type) {
		CustomVslRegDtlMapper custom = new CustomVslRegDtlMapper(vslregdtl);
		 if(type == Q88_VslRegDtl.class) {
			 return (T) custom.getVesselRegDtl();
		 }
		 else{
			  throw new IllegalArgumentException("Class type argument is not valid");
		  }
		
	}

}

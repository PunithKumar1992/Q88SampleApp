package com.bsol.q88.util.dataconvertor;

import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomVoyObjMapper;
import com.bsol.q88.model.Q88_VoyObj;
import com.bsol.q88.model.Q88_VoyObj_FixtureLst;
import com.bsol.q88.model.Q88_VoyObj_Review;
import com.bsol.q88.model.Q88_VoyObj_Rslt;
import com.bsol.q88.model.Q88_VoyObj_RsltDtl;
import com.bsol.q88.model.Q88_VoyObj_RsltFixed;
import com.bsol.q88.model.Q88_VoyObj_RsltFixedDtl;
import com.bsol.q88.model.Q88_VoyObj_Tcrelet;

@Component
public class Q88_VoyObjDataTransferImpl implements Q88_VoyObjDataTransfer {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getVoyObj(Q88_VoyObj voyObj, Class<T> type) {
	CustomVoyObjMapper custom = new CustomVoyObjMapper(voyObj);
	
	 if(type == Q88_VoyObj.class) {
		 return (T) custom.getVoyObj();
	 }else if(type == Q88_VoyObj_Rslt.class) {
		 return (T) custom.getVoyObjRslt();
	 }else if(type == Q88_VoyObj_RsltFixed.class) {
		 return (T) custom.getVoyObjRsltFixed();
	 }else if(type == Q88_VoyObj_Tcrelet.class) {
		 return (T) custom.getVoyObjTcRelet();
	 }else if(type == Q88_VoyObj_Review.class) {
		 return (T) custom.getVoyObjReview();
	 }
	 else{
		  throw new IllegalArgumentException("Class type argument is not valid");
	  }
		
	}

}

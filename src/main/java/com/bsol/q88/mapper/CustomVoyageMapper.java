package com.bsol.q88.mapper;

import javax.validation.constraints.NotNull;

import com.bsol.q88.model.Q88_Voyage;
import com.bsol.q88.model.Q88_VoyageResult;

public class CustomVoyageMapper {

	private Q88_Voyage q88Voyage;
	private String voyageId;
	private String vesselId;
	
	private CustomVoyageMapper() {
		
	}
	
	public CustomVoyageMapper(@NotNull Q88_Voyage q88Voyage) {
		this();
		this.q88Voyage = q88Voyage;
		this.voyageId = q88Voyage.getVoyageId();
		this.vesselId = q88Voyage.getVesselId();
	}
	
	public Q88_Voyage getVoyage() {
		 Q88_Voyage q88Voyagelist = new Q88_Voyage();
		 q88Voyagelist.setEndDateUtc(q88Voyage.getEndDateUtc());
		 q88Voyagelist.setIsEstimate(q88Voyage.getIsEstimate());
		 q88Voyagelist.setModuleType(q88Voyage.getModuleType());
		 q88Voyagelist.setOffhireDays(q88Voyage.getOffhireDays());
		 q88Voyagelist.setStartDateUtc(q88Voyage.getStartDateUtc());
		 q88Voyagelist.setTags(q88Voyage.getTags());
		 q88Voyagelist.setTcnumber(q88Voyage.getTcnumber());
		 q88Voyagelist.setTcoutidencrypted(q88Voyage.getTcoutidencrypted());
		 q88Voyagelist.setUrl(q88Voyage.getUrl());
		 q88Voyagelist.setVersion(q88Voyage.getVersion());
		 q88Voyagelist.setVesselId(q88Voyage.getVesselId());
		 q88Voyagelist.setVesselimo(q88Voyage.getVesselimo());
		 q88Voyagelist.setVesselName(q88Voyage.getVesselName());
		 q88Voyagelist.setVoyageId(q88Voyage.getVoyageId());
		 q88Voyagelist.setVoyageNumber(q88Voyage.getVoyageNumber());
		 return q88Voyage;
	}
	
	public Q88_VoyageResult getQ88VoyageResult() {
		
		Q88_VoyageResult q88VoyageRes = new Q88_VoyageResult();
		q88VoyageRes.setBunkers(q88Voyage.getResults().getBunkers());
		q88VoyageRes.setCommission(q88Voyage.getResults().getCommission());
		q88VoyageRes.setDays(q88Voyage.getResults().getDays());
		q88VoyageRes.setEfficiency(q88Voyage.getResults().getEfficiency());
		
		return q88VoyageRes;
	}
	
	
	
}

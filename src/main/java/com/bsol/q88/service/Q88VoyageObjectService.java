package com.bsol.q88.service;

import java.util.List;
import java.util.Optional;

import com.bsol.q88.model.Q88_Voyage;

public interface Q88VoyageObjectService {

	public void saveVoyageObjList(Q88_Voyage voyageObj);
	public Q88_Voyage getVoyageObject(String voyageId,String vesselId);
	
}

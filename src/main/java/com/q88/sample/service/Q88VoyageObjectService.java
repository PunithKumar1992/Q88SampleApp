package com.q88.sample.service;

import java.util.List;
import java.util.Optional;
import com.q88.sample.model.Q88_Voyage;

public interface Q88VoyageObjectService {

	public void saveVoyageObjList(Q88_Voyage voyageObj);
	public List<Q88_Voyage> getAllVoyageObj();
}

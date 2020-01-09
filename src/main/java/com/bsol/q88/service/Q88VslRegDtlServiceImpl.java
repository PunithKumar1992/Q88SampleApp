package com.bsol.q88.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88VslRegDtlDao;
import com.bsol.q88.mapper.CustomVslRegDtlMapper;
import com.bsol.q88.model.Q88_VslRegDtl;
import com.bsol.q88.model.Q88_VslRegDtl_HeadContract;
import com.bsol.q88.model.Q88_VslRegDtl_HeadContractDtl;
import com.bsol.q88.model.Q88_VslRegDtl_ProfLst;
import com.bsol.q88.model.Q88_VslRegDtl_ProfLst_NPP;
import com.bsol.q88.model.Q88_VslRegDtl_ProfLst_NPPP;
import com.bsol.q88.model.Q88_VslRegDtl_ProfLst_PP;
import com.bsol.q88.model.Q88_VslRegDtl_ProfLst_PPP;
import com.bsol.q88.model.Q88_VslRegDtl_TagLst;
import com.bsol.q88.util.dataconvertor.Q88_VslRegDtlDataTransfer;

@Service
public class Q88VslRegDtlServiceImpl implements Q88VslRegDtlService {

	@Autowired
	private Q88VslRegDtlDao vslRegDtldao;

	@Autowired
	private Q88_VslRegDtlDataTransfer vslRegDtlTransfer;

	@Override
	public void saveVslRegDtl(Q88_VslRegDtl vslregdtl) {

		CustomVslRegDtlMapper custom = new CustomVslRegDtlMapper(vslregdtl);
		Q88_VslRegDtl vesselregDtl = vslRegDtlTransfer.getVslRegDtl(vslregdtl, Q88_VslRegDtl.class);
		Integer transId = vslregdtl.getTrans_Id();
		String vesselId = vslregdtl.getVesselId();
		List<Q88_VslRegDtl_ProfLst> vesselProlist = vslregdtl.getProfileList();
		List<Q88_VslRegDtl_ProfLst> vesselProfile = new ArrayList<Q88_VslRegDtl_ProfLst>();
		if (vesselProlist != null) {
			for (Q88_VslRegDtl_ProfLst vslproflst : vesselProlist) {
				Integer vslProSeqId = vslRegDtldao.getVslProfSeqId();
				Q88_VslRegDtl_ProfLst profile = new Q88_VslRegDtl_ProfLst();
				profile.setTrans_Id(transId);
				profile.setVesselId(vesselId);
				profile.setVslProf_SeqId(vslProSeqId);
				profile.setProfileName(vslproflst.getProfileName());
				
				
				List<Q88_VslRegDtl_ProfLst_PP> vesselPassageprofList = vslproflst.getPassageProfile();
			    List<Q88_VslRegDtl_ProfLst_PP> vesselPassageprof = new ArrayList<Q88_VslRegDtl_ProfLst_PP>();
			    
			    if(vesselPassageprofList !=null) {
			    	for(Q88_VslRegDtl_ProfLst_PP passageproflst : vesselPassageprofList) {
			    		Integer pp_SeqId = vslRegDtldao.getVslPasProfProSeqId();
			    		Q88_VslRegDtl_ProfLst_PP vslpassageprof = new Q88_VslRegDtl_ProfLst_PP();
			    		vslpassageprof.setTrans_Id(transId);
			    		vslpassageprof.setVesselId(vesselId);
			    		vslpassageprof.setVslProf_SeqId(vslProSeqId);
			    		vslpassageprof.setPp_SeqId(pp_SeqId);
			    		vslpassageprof.setPassageType(passageproflst.getPassageType());
			    		List<Q88_VslRegDtl_ProfLst_PPP> vslPPPList = passageproflst.getConsumption();
			    		List<Q88_VslRegDtl_ProfLst_PPP> vslPPP = new ArrayList<Q88_VslRegDtl_ProfLst_PPP>();
			    		
			    		if(vslPPPList !=null) {
			    			for(Q88_VslRegDtl_ProfLst_PPP vslPPPlst : vslPPPList) {
			    				Q88_VslRegDtl_ProfLst_PPP vesselPPP = new Q88_VslRegDtl_ProfLst_PPP();
			    				vesselPPP.setTrans_Id(transId);
			    				vesselPPP.setVesselId(vesselId);
			    				vesselPPP.setVslProf_SeqId(vslProSeqId);
			    				vesselPPP.setPp_SeqId(pp_SeqId);
			    				vesselPPP.setRpm(vslPPPlst.getRpm());
			    				vesselPPP.setIfo(vslPPPlst.getIfo());
			    				vesselPPP.setMgo(vslPPPlst.getMgo());
			    				vesselPPP.setSpeed(vslPPPlst.getSpeed());
			    				vesselPPP.setIsDefault(vslPPPlst.getIsDefault());
			    				vslPPP.add(vesselPPP);
			    				
			    			}
			    		}
			    		if(vslPPP !=null)
				    		vslpassageprof.addConsumption(vslPPP);
				    		vesselPassageprof.add(vslpassageprof);
			    	}
			    	
			    	
			    }

			    List<Q88_VslRegDtl_ProfLst_NPP> vesselNonPassageprofList = vslproflst.getNonPassageProfile();
			    List<Q88_VslRegDtl_ProfLst_NPP> vesselNonPassageprof = new ArrayList<Q88_VslRegDtl_ProfLst_NPP>();
			    if(vesselNonPassageprofList !=null) {
			    	for(Q88_VslRegDtl_ProfLst_NPP nonpassageproflst : vesselNonPassageprofList) {
			    		Integer  npp_SeqId = vslRegDtldao.getVslNPPSeqId();
			    		Q88_VslRegDtl_ProfLst_NPP nonprofile = new Q88_VslRegDtl_ProfLst_NPP();
			    		nonprofile.setTrans_Id(transId);
			    		nonprofile.setVesselId(vesselId);
			    		nonprofile.setVslProf_SeqId(vslProSeqId);
			    		nonprofile.setNpp_SeqId(npp_SeqId);
			    		List<Q88_VslRegDtl_ProfLst_NPPP> vslNPPPList = nonpassageproflst.getConsumption();
			    		List<Q88_VslRegDtl_ProfLst_NPPP> vslNPPP = new ArrayList<Q88_VslRegDtl_ProfLst_NPPP>();
			    		
			    		if(vslNPPPList !=null) {
			    			for(Q88_VslRegDtl_ProfLst_NPPP vslNPPPlst : vslNPPPList) {
			    				Q88_VslRegDtl_ProfLst_NPPP  vesselNPPP = new Q88_VslRegDtl_ProfLst_NPPP();
			    				vesselNPPP.setTrans_Id(transId);
			    				vesselNPPP.setVesselId(vesselId);
			    				vesselNPPP.setVslProf_SeqId(vslProSeqId);
			    				vesselNPPP.setNpp_SeqId(npp_SeqId);
			    				vesselNPPP.setIfoLoad(vslNPPPlst.getIfoLoad());
			    				vesselNPPP.setIfoDischarge(vslNPPPlst.getIfoDischarge());
			    				vesselNPPP.setIfoIdle(vslNPPPlst.getIfoIdle());
			    				vesselNPPP.setIfoHeat(vslNPPPlst.getIfoHeat());
			    				vesselNPPP.setIfoClean(vslNPPPlst.getIfoClean());
			    				vesselNPPP.setIfoInert(vslNPPPlst.getIfoInert());
			    				vesselNPPP.setMgoLoad(vslNPPPlst.getMgoLoad());
			    				vesselNPPP.setMgoDischarge(vslNPPPlst.getMgoDischarge());
			    				vesselNPPP.setMgoIdle(vslNPPPlst.getMgoIdle());
			    				vesselNPPP.setMgoHeat(vslNPPPlst.getMgoHeat());
			    				vesselNPPP.setMgoClean(vslNPPPlst.getMgoClean());
			    				vesselNPPP.setMgoInert(vslNPPPlst.getMgoInert());
			    				vslNPPP.add(vesselNPPP);
			    			}
			    		}
			    		if(vslNPPP !=null) {
			    			nonprofile.addConsumption(vslNPPP);
			    			vesselNonPassageprof.add(nonprofile);
			    		}
			    		
			    	}
			    }
			    
			  	    
			    
			    
			    if(vesselPassageprof !=null) {
		    		profile.addPassageProfile(vesselPassageprof);
		    	}
			    if(vesselNonPassageprof !=null) {
			    	profile.addNonPassageProfile(vesselNonPassageprof);
			    }
		    	
		    	vesselProfile.add(profile);
	
			}
			
		}
		  List<Q88_VslRegDtl_TagLst> vesselRegTagList = vslregdtl.getTagList();
		  List<Q88_VslRegDtl_TagLst> vesselRegTag = new ArrayList<Q88_VslRegDtl_TagLst>();
		   if(vesselRegTagList !=null) {
			   for(Q88_VslRegDtl_TagLst taglst : vesselRegTagList) {
				   Q88_VslRegDtl_TagLst tag = new Q88_VslRegDtl_TagLst();
				   tag.setTrans_Id(transId);
				   tag.setVesselId(vesselId);
				   tag.setCATEGORY(taglst.getCATEGORY());
				   tag.setValue(taglst.getValue());
				   
				   vesselRegTag.add(tag);
			   }
		   }
		   
		   Q88_VslRegDtl_HeadContract  vesselRegHdContact = vslregdtl.getHeadContract();
		   Q88_VslRegDtl_HeadContract vesselRegHdContract = new Q88_VslRegDtl_HeadContract();
		   Integer vslHdContractSeq_id  = vslRegDtldao.getVslHdContractSeqId();
		   
		   if(vesselRegHdContact !=null) {
			   vesselRegHdContract.setTrans_Id(transId);
			   vesselRegHdContract.setVesselId(vesselId);
			   vesselRegHdContract.setHeadContract_SeqId(vslHdContractSeq_id);
		   }
		   List<Q88_VslRegDtl_HeadContractDtl> vslHdContrctDtlList = vslregdtl.getHeadContract().getList();
		   List<Q88_VslRegDtl_HeadContractDtl>  vslHdContrctDtl = new ArrayList<Q88_VslRegDtl_HeadContractDtl>();
		   if(vslHdContrctDtlList !=null) {
			   for(Q88_VslRegDtl_HeadContractDtl contrctdtl : vslHdContrctDtlList) {
				   Q88_VslRegDtl_HeadContractDtl vslContractDtl = new Q88_VslRegDtl_HeadContractDtl();
				   vslContractDtl.setTrans_Id(transId);
				   vslContractDtl.setVesselId(vesselId);
				   vslContractDtl.setHeadContract_SeqId(vslHdContractSeq_id);
				   vslContractDtl.setTcInIdEncrypted(contrctdtl.getTcInIdEncrypted());
				   vslContractDtl.setDisplayOrder(contrctdtl.getDisplayOrder());
				   vslContractDtl.setContractNumber(contrctdtl.getContractNumber());
				   vslContractDtl.setOwner(contrctdtl.getOwner());
				   vslContractDtl.setCp_Date(contrctdtl.getCpDate());
				   vslContractDtl.setDelivery_Datetime(contrctdtl.getDeliveryDatetime());
				   vslContractDtl.setDuration(contrctdtl.getDuration());
				   vslContractDtl.setDurationType(contrctdtl.getDurationType());
				   vslContractDtl.setOption(contrctdtl.getOption());
				   vslContractDtl.setIsCurrent(contrctdtl.getIsCurrent());
				   
				   vslHdContrctDtl.add(vslContractDtl);
			   }
		   }
	
		if (vesselProfile != null)
		vesselregDtl.addProfileList(vesselProfile);
		if(vesselRegTag != null)
		vesselregDtl.addTagList(vesselRegTag);
		if(vslHdContrctDtl !=null)
		vesselRegHdContract.addList(vslHdContrctDtl);
		if(vesselRegHdContract !=null)
		vesselregDtl.addHeadContract(vesselRegHdContract);
		vslRegDtldao.save(vesselregDtl);

	}

}

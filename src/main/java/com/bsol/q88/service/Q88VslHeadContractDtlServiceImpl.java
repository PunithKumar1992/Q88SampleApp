package com.bsol.q88.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88VslHeadContractDtlDao;
import com.bsol.q88.mapper.CustomVesselHDContrctDtlMapper;
import com.bsol.q88.model.Q88_HdCntrtDTL;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_Dlvr;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_Dlvr_Bun;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_Durtn;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_DurtnDtl;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_RDlvr;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_RDlvr_Bun;
import com.bsol.q88.model.Q88_HdCntrtDTL_Cntrt_Terms;
import com.bsol.q88.model.Q88_HdCntrtDTL_InvoiceLst;
import com.bsol.q88.model.Q88_HdCntrtDTL_OffhireLst;
import com.bsol.q88.model.Q88_HdCntrtDTL_OffhireLst_Bun;
import com.bsol.q88.model.Q88_HdCntrtDTL_VoyLst;
import com.bsol.q88.util.dataconvertor.Q88_VslHeadContractDtlTransfer;

@Service
public class Q88VslHeadContractDtlServiceImpl implements Q88VslHeadContractDtlService {

	@Autowired
	private Q88VslHeadContractDtlDao vslHdCntrctdao;

	@Autowired
	private Q88_VslHeadContractDtlTransfer vslHdCntrctTransfer;
	
	private Logger logger = Logger.getLogger(this.getClass());

	@Override
	@Transactional
	public void saveVslHeadContractDtl(Q88_HdCntrtDTL vslHdCntrctdtl) {
		
		logger.info("Q88VesselHeadContract details saveVessel Head Contract Detail method inside");
		Integer transId = vslHdCntrctdtl.getTrans_Id();
		String vesslId = vslHdCntrctdtl.getContract().getVesselIdEncrypted();
		String tcInId = vslHdCntrctdtl.getContract().getTcInIdEncrypted();

		CustomVesselHDContrctDtlMapper custom = new CustomVesselHDContrctDtlMapper(vslHdCntrctdtl);
		Q88_HdCntrtDTL_Cntrt vslHdCntrct = null;
		List<Q88_HdCntrtDTL_Cntrt_DurtnDtl> vslHdCntrctDurationlst = custom.getVslHdContrctDurationList();
		Q88_HdCntrtDTL_Cntrt_Durtn vslHdCntrctDuration = vslHdCntrctTransfer.getVslHeadContractDtl(vslHdCntrctdtl,
				Q88_HdCntrtDTL_Cntrt_Durtn.class);
		if (vslHdCntrctDurationlst != null)
			vslHdCntrctDuration.setList(vslHdCntrctDurationlst);
		Q88_HdCntrtDTL_Cntrt_Terms vslHdCntrctTerms = vslHdCntrctTransfer.getVslHeadContractDtl(vslHdCntrctdtl,
				Q88_HdCntrtDTL_Cntrt_Terms.class);
		if (vslHdCntrctTerms != null) {
			vslHdCntrct = vslHdCntrctTransfer.getVslHeadContractDtl(vslHdCntrctdtl, Q88_HdCntrtDTL_Cntrt.class);
		}
		if (vslHdCntrctTerms != null)
			vslHdCntrct.setTerms(vslHdCntrctTerms);
		if (vslHdCntrctDuration != null)
			vslHdCntrct.setContractDuration(vslHdCntrctDuration);
		Q88_HdCntrtDTL vslHdCntrctDtl = vslHdCntrctTransfer.getVslHeadContractDtl(vslHdCntrctdtl, Q88_HdCntrtDTL.class);
		Q88_HdCntrtDTL_Cntrt_Dlvr vslHdCntrctDeliver = vslHdCntrctTransfer.getVslHeadContractDtl(vslHdCntrctdtl,
				Q88_HdCntrtDTL_Cntrt_Dlvr.class);
		List<Q88_HdCntrtDTL_Cntrt_Dlvr_Bun> dlvrBunkerlist = custom.getVslHdCntrctDlrBunker();
		Q88_HdCntrtDTL_Cntrt_RDlvr vslHdCntrctReDeliver = vslHdCntrctTransfer.getVslHeadContractDtl(vslHdCntrctdtl,
				Q88_HdCntrtDTL_Cntrt_RDlvr.class);
		List<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun> redlvrBunkerlist = custom.getVslHdCntrctReDlvrBunker();
		if (dlvrBunkerlist != null)
			vslHdCntrctDeliver.addBunkerList(dlvrBunkerlist);
		if (vslHdCntrctDeliver != null)
			vslHdCntrct.setDelivery(vslHdCntrctDeliver);
		if (redlvrBunkerlist != null)
			vslHdCntrctReDeliver.addBunkerList(redlvrBunkerlist);
		if (vslHdCntrctReDeliver != null)
			vslHdCntrct.setRedelivery(vslHdCntrctReDeliver);
		List<Q88_HdCntrtDTL_VoyLst> vslHdCntrctVoylst = custom.getVslHdCntrctVoyList();
		if (vslHdCntrctVoylst != null) {
			vslHdCntrctDtl.addVoyageList(vslHdCntrctVoylst);
		}
		List<Q88_HdCntrtDTL_OffhireLst> vsloffhireList = vslHdCntrctdtl.getOffhireList();
		List<Q88_HdCntrtDTL_OffhireLst> vsloffhirels = new ArrayList<Q88_HdCntrtDTL_OffhireLst>();

		if (vsloffhireList != null) {
			for (Q88_HdCntrtDTL_OffhireLst offlst : vsloffhireList) {
				Integer offSeqId = vslHdCntrctdao.getVslHdCntrctOffHireSeqId();
				Q88_HdCntrtDTL_OffhireLst offhire = new Q88_HdCntrtDTL_OffhireLst();
				offhire.setTrans_Id(transId);
				offhire.setVesselIdEncrypted(vesslId);
				offhire.setTcInIdEncrypted(tcInId);
				offhire.setOffhire_SeqId(offSeqId);
				offhire.setVoyageIdEncrypted(offlst.getVoyageIdEncrypted());
				offhire.setDisplayOrder(offlst.getDisplayOrder());
				offhire.setVoyageNumber(offlst.getVoyageNumber());
				offhire.setReason(offlst.getReason());
				offhire.setDate_From(offlst.getDateFrom());
				offhire.setDate_To(offlst.getDateTo());
				offhire.setDays(offlst.getDays());
				offhire.setRemark(offlst.getRemark());

				List<Q88_HdCntrtDTL_OffhireLst_Bun> offhireBunkerList = offlst.getOffhireBunkers();
				List<Q88_HdCntrtDTL_OffhireLst_Bun> offhireBunker = new ArrayList<Q88_HdCntrtDTL_OffhireLst_Bun>();
				if (offhireBunkerList != null) {
					for (Q88_HdCntrtDTL_OffhireLst_Bun offBunlst : offhireBunkerList) {
						Q88_HdCntrtDTL_OffhireLst_Bun offBunker = new Q88_HdCntrtDTL_OffhireLst_Bun();
						offBunker.setTrans_Id(transId);
						offBunker.setVesselIdEncrypted(vesslId);
						offBunker.setOffhire_SeqId(offSeqId);
						offBunker.setTcInIdEncrypted(tcInId);
						offBunker.setGrade(offBunlst.getGrade());
						offBunker.setQuantity(offBunlst.getQuantity());
						offBunker.setPrice(offBunlst.getPrice());
						offBunker.setCost(offBunlst.getCost());

						offhireBunker.add(offBunker);
					}
				}
				if (offhireBunker != null)
					offhire.addOffhireBunkers(offhireBunker);

				vsloffhirels.add(offhire);
			}
		}
		if (vsloffhirels != null)
			vslHdCntrctDtl.addOffhireList(vsloffhirels);

		if (vslHdCntrct != null)
			vslHdCntrctDtl.setContract(vslHdCntrct);
		List<Q88_HdCntrtDTL_InvoiceLst> invoicelist = custom.getVslHdCntrctInvoiceLst();
		if(invoicelist !=null)
			vslHdCntrctDtl.addInvoiceList(invoicelist);

		vslHdCntrctdao.save(vslHdCntrctDtl);

	}

}

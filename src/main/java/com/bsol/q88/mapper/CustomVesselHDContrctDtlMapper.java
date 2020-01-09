package com.bsol.q88.mapper;

import java.util.ArrayList;
import java.util.List;

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
import com.bsol.q88.model.Q88_HdCntrtDTL_VoyLst;
import com.bsol.q88.model.Q88_TcOutList;

public class CustomVesselHDContrctDtlMapper {

	
	private Q88_HdCntrtDTL vslHdCntrtDtlDto;
	private Integer trans_Id;
	private String vesselIdEncrypted;
	private String tcInIdEncrypted;
	
	private CustomVesselHDContrctDtlMapper() {
		
	}
	
	public CustomVesselHDContrctDtlMapper(Q88_HdCntrtDTL vslHdCntrtDtlDto) {
		this.vslHdCntrtDtlDto = vslHdCntrtDtlDto;
		this.trans_Id = vslHdCntrtDtlDto.getTrans_Id();
		this.vesselIdEncrypted = vslHdCntrtDtlDto.getContract().getVesselIdEncrypted();
		this.tcInIdEncrypted = vslHdCntrtDtlDto.getContract().getTcInIdEncrypted();
	}
	
	public Q88_HdCntrtDTL getVslHeadCntrctDtl() {
		Q88_HdCntrtDTL vslHeadContract = new Q88_HdCntrtDTL();
		vslHeadContract.setTrans_Id(trans_Id);
		vslHeadContract.setTcInIdEncrypted(tcInIdEncrypted);
		vslHeadContract.setVesselIdEncrypted(vesselIdEncrypted);
		return vslHeadContract;
	}
	
	
	public Q88_HdCntrtDTL_Cntrt getvslHeadContract() {
		Q88_HdCntrtDTL_Cntrt headContrctdtl = vslHdCntrtDtlDto.getContract();
		Q88_HdCntrtDTL_Cntrt headcontract = new Q88_HdCntrtDTL_Cntrt();
		if (headContrctdtl != null) {
			headcontract.setTrans_Id(trans_Id);
			headcontract.setVesselIdEncrypted(vesselIdEncrypted);
			headcontract.setTcInIdEncrypted(tcInIdEncrypted);
			headcontract.setCp_Date(headContrctdtl.getCpDate());
			headcontract.setContractNumber(headContrctdtl.getContractNumber());
			headcontract.setType(headContrctdtl.getType());
			headcontract.setOwner(headContrctdtl.getOwner());
			headcontract.setOwnerExternalId(headContrctdtl.getOwnerExternalId());
			headcontract.setBroker(headContrctdtl.getBroker());
			headcontract.setBrokerExternalId(headContrctdtl.getBrokerExternalId());
			headcontract.setCharterer(headContrctdtl.getCharterer());
			headcontract.setChartererExternalId(headContrctdtl.getChartererExternalId());
			headcontract.setTechnical(headContrctdtl.getTechnical());
			headcontract.setPartner(headContrctdtl.getPartner());
			headcontract.setOther(headContrctdtl.getOther());
			headcontract.setRemark(headContrctdtl.getRemark());
			headcontract.setIsCurrent(headContrctdtl.getIsCurrent());
			return headcontract;
		}
		else {
			return null;
		}
		
	}
	
	public Q88_HdCntrtDTL_Cntrt_Durtn getVslHdContractDuration() {
		Q88_HdCntrtDTL_Cntrt_Durtn headContrctDuration = new  Q88_HdCntrtDTL_Cntrt_Durtn();
		headContrctDuration.setTrans_Id(trans_Id);
		headContrctDuration.setVesselIdEncrypted(vesselIdEncrypted);
		headContrctDuration.setTcInIdEncrypted(tcInIdEncrypted);
		
		return headContrctDuration;
	}
	
	public List<Q88_HdCntrtDTL_Cntrt_DurtnDtl> getVslHdContrctDurationList(){
		List<Q88_HdCntrtDTL_Cntrt_DurtnDtl> contrctDurationDtlList = vslHdCntrtDtlDto.getContract().getContractDuration().getList();
		List<Q88_HdCntrtDTL_Cntrt_DurtnDtl> contrctDurationDtl = new ArrayList<Q88_HdCntrtDTL_Cntrt_DurtnDtl>();
		if (contrctDurationDtlList != null) {
			for (Q88_HdCntrtDTL_Cntrt_DurtnDtl durationlst : contrctDurationDtlList) {
				Q88_HdCntrtDTL_Cntrt_DurtnDtl contrctDuraDtl = new Q88_HdCntrtDTL_Cntrt_DurtnDtl();
				contrctDuraDtl.setTrans_Id(trans_Id);
				contrctDuraDtl.setTcInIdEncrypted(tcInIdEncrypted);
				contrctDuraDtl.setVesselIdEncrypted(vesselIdEncrypted);
				contrctDuraDtl.setDisplayOrder(durationlst.getDisplayOrder());
				contrctDuraDtl.setStart_Date(durationlst.getStartDate());
				contrctDuraDtl.setDuration(durationlst.getDuration());
				contrctDuraDtl.setDurationType(durationlst.getDurationType());
				contrctDuraDtl.setOption(durationlst.getOption());
				contrctDuraDtl.setRemark(durationlst.getRemark());

				contrctDurationDtl.add(contrctDuraDtl);
			}
			return contrctDurationDtl;
		}
		else
		{
			return null;
		}

	}
	
	public Q88_HdCntrtDTL_Cntrt_Terms getvslHdContctTerms() {
		Q88_HdCntrtDTL_Cntrt_Terms hdCntrtterms = vslHdCntrtDtlDto.getContract().getTerms();
		Q88_HdCntrtDTL_Cntrt_Terms vslhdcntctterms = new Q88_HdCntrtDTL_Cntrt_Terms();
		
		if(hdCntrtterms !=null) {
			vslhdcntctterms.setTrans_Id(trans_Id);
			vslhdcntctterms.setVesselIdEncrypted(vesselIdEncrypted);
			vslhdcntctterms.setTcInIdEncrypted(tcInIdEncrypted);
			vslhdcntctterms.setDeliveryRange(hdCntrtterms.getDeliveryRange());
			vslhdcntctterms.setRedeliveryRange(hdCntrtterms.getRedeliveryRange());
			vslhdcntctterms.setNotices(hdCntrtterms.getNotices());
			vslhdcntctterms.setRedeliveryDays(hdCntrtterms.getRedeliveryDays());
			vslhdcntctterms.setOptionDeclareDays(hdCntrtterms.getOptionDeclareDays());
			vslhdcntctterms.setEarliestNoticeDays(hdCntrtterms.getEarliestNoticeDays());
			vslhdcntctterms.setDeclare_OptionDate(hdCntrtterms.getDeclareOptionDate());
			vslhdcntctterms.setEarliest_RedeliveryNoticeDate(hdCntrtterms.getEarliestRedeliveryNoticeDate());
			vslhdcntctterms.setEarliest_RedeliveryDate(hdCntrtterms.getEarliestRedeliveryDate());
			vslhdcntctterms.setExpected_RedeliveryDate(hdCntrtterms.getExpectedRedeliveryDate());
			vslhdcntctterms.setLatest_RedeliveryDate(hdCntrtterms.getLatestRedeliveryDate());
			
			return vslhdcntctterms;
			}
		else
		{
			return null;
		}
	}
	
	public  Q88_HdCntrtDTL_Cntrt_Dlvr getvslHdContracrtDelivery() {
		Q88_HdCntrtDTL_Cntrt_Dlvr vslCntrctDlvr = vslHdCntrtDtlDto.getContract().getDelivery();
		Q88_HdCntrtDTL_Cntrt_Dlvr  delivery = new Q88_HdCntrtDTL_Cntrt_Dlvr();
		
		if(vslCntrctDlvr!=null) {
			delivery.setTrans_Id(trans_Id);
			delivery.setVesselIdEncrypted(vesselIdEncrypted);
			delivery.setTcInIdEncrypted(tcInIdEncrypted);
			delivery.setPortIdEncrypted(vslCntrctDlvr.getPortIdEncrypted());
			delivery.setPortName(vslCntrctDlvr.getPortName());
			delivery.setDate_time(vslCntrctDlvr.getDatetime());
			
			return delivery;
		}
		else {
			return null;
		}
	}
	
	public List<Q88_HdCntrtDTL_Cntrt_Dlvr_Bun> getVslHdCntrctDlrBunker(){
		List<Q88_HdCntrtDTL_Cntrt_Dlvr_Bun> deliverBunkerList = vslHdCntrtDtlDto.getContract().getDelivery().getBunkerList();
		List<Q88_HdCntrtDTL_Cntrt_Dlvr_Bun> deliverBunker = new ArrayList<Q88_HdCntrtDTL_Cntrt_Dlvr_Bun>();
		
		if(deliverBunkerList !=null) {
			for(Q88_HdCntrtDTL_Cntrt_Dlvr_Bun dlvrBunkerlst : deliverBunkerList) {
				Q88_HdCntrtDTL_Cntrt_Dlvr_Bun bunker = new Q88_HdCntrtDTL_Cntrt_Dlvr_Bun();
				bunker.setTrans_Id(trans_Id);
				bunker.setVesselIdEncrypted(vesselIdEncrypted);
				bunker.setTcInIdEncrypted(tcInIdEncrypted);
				bunker.setGrade(dlvrBunkerlst.getGrade());
				bunker.setQuantity(dlvrBunkerlst.getQuantity());
				bunker.setPrice(dlvrBunkerlst.getPrice());
				
				deliverBunker.add(bunker);
			}
			return deliverBunker;
		}
		else {
			return null;
		}
	}
	
	public Q88_HdCntrtDTL_Cntrt_RDlvr  getVslHdCntrctReDelivery() {
		Q88_HdCntrtDTL_Cntrt_RDlvr vslCntrctReDlvr = vslHdCntrtDtlDto.getContract().getRedelivery();
		Q88_HdCntrtDTL_Cntrt_RDlvr  redelivery = new Q88_HdCntrtDTL_Cntrt_RDlvr();
		
		if(vslCntrctReDlvr!=null) {
			redelivery.setTrans_Id(trans_Id);
			redelivery.setVesselIdEncrypted(vesselIdEncrypted);
			redelivery.setTcInIdEncrypted(tcInIdEncrypted);
			redelivery.setPortIdEncrypted(vslCntrctReDlvr.getPortIdEncrypted());
			redelivery.setPortName(vslCntrctReDlvr.getPortName());
			redelivery.setDate_time(vslCntrctReDlvr.getDatetime());
			
			return redelivery;
		}
		else {
			return null;
		}
		
	
	}
	
	public List<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun> getVslHdCntrctReDlvrBunker(){
		List<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun> redeliverBunkerList = vslHdCntrtDtlDto.getContract().getRedelivery().getBunkerList();
		List<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun> redeliverBunker = new ArrayList<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun>();
		
		if(redeliverBunkerList !=null) {
			for(Q88_HdCntrtDTL_Cntrt_RDlvr_Bun redlvrBunkerlst : redeliverBunkerList) {
				Q88_HdCntrtDTL_Cntrt_RDlvr_Bun rebunker = new Q88_HdCntrtDTL_Cntrt_RDlvr_Bun();
				rebunker.setTrans_Id(trans_Id);
				rebunker.setVesselIdEncrypted(vesselIdEncrypted);
				rebunker.setTcInIdEncrypted(tcInIdEncrypted);
				rebunker.setGrade(redlvrBunkerlst.getGrade());
				rebunker.setQuantity(redlvrBunkerlst.getQuantity());
				rebunker.setPrice(redlvrBunkerlst.getPrice());
				
				redeliverBunker.add(rebunker);
			}
			return redeliverBunker;
		}
		else {
			return null;
		}

	}
	
	public List<Q88_HdCntrtDTL_VoyLst> getVslHdCntrctVoyList(){
		
		List<Q88_HdCntrtDTL_VoyLst> vslHdCntrctVoyList = vslHdCntrtDtlDto.getVoyageList();
		List<Q88_HdCntrtDTL_VoyLst> vslHdCntrctVoyage = new ArrayList<Q88_HdCntrtDTL_VoyLst>();
		
		if(vslHdCntrctVoyList !=null) {
			for(Q88_HdCntrtDTL_VoyLst voylst : vslHdCntrctVoyList) {
				Q88_HdCntrtDTL_VoyLst voyage = new Q88_HdCntrtDTL_VoyLst();
				voyage.setTrans_Id(trans_Id);
				voyage.setVesselIdEncrypted(vesselIdEncrypted);
				voyage.setTcInIdEncrypted(tcInIdEncrypted);
				voyage.setVoyageIdEncrypted(voylst.getVoyageIdEncrypted());
				voyage.setVoyageNumber(voylst.getVoyageNumber());
				voyage.setFirstLoadPort(voylst.getFirstLoadPort());
				voyage.setLastDischargePort(voylst.getLastDischargePort());
				voyage.setEnd_Date(voylst.getEndDate());
				voyage.setCargoes(voylst.getCargoes());
				voyage.setHire(voylst.getHire());
				
				vslHdCntrctVoyage.add(voyage);
			}
			return vslHdCntrctVoyage;
		}
		else {
			return null;
		}
		
	}
	
	public List<Q88_HdCntrtDTL_InvoiceLst> getVslHdCntrctInvoiceLst(){
		
		List<Q88_HdCntrtDTL_InvoiceLst> vslHdCntrctInvoiceList = vslHdCntrtDtlDto.getInvoiceList();
		List<Q88_HdCntrtDTL_InvoiceLst> vslHdCntrctVoyage = new ArrayList<Q88_HdCntrtDTL_InvoiceLst>();
		
		if(vslHdCntrctInvoiceList!=null  ) {
			for(Q88_HdCntrtDTL_InvoiceLst invoicelst : vslHdCntrctInvoiceList ) {
				Q88_HdCntrtDTL_InvoiceLst invoice = new Q88_HdCntrtDTL_InvoiceLst();
				invoice.setTrans_Id(trans_Id);
				invoice.setVesselIdEncrypted(vesselIdEncrypted);
				invoice.setTcInIdEncrypted(tcInIdEncrypted);
				invoice.setInvoiceDirection(invoicelst.getInvoiceDirection());
				invoice.setDescription(invoicelst.getDescription());
				invoice.setPeriod_Start(invoicelst.getPeriodStart());
				invoice.setPeriod_End(invoicelst.getPeriodEnd());
				invoice.setTotal(invoicelst.getTotal());
				
				vslHdCntrctVoyage.add(invoice);
			}
			return vslHdCntrctVoyage;
		}
		else {
			return null;
		}
	
	}
	
}

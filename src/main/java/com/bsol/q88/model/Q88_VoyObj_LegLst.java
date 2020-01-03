package com.bsol.q88.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyObj_Fixture_LegLstCPK;

@Entity
@Table(name = "Q88_VOYOBJ_LEGLST")
@IdClass(Q88_VoyObj_Fixture_LegLstCPK.class)
public class Q88_VoyObj_LegLst {
	
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "LEG_SEQID")
	private Integer leg_SeqId;
	
	@Column(name = "ARRIVEACTUALIZED")
	private String arriveActualized;
	
	@Column(name = "ARRIVEDRAFTFORE")
	private Double arriveDraftFore;
	
	@Column(name = "ARRIVEDRAFTAFT")
	private Double arriveDraftAft;
	
	@Column(name = "ARRIVEFW")
	private Double arriveFw;
	
	@Column(name = "ARRIVESLOPS")
	private Double arriveSlops;
	
	@Transient
	private String arriveUtc;
	
	@Column(name = "ARRIVEUTC")
	private LocalDateTime arrive_Utc;
	
	@Column(name = "AWAITINGLAYCANDAYS")
	private Double awaitingLaycanDays;
	
	@Column(name = "CLEANINGDAY")
	private Double cleaningDay;
	
	@Column(name = "COST")
	private Double cost;
	
	@Column(name = "DEPARTACTUALIZED")
	private String departActualized;
	
	@Column(name = "DEPARTDRAFTAFT")
	private Double departDraftAft;
	
	@Column(name = "DEPARTDRAFTFORE")
	private Double departDraftFore;
	
	@Column(name = "DEPARTFW")
	private Double departFw;
	
	@Column(name = "DEPARTSLOPS")
	private Double departSlops;
	
	@Transient
	private String departUtc;
	
	@Column(name = "DEPARTUTC")
	private LocalDateTime depart_Utc;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	@Column(name = "DISTANCEECA")
	private Double distanceEca;
	
	@Column(name = "DISTANCEECAPERCENT")
	private Double distanceEcaPercent;
	
	@Column(name = "DISTANCENONECA")
	private Double distanceNonEca;
	
	@Column(name = "DISTANCETOTAL")
	private Double distanceTotal;
	
	@Column(name = "FIXTUREPORTLINKTOKEN")
	private String fixturePortLinkToken;
	
	@Column(name = "HEATINGRATIO")
	private Double heatingRatio;
	
	@Column(name = "ISBUNKERING")
	private String isBunkering;
	
	@Column(name = "ISTCODELIVERY")
	private String isTCODelivery;
	
	@Column(name = "ISTCOREDELIVERY")
	private String isTCORedelivery;
	
	@Column(name = "PASSAGEDAYS")
	private Double passageDays;
	
	@Column(name = "PORTID")
	private Integer portId;
	
	@Column(name ="PORTNAME")
	private String portName;
	
	@Column(name = "PORTREGULATION")
	private String portRegulation;
	
	@Column(name = "PORTSHORTNAME")
	private String portShortName;
	
	@Column(name = "PORTTIMEZONE")
	private Double portTimeZone;
	
	@Column(name = "SPEED")
	private Double speed;
	
	@Column(name = "TIMEZONEARRIVE")
	private Double  timeZoneArrive;
	
	@Column(name = "TIMEZONEDEPART")
	private Double timeZoneDepart;
	
	@Column(name = "TOTALPORTDAYS")
	private Double totalPortDays;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "WX")
	private Double wx;

	@Column(name = "VOYAGELEGID")
	private String voyageLegId;
	
	@OneToMany(mappedBy = "voyObjLegBunkerStem",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_LegLst_BunStem.class)
	private List<Q88_VoyObj_LegLst_BunStem> bunkerStemsList = new  ArrayList<Q88_VoyObj_LegLst_BunStem>();

	@OneToMany(mappedBy = "voyObjLegBunkerRob",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_LegLst_BunRob.class)
	private List<Q88_VoyObj_LegLst_BunRob> bunkerROBList  = new  ArrayList<Q88_VoyObj_LegLst_BunRob>();
	

	
	 @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	  })
	 private Q88_VoyObj voyObjLegLst;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVoyageId() {
		return voyageId;
	}

	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}

	

	public Integer getLeg_SeqId() {
		return leg_SeqId;
	}

	public void setLeg_SeqId(Integer leg_SeqId) {
		this.leg_SeqId = leg_SeqId;
	}

	public String getArriveActualized() {
		return arriveActualized;
	}

	public void setArriveActualized(String arriveActualized) {
		this.arriveActualized = arriveActualized;
	}

	public Double getArriveDraftFore() {
		return arriveDraftFore;
	}

	public void setArriveDraftFore(Double arriveDraftFore) {
		this.arriveDraftFore = arriveDraftFore;
	}

	public Double getArriveDraftAft() {
		return arriveDraftAft;
	}

	public void setArriveDraftAft(Double arriveDraftAft) {
		this.arriveDraftAft = arriveDraftAft;
	}

	public Double getArriveFw() {
		return arriveFw;
	}

	public void setArriveFw(Double arriveFw) {
		this.arriveFw = arriveFw;
	}

	public Double getArriveSlops() {
		return arriveSlops;
	}

	public void setArriveSlops(Double arriveSlops) {
		this.arriveSlops = arriveSlops;
	}

	public String getArriveUtc() {
		return arriveUtc;
	}

	public void setArriveUtc(String arriveUtc) {
		this.arriveUtc = arriveUtc;
	}

	public LocalDateTime getArrive_Utc() {
		return arrive_Utc;
	}

	public void setArrive_Utc(String arrive_Utc) {
		if(arrive_Utc !=null) {
		this.arrive_Utc = LocalDateTime.parse(arrive_Utc);
		}
		else
		{
			this.arrive_Utc=null;
		}
	}

	public Double getAwaitingLaycanDays() {
		return awaitingLaycanDays;
	}

	public void setAwaitingLaycanDays(Double awaitingLaycanDays) {
		this.awaitingLaycanDays = awaitingLaycanDays;
	}

	public Double getCleaningDay() {
		return cleaningDay;
	}

	public void setCleaningDay(Double cleaningDay) {
		this.cleaningDay = cleaningDay;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getDepartActualized() {
		return departActualized;
	}

	public void setDepartActualized(String departActualized) {
		this.departActualized = departActualized;
	}

	public Double getDepartDraftAft() {
		return departDraftAft;
	}

	public void setDepartDraftAft(Double departDraftAft) {
		this.departDraftAft = departDraftAft;
	}

	public Double getDepartDraftFore() {
		return departDraftFore;
	}

	public void setDepartDraftFore(Double departDraftFore) {
		this.departDraftFore = departDraftFore;
	}

	public Double getDepartFw() {
		return departFw;
	}

	public void setDepartFw(Double departFw) {
		this.departFw = departFw;
	}

	public Double getDepartSlops() {
		return departSlops;
	}

	public void setDepartSlops(Double departSlops) {
		this.departSlops = departSlops;
	}

	public String getDepartUtc() {
		return departUtc;
	}

	public void setDepartUtc(String departUtc) {
		this.departUtc = departUtc;
	}

	public LocalDateTime getDepart_Utc() {
		return depart_Utc;
	}

	public void setDepart_Utc(String depart_Utc) {
		if(depart_Utc != null) {
		this.depart_Utc = LocalDateTime.parse(depart_Utc);
		}
		else {
			this.depart_Utc =null;
		}
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Double getDistanceEca() {
		return distanceEca;
	}

	public void setDistanceEca(Double distanceEca) {
		this.distanceEca = distanceEca;
	}

	public Double getDistanceEcaPercent() {
		return distanceEcaPercent;
	}

	public void setDistanceEcaPercent(Double distanceEcaPercent) {
		this.distanceEcaPercent = distanceEcaPercent;
	}

	public Double getDistanceNonEca() {
		return distanceNonEca;
	}

	public void setDistanceNonEca(Double distanceNonEca) {
		this.distanceNonEca = distanceNonEca;
	}

	public Double getDistanceTotal() {
		return distanceTotal;
	}

	public void setDistanceTotal(Double distanceTotal) {
		this.distanceTotal = distanceTotal;
	}

	public String getFixturePortLinkToken() {
		return fixturePortLinkToken;
	}

	public void setFixturePortLinkToken(String fixturePortLinkToken) {
		this.fixturePortLinkToken = fixturePortLinkToken;
	}

	public Double getHeatingRatio() {
		return heatingRatio;
	}

	public void setHeatingRatio(Double heatingRatio) {
		this.heatingRatio = heatingRatio;
	}

	public String getIsBunkering() {
		return isBunkering;
	}

	public void setIsBunkering(String isBunkering) {
		this.isBunkering = isBunkering;
	}

	public String getIsTCODelivery() {
		return isTCODelivery;
	}

	public void setIsTCODelivery(String isTCODelivery) {
		this.isTCODelivery = isTCODelivery;
	}

	public String getIsTCORedelivery() {
		return isTCORedelivery;
	}

	public void setIsTCORedelivery(String isTCORedelivery) {
		this.isTCORedelivery = isTCORedelivery;
	}

	public Double getPassageDays() {
		return passageDays;
	}

	public void setPassageDays(Double passageDays) {
		this.passageDays = passageDays;
	}

	public Integer getPortId() {
		return portId;
	}

	public void setPortId(Integer portId) {
		this.portId = portId;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public String getPortRegulation() {
		return portRegulation;
	}

	public void setPortRegulation(String portRegulation) {
		this.portRegulation = portRegulation;
	}

	public String getPortShortName() {
		return portShortName;
	}

	public void setPortShortName(String portShortName) {
		this.portShortName = portShortName;
	}

	public Double getPortTimeZone() {
		return portTimeZone;
	}

	public void setPortTimeZone(Double portTimeZone) {
		this.portTimeZone = portTimeZone;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Double getTimeZoneArrive() {
		return timeZoneArrive;
	}

	public void setTimeZoneArrive(Double timeZoneArrive) {
		this.timeZoneArrive = timeZoneArrive;
	}

	public Double getTimeZoneDepart() {
		return timeZoneDepart;
	}

	public void setTimeZoneDepart(Double timeZoneDepart) {
		this.timeZoneDepart = timeZoneDepart;
	}

	public Double getTotalPortDays() {
		return totalPortDays;
	}

	public void setTotalPortDays(Double totalPortDays) {
		this.totalPortDays = totalPortDays;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getWx() {
		return wx;
	}

	public void setWx(Double wx) {
		this.wx = wx;
	}

	public String getVoyageLegId() {
		return voyageLegId;
	}

	public void setVoyageLegId(String voyageLegId) {
		this.voyageLegId = voyageLegId;
	}

	public Q88_VoyObj getVoyObjLegLst() {
		return voyObjLegLst;
	}

	public void setVoyObjLegLst(Q88_VoyObj voyObjLegLst) {
		this.voyObjLegLst = voyObjLegLst;
	}

	
	public List<Q88_VoyObj_LegLst_BunStem> getBunkerStemsList() {
		return bunkerStemsList;
	}

	public void addBunkerStemsList(List<Q88_VoyObj_LegLst_BunStem> bunkerStemsList) {
		this.bunkerStemsList = bunkerStemsList;
	}

	public void setArrive_Utc(LocalDateTime arrive_Utc) {
		this.arrive_Utc = arrive_Utc;
	}

	public void setDepart_Utc(LocalDateTime depart_Utc) {
		this.depart_Utc = depart_Utc;
	}
	
	

	public List<Q88_VoyObj_LegLst_BunRob> getBunkerROBList() {
		return bunkerROBList;
	}

	public void addBunkerROBList(List<Q88_VoyObj_LegLst_BunRob> bunkerROBList) {
		this.bunkerROBList = bunkerROBList;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_LegLst [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", leg_SeqId=" + leg_SeqId
				+ ", arriveActualized=" + arriveActualized + ", arriveDraftFore=" + arriveDraftFore
				+ ", arriveDraftAft=" + arriveDraftAft + ", arriveFw=" + arriveFw + ", arriveSlops=" + arriveSlops
				+ ", arriveUtc=" + arriveUtc + ", arrive_Utc=" + arrive_Utc + ", awaitingLaycanDays="
				+ awaitingLaycanDays + ", cleaningDay=" + cleaningDay + ", cost=" + cost + ", departActualized="
				+ departActualized + ", departDraftAft=" + departDraftAft + ", departDraftFore=" + departDraftFore
				+ ", departFw=" + departFw + ", departSlops=" + departSlops + ", departUtc=" + departUtc
				+ ", depart_Utc=" + depart_Utc + ", displayOrder=" + displayOrder + ", distanceEca=" + distanceEca
				+ ", distanceEcaPercent=" + distanceEcaPercent + ", distanceNonEca=" + distanceNonEca
				+ ", distanceTotal=" + distanceTotal + ", fixturePortLinkToken=" + fixturePortLinkToken
				+ ", heatingRatio=" + heatingRatio + ", isBunkering=" + isBunkering + ", isTCODelivery=" + isTCODelivery
				+ ", isTCORedelivery=" + isTCORedelivery + ", passageDays=" + passageDays + ", portId=" + portId
				+ ", portName=" + portName + ", portRegulation=" + portRegulation + ", portShortName=" + portShortName
				+ ", portTimeZone=" + portTimeZone + ", speed=" + speed + ", timeZoneArrive=" + timeZoneArrive
				+ ", timeZoneDepart=" + timeZoneDepart + ", totalPortDays=" + totalPortDays + ", type=" + type + ", wx="
				+ wx + ", voyageLegId=" + voyageLegId + ", bunkerStemsList=" + bunkerStemsList + ", bunkerROBList="
				+ bunkerROBList + "]";
	}


	
	 
	 
}

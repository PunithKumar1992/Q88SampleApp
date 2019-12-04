/*
  package com.bsol.q88.model;
  
  import java.io.Serializable; import java.util.ArrayList; import
  java.util.List;
  
  import javax.persistence.CascadeType; import javax.persistence.Column; import
  javax.persistence.Entity; import javax.persistence.FetchType; import
  javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
  import javax.persistence.Id; import javax.persistence.JoinColumn; import
  javax.persistence.JoinColumns; import javax.persistence.ManyToOne; import
  javax.persistence.OneToMany; import javax.persistence.Table;
 
  
  @Entity
  
  @Table(name = "Q88_LEG",schema = "CHOPS_WEB")
  public class Q88_Leg implements  Serializable {
  
  private static final long serialVersionUID = 1L;
  
  @Id
  
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  
  @Column(name = "LEGSEQ_ID") 
  private Integer legseq_id;
  
  @Column(name = "ARRIVEACTUALIZED") 
  private String arriveActualized;
  
  @Column(name = "ARRIVEDRAFTFORE") 
  private Number arriveDraftFore;
  
  @Column(name = "ARRIVEDRAFTAFT") 
  private Number arriveDraftAft;
  
  @Column(name = "ARRIVEFW") 
  private Number arriveFw;
  
  @Column(name = "ARRIVESLOPS") 
  private Number arriveSlops;
  
  @Column(name = "ARRIVEUTC")
  private String arriveUtc;
  
  @Column(name = "AWAITINGLAYCANDAYS") 
  private Number awaitingLaycanDays;
  
  @Column(name = "CLEANINGDAY") 
  private Number cleaningDay;
  
  @Column(name = "COST") 
  private Number cost;
  
  @Column(name = "DEPARTACTUALIZED") 
  private String departActualized;
  
  @Column(name = "DEPARTDRAFTAFT") 
  private Number departDraftAft;
  
  @Column(name = "DEPARTDRAFTFORE") 
  private Number departDraftFore ;
  
  @Column(name = "DEPARTFW") 
  private Number departFw;
  
  @Column(name = "DEPARTSLOPS") 
  private Number departSlops;
  
  @Column(name = "DEPARTUTC") 
  private String departUtc;
  
  @Column(name = "DISPLAYORDER") 
  private Integer displayOrder;
  
  @Column(name = "DISTANCEECA") 
  private Number distanceEca;
  
  @Column(name = "DISTANCEECAPERCENT") 
  private Number distanceEcaPercent;
  
  @Column(name = "DISTANCENONECA") 
  private Number distanceNonEca;
  
  @Column(name = "DISTANCETOTAL") 
  private Number distanceTotal;
  
  @Column(name = "FIXTUREPORTLINKTOKEN") 
  private String fixturePortLinkToken;
  
  @Column(name = "HEATINGRATIO") 
  private Number heatingRatio;
  
  @Column(name = "ISBUNKERING") 
  private String isBunkering;
  
  @OneToMany(targetEntity =Q88_BunkerStem.class,fetch = FetchType.LAZY,cascade  = CascadeType.ALL ,mappedBy ="q88bunkerleg",orphanRemoval = false) 
  private  List<Q88_BunkerStem> bunkerStemsList = new ArrayList<Q88_BunkerStem>();
  
  @Column(name = "ISTCODELIVERY") 
  private String isTCODelivery;
  
  @Column(name = "ISTCOREDELIVERY") 
  private String isTCORedelivery;
  
  @Column(name = "PASSAGEDAYS") 
  private Number passageDays;
  
  @Column(name = "PORTID") 
  private Integer portId;
  
  @Column(name = "PORTNAME") 
  private String portName;
  
  @Column(name = "PORTREGULATION") 
  private String portRegulation;
  
  @Column(name = "PORTSHORTNAME") 
  private String portShortName;
  
  @Column(name = "PORTTIMEZONE") 
  private Number portTimeZone;
  
  @Column(name = "SPEED") 
  private Number speed;
  
  @Column(name = "TIMEZONEARRIVE") 
  private Number timeZoneArrive;
  
  @Column(name = "TIMEZONEDEPART") 
  private Number timeZoneDepart;
  
  @Column(name = "TOTALPORTDAYS") 
  private Number totalPortDays;
  
  @Column(name = "TYPE") 
  private String type;
  
  @Column(name = "wx") 
  private Number wx;
  
  @Column(name = "VOYAGELEGID") 
  private String voyageLegId;
  
  @OneToMany(targetEntity =Q88_BunkerRob.class,fetch =FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy ="q88bunkerrobleg",orphanRemoval = false) 
  private List<Q88_BunkerRob> bunkerROBList = new ArrayList<Q88_BunkerRob>();
  
  @Column(name = "VOYAGEID") 
  private String voyageid;
  
   @Column(name = "VESSELID") 
   private String vesselid;
  
   @Column(name = "VOYAGE_TRANS_ID")
   private Integer voyage_Trans_Id;
  
  @ManyToOne(optional = false,fetch = FetchType.LAZY)
  @JoinColumns({
  @JoinColumn(name="voyageid",referencedColumnName ="VOYAGEID",insertable=false, updatable=false),
  @JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false),
  @JoinColumn(name="voyage_Trans_Id",nullable = false,referencedColumnName ="VOYAGE_TRANS_ID",insertable=false, updatable=false)
  }) 
  private Q88_Voyage  q88voyageleg;

public Integer getLegseq_id() {
	return legseq_id;
}

public void setLegseq_id(Integer legseq_id) {
	this.legseq_id = legseq_id;
}

public String getArriveActualized() {
	return arriveActualized;
}

public void setArriveActualized(String arriveActualized) {
	this.arriveActualized = arriveActualized;
}

public Number getArriveDraftFore() {
	return arriveDraftFore;
}

public void setArriveDraftFore(Number arriveDraftFore) {
	this.arriveDraftFore = arriveDraftFore;
}

public Number getArriveDraftAft() {
	return arriveDraftAft;
}

public void setArriveDraftAft(Number arriveDraftAft) {
	this.arriveDraftAft = arriveDraftAft;
}

public Number getArriveFw() {
	return arriveFw;
}

public void setArriveFw(Number arriveFw) {
	this.arriveFw = arriveFw;
}

public Number getArriveSlops() {
	return arriveSlops;
}

public void setArriveSlops(Number arriveSlops) {
	this.arriveSlops = arriveSlops;
}

public String getArriveUtc() {
	return arriveUtc;
}

public void setArriveUtc(String arriveUtc) {
	this.arriveUtc = arriveUtc;
}

public Number getAwaitingLaycanDays() {
	return awaitingLaycanDays;
}

public void setAwaitingLaycanDays(Number awaitingLaycanDays) {
	this.awaitingLaycanDays = awaitingLaycanDays;
}

public Number getCleaningDay() {
	return cleaningDay;
}

public void setCleaningDay(Number cleaningDay) {
	this.cleaningDay = cleaningDay;
}

public Number getCost() {
	return cost;
}

public void setCost(Number cost) {
	this.cost = cost;
}

public String getDepartActualized() {
	return departActualized;
}

public void setDepartActualized(String departActualized) {
	this.departActualized = departActualized;
}

public Number getDepartDraftAft() {
	return departDraftAft;
}

public void setDepartDraftAft(Number departDraftAft) {
	this.departDraftAft = departDraftAft;
}

public Number getDepartDraftFore() {
	return departDraftFore;
}

public void setDepartDraftFore(Number departDraftFore) {
	this.departDraftFore = departDraftFore;
}

public Number getDepartFw() {
	return departFw;
}

public void setDepartFw(Number departFw) {
	this.departFw = departFw;
}

public Number getDepartSlops() {
	return departSlops;
}

public void setDepartSlops(Number departSlops) {
	this.departSlops = departSlops;
}

public String getDepartUtc() {
	return departUtc;
}

public void setDepartUtc(String departUtc) {
	this.departUtc = departUtc;
}

public Integer getDisplayOrder() {
	return displayOrder;
}

public void setDisplayOrder(Integer displayOrder) {
	this.displayOrder = displayOrder;
}

public Number getDistanceEca() {
	return distanceEca;
}

public void setDistanceEca(Number distanceEca) {
	this.distanceEca = distanceEca;
}

public Number getDistanceEcaPercent() {
	return distanceEcaPercent;
}

public void setDistanceEcaPercent(Number distanceEcaPercent) {
	this.distanceEcaPercent = distanceEcaPercent;
}

public Number getDistanceNonEca() {
	return distanceNonEca;
}

public void setDistanceNonEca(Number distanceNonEca) {
	this.distanceNonEca = distanceNonEca;
}

public Number getDistanceTotal() {
	return distanceTotal;
}

public void setDistanceTotal(Number distanceTotal) {
	this.distanceTotal = distanceTotal;
}

public String getFixturePortLinkToken() {
	return fixturePortLinkToken;
}

public void setFixturePortLinkToken(String fixturePortLinkToken) {
	this.fixturePortLinkToken = fixturePortLinkToken;
}

public Number getHeatingRatio() {
	return heatingRatio;
}

public void setHeatingRatio(Number heatingRatio) {
	this.heatingRatio = heatingRatio;
}

public String getIsBunkering() {
	return isBunkering;
}

public void setIsBunkering(String isBunkering) {
	this.isBunkering = isBunkering;
}

public List<Q88_BunkerStem> getBunkerStemsList() {
	return bunkerStemsList;
}

public void setBunkerStemsList(List<Q88_BunkerStem> bunkerStemsList) {
	this.bunkerStemsList = bunkerStemsList;
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

public Number getPassageDays() {
	return passageDays;
}

public void setPassageDays(Number passageDays) {
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

public Number getPortTimeZone() {
	return portTimeZone;
}

public void setPortTimeZone(Number portTimeZone) {
	this.portTimeZone = portTimeZone;
}

public Number getSpeed() {
	return speed;
}

public void setSpeed(Number speed) {
	this.speed = speed;
}

public Number getTimeZoneArrive() {
	return timeZoneArrive;
}

public void setTimeZoneArrive(Number timeZoneArrive) {
	this.timeZoneArrive = timeZoneArrive;
}

public Number getTimeZoneDepart() {
	return timeZoneDepart;
}

public void setTimeZoneDepart(Number timeZoneDepart) {
	this.timeZoneDepart = timeZoneDepart;
}

public Number getTotalPortDays() {
	return totalPortDays;
}

public void setTotalPortDays(Number totalPortDays) {
	this.totalPortDays = totalPortDays;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Number getWx() {
	return wx;
}

public void setWx(Number wx) {
	this.wx = wx;
}

public String getVoyageLegId() {
	return voyageLegId;
}

public void setVoyageLegId(String voyageLegId) {
	this.voyageLegId = voyageLegId;
}

public List<Q88_BunkerRob> getBunkerROBList() {
	return bunkerROBList;
}

public void setBunkerROBList(List<Q88_BunkerRob> bunkerROBList) {
	this.bunkerROBList = bunkerROBList;
}

public String getVoyageid() {
	return voyageid;
}

public void setVoyageid(String voyageid) {
	this.voyageid = voyageid;
}

public String getVesselid() {
	return vesselid;
}

public void setVesselid(String vesselid) {
	this.vesselid = vesselid;
}

public Integer getVoyage_Trans_Id() {
	return voyage_Trans_Id;
}

public void setVoyage_Trans_Id(Integer voyage_Trans_Id) {
	this.voyage_Trans_Id = voyage_Trans_Id;
}

public Q88_Voyage getQ88voyageleg() {
	return q88voyageleg;
}

public void setQ88voyageleg(Q88_Voyage q88voyageleg) {
	this.q88voyageleg = q88voyageleg;
}

@Override
public String toString() {
	return "Q88_Leg [legseq_id=" + legseq_id + ", arriveActualized=" + arriveActualized + ", arriveDraftFore="
			+ arriveDraftFore + ", arriveDraftAft=" + arriveDraftAft + ", arriveFw=" + arriveFw + ", arriveSlops="
			+ arriveSlops + ", arriveUtc=" + arriveUtc + ", awaitingLaycanDays=" + awaitingLaycanDays + ", cleaningDay="
			+ cleaningDay + ", cost=" + cost + ", departActualized=" + departActualized + ", departDraftAft="
			+ departDraftAft + ", departDraftFore=" + departDraftFore + ", departFw=" + departFw + ", departSlops="
			+ departSlops + ", departUtc=" + departUtc + ", displayOrder=" + displayOrder + ", distanceEca="
			+ distanceEca + ", distanceEcaPercent=" + distanceEcaPercent + ", distanceNonEca=" + distanceNonEca
			+ ", distanceTotal=" + distanceTotal + ", fixturePortLinkToken=" + fixturePortLinkToken + ", heatingRatio="
			+ heatingRatio + ", isBunkering=" + isBunkering + ", bunkerStemsList=" + bunkerStemsList
			+ ", isTCODelivery=" + isTCODelivery + ", isTCORedelivery=" + isTCORedelivery + ", passageDays="
			+ passageDays + ", portId=" + portId + ", portName=" + portName + ", portRegulation=" + portRegulation
			+ ", portShortName=" + portShortName + ", portTimeZone=" + portTimeZone + ", speed=" + speed
			+ ", timeZoneArrive=" + timeZoneArrive + ", timeZoneDepart=" + timeZoneDepart + ", totalPortDays="
			+ totalPortDays + ", type=" + type + ", wx=" + wx + ", voyageLegId=" + voyageLegId + ", bunkerROBList="
			+ bunkerROBList + ", voyageid=" + voyageid + ", vesselid=" + vesselid + ", voyage_Trans_Id="
			+ voyage_Trans_Id + "]";
}


  }
 */
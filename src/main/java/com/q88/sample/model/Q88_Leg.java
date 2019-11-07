package com.q88.sample.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_LEG")
public class Q88_Leg {
	
	@Column(name = "LEGSEQ_ID")
	private int legseq_id;
	@Column(name = "ARRIVEACTUALIZED")
	private String arriveactualized;
	@Column(name = "ARRIVEDRAFTFORE")
	private int arrivedraftfore;			
	@Column(name = "ARRIVEDRAFTAFT")
	private int arrivedraftaft;		
	@Column(name = "ARRIVEFW")
	private int arrivefw;	
	@Column(name = "ARRIVESLOPS")
	private int arriveslops;
	@Column(name = "ARRIVEUTC")
	private String arriveutc;
	@Column(name = "AWAITINGLAYCANDAYS")
	private int	awaitinglaycandays;	
	@Column(name = "CLEANINGDAY")
	private int cleaningday;
	@Column(name = "COST")
	private int	cost;	
	@Column(name = "DEPARTACTUALIZED")
	private String departactualized;
	@Column(name = "DEPARTDRAFTAFT")
	private int departdraftaft;	
	@Column(name = "DEPARTDRAFTFORE")
	private int departdraftfore	;
	@Column(name = "DEPARTFW")
	private int departfw;	
	@Column(name = "DEPARTSLOPS")
	private int departslops;	
	@Column(name = "DEPARTUTC")
	private String departutc;
	@Column(name = "DISPLAYORDER")
	private int displayorder;	
	@Column(name = "DISTANCEECA")
	private int distanceeca;	
	@Column(name = "DISTANCEECAPERCENT")
	private int distanceecapercent;	
	@Column(name = "DISTANCENONECA")
	private int distancenoneca;		
	@Column(name = "DISTANCETOTAL")
	private int distancetotal;		
	@Column(name = "FIXTUREPORTLINKTOKEN")
	private String fixtureportlinktoken;
	@Column(name = "HEATINGRATIO")
	private int heatingratio;
	@Column(name = "ISBUNKERING")
	private String isbunkering;		
	@Column(name = "ISTCODELIVERY")
	private String istcodelivery;
	@Column(name = "ISTCOREDELIVERY")
	private String istcoredelivery;	
	@Column(name = "PASSAGEDAYS")
	private int passagedays;
	@Column(name = "PORTID")
	private int portid;
	@Column(name = "PORTNAME")
	private String portname;	
	@Column(name = "PORTREGULATION")
	private String portregulation;	
	@Column(name = "PORTSHORTNAME")
	private String portshortname;
	@Column(name = "PORTTIMEZONE")
	private int PORTTIMEZONE;	
	@Column(name = "SPEED")
	private int speed;		
	@Column(name = "TIMEZONEARRIVE")
	private int timezonearrive;	
	@Column(name = "TIMEZONEDEPART")
	private int timezonedepart;	
	@Column(name = "TOTALPORTDAYS")
	private int totalportdays;	
	@Column(name = "TYPE")
	private String type;
	@Column(name = "wx")
	private int wx;
	@Column(name = "VOYAGELEGID")
	private String voyagelegid;	
	@Column(name = "VOYAGEID")
	private String voyageid;	
	@Column(name = "VOYAGENUMBER")
	private String voyagenumber;
	@Column(name = "VESSELID")
	private String vesselid;	
	
	@OneToMany(mappedBy ="q88bunkerleg")
	private List<Q88_BunkerStem> bunkerStemsList = new ArrayList<Q88_BunkerStem>();
	
	@OneToMany(mappedBy ="q88bunkerrobleg")
	private List<Q88_BunkerRob> bunkerROBList = new ArrayList<Q88_BunkerRob>();
	
	@ManyToOne
	@JoinColumn(name="voyageid",insertable=false, updatable=false)
	@JoinColumn(name="voyagenumber",insertable=false, updatable=false)
	@JoinColumn(name="vesselid",insertable=false, updatable=false)
	private Q88_Voyage q88voyageleg;





	
	

	
	

	
}

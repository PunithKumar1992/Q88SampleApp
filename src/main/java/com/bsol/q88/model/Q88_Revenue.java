/*
 * package com.bsol.q88.model;
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.JoinColumns; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "Q88_REVENUE",schema = "CHOPS_WEB") public class Q88_Revenue
 * implements Serializable{
 * 
 * private static final long serialVersionUID = 1L;
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.SEQUENCE)
 * 
 * @Column(name = "REVENUE_SEQID") private Integer revenue_seqid;
 * 
 * @Column(name = "ACCRUAL") private Number accrual;
 * 
 * @Column(name = "DISPLAYORDER") private Integer displayOrder;
 * 
 * @Column(name = "FIXTUREDISPLAYORDER") private Integer fixtureDisplayOrder;
 * 
 * @Column(name = "FLATRATE") private Number flatRate;
 * 
 * @Column(name = "ISCOMMISSION") private String isCommission;
 * 
 * @Column(name = "NAME") private String name;
 * 
 * @Column(name = "QUANTITY") private Number quantity;
 * 
 * @Column(name = "REMARK") private String remark;
 * 
 * @Column(name = "TOTAL") private Number total;
 * 
 * @Column(name = "TOTALACCRUED") private Number totalAccrued;
 * 
 * @Column(name = "WS") private Number ws;
 * 
 * @Column(name = "VOYAGEID") private String voyageid;
 * 
 * @Column(name = "VESSELID") private String vesselid;
 * 
 * @ManyToOne(optional = false,fetch = FetchType.LAZY)
 * 
 * @JoinColumns({
 * 
 * @JoinColumn(name="voyageid",referencedColumnName ="VOYAGEID"
 * ,insertable=false, updatable=false),
 * 
 * @JoinColumn(name="vesselid",referencedColumnName =
 * "VESSELID",insertable=false, updatable=false) }) private Q88_Voyage
 * q88voyagerevenue;
 * 
 * public Integer getRevenue_seqid() { return revenue_seqid; }
 * 
 * public void setRevenue_seqid(Integer revenue_seqid) { this.revenue_seqid =
 * revenue_seqid; }
 * 
 * public Number getAccrual() { return accrual; }
 * 
 * public void setAccrual(Number accrual) { this.accrual = accrual; }
 * 
 * public Integer getDisplayOrder() { return displayOrder; }
 * 
 * public void setDisplayOrder(Integer displayOrder) { this.displayOrder =
 * displayOrder; }
 * 
 * public Integer getFixtureDisplayOrder() { return fixtureDisplayOrder; }
 * 
 * public void setFixtureDisplayOrder(Integer fixtureDisplayOrder) {
 * this.fixtureDisplayOrder = fixtureDisplayOrder; }
 * 
 * public Number getFlatRate() { return flatRate; }
 * 
 * public void setFlatRate(Number flatRate) { this.flatRate = flatRate; }
 * 
 * public String getIsCommission() { return isCommission; }
 * 
 * public void setIsCommission(String isCommission) { this.isCommission =
 * isCommission; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public Number getQuantity() { return quantity; }
 * 
 * public void setQuantity(Number quantity) { this.quantity = quantity; }
 * 
 * public String getRemark() { return remark; }
 * 
 * public void setRemark(String remark) { this.remark = remark; }
 * 
 * public Number getTotal() { return total; }
 * 
 * public void setTotal(Number total) { this.total = total; }
 * 
 * public Number getTotalAccrued() { return totalAccrued; }
 * 
 * public void setTotalAccrued(Number totalAccrued) { this.totalAccrued =
 * totalAccrued; }
 * 
 * public Number getWs() { return ws; }
 * 
 * public void setWs(Number ws) { this.ws = ws; }
 * 
 * public String getVoyageid() { return voyageid; }
 * 
 * public void setVoyageid(String voyageid) { this.voyageid = voyageid; }
 * 
 * 
 * 
 * public String getVesselid() { return vesselid; }
 * 
 * public void setVesselid(String vesselid) { this.vesselid = vesselid; }
 * 
 * public Q88_Voyage getQ88voyagerevenue() { return q88voyagerevenue; }
 * 
 * public void setQ88voyagerevenue(Q88_Voyage q88voyagerevenue) {
 * this.q88voyagerevenue = q88voyagerevenue; }
 * 
 * @Override public String toString() { return "Q88_Revenue [revenue_seqid=" +
 * revenue_seqid + ", accrual=" + accrual + ", displayOrder=" + displayOrder +
 * ", fixtureDisplayOrder=" + fixtureDisplayOrder + ", flatRate=" + flatRate +
 * ", isCommission=" + isCommission + ", name=" + name + ", quantity=" +
 * quantity + ", remark=" + remark + ", total=" + total + ", totalAccrued=" +
 * totalAccrued + ", ws=" + ws + ", voyageid=" + voyageid + ", vesselid=" +
 * vesselid + ", q88voyagerevenue=" + q88voyagerevenue + "]"; }
 * 
 * 
 * 
 * }
 */
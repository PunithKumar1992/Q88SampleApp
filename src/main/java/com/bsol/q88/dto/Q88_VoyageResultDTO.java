package com.bsol.q88.dto;

public class Q88_VoyageResultDTO {
	
	private Double bunkers;
	private Double commission;
	private Double days;
	private Double efficiency;
	private Double expense;
	private Double expenses;
	private String modifiedByFull;
	private String modifiedDate;
	private Double pnl;
	private Double port;
	private Double revenue;
	private Double sailedIn;
	private Double tce;
	
	
	public Double getBunkers() {
		return bunkers;
	}
	public void setBunkers(Double bunkers) {
		this.bunkers = bunkers;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}
	public Double getDays() {
		return days;
	}
	public void setDays(Double days) {
		this.days = days;
	}
	public Double getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(Double efficiency) {
		this.efficiency = efficiency;
	}
	public Double getExpense() {
		return expense;
	}
	public void setExpense(Double expense) {
		this.expense = expense;
	}
	public Double getExpenses() {
		return expenses;
	}
	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}
	public String getModifiedByFull() {
		return modifiedByFull;
	}
	public void setModifiedByFull(String modifiedByFull) {
		this.modifiedByFull = modifiedByFull;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Double getPnl() {
		return pnl;
	}
	public void setPnl(Double pnl) {
		this.pnl = pnl;
	}
	public Double getPort() {
		return port;
	}
	public void setPort(Double port) {
		this.port = port;
	}
	public Double getRevenue() {
		return revenue;
	}
	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}
	public Double getSailedIn() {
		return sailedIn;
	}
	public void setSailedIn(Double sailedIn) {
		this.sailedIn = sailedIn;
	}
	public Double getTce() {
		return tce;
	}
	public void setTce(Double tce) {
		this.tce = tce;
	}
	@Override
	public String toString() {
		return "Q88_VoyageResultDTO [bunkers=" + bunkers + ", commission=" + commission + ", days=" + days
				+ ", efficiency=" + efficiency + ", expense=" + expense + ", expenses=" + expenses + ", modifiedByFull="
				+ modifiedByFull + ", modifiedDate=" + modifiedDate + ", pnl=" + pnl + ", port=" + port + ", revenue="
				+ revenue + ", sailedIn=" + sailedIn + ", tce=" + tce + "]";
	}
	
	

}

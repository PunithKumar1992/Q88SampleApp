package com.q88.sample.model;

import java.sql.Timestamp;

public class Review {
	
	private String reviewStatus;
	
	private String reviewedBy;
	
	private Timestamp reviewDate;
	
	public String getReviewStatus() {
		return reviewStatus;
	}
	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	public String getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}
	public Timestamp getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Timestamp reviewDate) {
		this.reviewDate = reviewDate;
	}
	@Override
	public String toString() {
		return "Review [reviewStatus=" + reviewStatus + ", reviewedBy=" + reviewedBy + ", reviewDate=" + reviewDate
				+ "]";
	}
	
	

}

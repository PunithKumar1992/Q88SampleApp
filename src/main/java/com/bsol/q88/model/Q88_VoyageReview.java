package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_VOYAGE_REVIEW",schema = "CHOPS_WEB")
public class Q88_VoyageReview implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
			@Id
			@GeneratedValue(strategy=GenerationType.SEQUENCE)
			@Column(name = "VOYAGEREVIEW_SEQID")	
			private Integer  voyagereview_seqid;
			@Column(name = "REVIEWSTATUS")
			private String reviewStatus;
			@Column(name = "REVIEWEDBY")
		    private String reviewedBy;
			@Column(name = "REVIEWDATE")
		    private String reviewDate;
			@Column(name = "VOYAGEID")
		    private String voyageid;
			@Column(name = "VESSELID")
		    private String vesselid;		

			@OneToOne(optional = false,fetch = FetchType.LAZY)
			@JoinColumns({
				@JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
				@JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false)
			})
			private Q88_Voyage q88voyagereview;

			public Integer getVoyagereview_seqid() {
				return voyagereview_seqid;
			}

			public void setVoyagereview_seqid(Integer voyagereview_seqid) {
				this.voyagereview_seqid = voyagereview_seqid;
			}

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

			public String getReviewDate() {
				return reviewDate;
			}

			public void setReviewDate(String reviewDate) {
				this.reviewDate = reviewDate;
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

			public Q88_Voyage getQ88voyagereview() {
				return q88voyagereview;
			}

			public void setQ88voyagereview(Q88_Voyage q88voyagereview) {
				this.q88voyagereview = q88voyagereview;
			}

			@Override
			public String toString() {
				return "Q88_VoyageReview [voyagereview_seqid=" + voyagereview_seqid + ", reviewStatus=" + reviewStatus
						+ ", reviewedBy=" + reviewedBy + ", reviewDate=" + reviewDate + ", voyageid=" + voyageid
					    + ", vesselid=" + vesselid + ", q88voyagereview="
						+ q88voyagereview + "]";
			}

			
			

}

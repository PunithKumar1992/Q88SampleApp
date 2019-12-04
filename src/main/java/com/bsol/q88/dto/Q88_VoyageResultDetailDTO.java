package com.bsol.q88.dto;

public class Q88_VoyageResultDetailDTO {
	
	private String classificationName;
	private Double classificationTotal;
	public String getClassificationName() {
		return classificationName;
	}
	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}
	public Double getClassificationTotal() {
		return classificationTotal;
	}
	public void setClassificationTotal(Double classificationTotal) {
		this.classificationTotal = classificationTotal;
	}
	@Override
	public String toString() {
		return "Q88_VoyageResultDetailDTO [classificationName=" + classificationName + ", classificationTotal="
				+ classificationTotal + "]";
	}
	
	
	
	

}

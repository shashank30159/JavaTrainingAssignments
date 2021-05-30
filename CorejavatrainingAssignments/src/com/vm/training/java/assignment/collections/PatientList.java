package com.vm.training.java.assignment.collections;

public class PatientList {
	private int patientId;
	private String patientName;
	private int patientAge;
	public PatientList(int patientId, String patientName, int patientAge) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	@Override
	public String toString() {
		return "PatientList [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ "]";
	}
	
	

}

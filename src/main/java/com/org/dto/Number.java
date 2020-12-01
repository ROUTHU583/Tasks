package com.org.dto;


import java.util.List;
import java.util.UUID;

public class Number {
	private UUID id;
	private int goal;
	private int step;
	private List<Integer> result;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Integer> getResult() {
		return result;
	}
	public void setResult(List<Integer> result) {
		this.result = result;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	
}


package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Growth {
	@Id
	private int id;
	private String type;
	private int Day1;
	private int Day5;
	private int Day10;
	private int Day15;
	private int yield_percentage;
	public Growth(int id, String type, int day1, int day5, int day10, int day15, int yield_percentage) {
		super();
		this.id = id;
		this.type = type;
		Day1 = day1;
		Day5 = day5;
		Day10 = day10;
		Day15 = day15;
		this.yield_percentage = yield_percentage;
	}
	public Growth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDay1() {
		return Day1;
	}
	public void setDay1(int day1) {
		Day1 = day1;
	}
	public int getDay5() {
		return Day5;
	}
	public void setDay5(int day5) {
		Day5 = day5;
	}
	public int getDay10() {
		return Day10;
	}
	public void setDay10(int day10) {
		Day10 = day10;
	}
	public int getDay15() {
		return Day15;
	}
	public void setDay15(int day15) {
		Day15 = day15;
	}
	public int getYield_percentage() {
		return yield_percentage;
	}
	public void setYield_percentage(int yield_percentage) {
		this.yield_percentage = yield_percentage;
	}
	
}

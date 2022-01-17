package com.example.demo;

import org.springframework.stereotype.Component;

@Component("org")
public class Organisation {
	private String name;
	private int id;
	private int turnnover;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTurnnover() {
		return turnnover;
	}
	public void setTurnnover(int turnnover) {
		this.turnnover = turnnover;
	}
	
	public void details() {
		System.out.println("Wipro");
	}

}

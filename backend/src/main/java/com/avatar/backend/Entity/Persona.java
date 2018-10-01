package com.avatar.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;	
	
	public Persona(Long id) {
		this.id = id;
	}		
	
	@Column(name = "name",nullable = false)
    private String name;

	@Column(name = "height",nullable = false)
    private int height;
	
	@Column(name = "mass",nullable = false)
    private int mass;
	
	@Column(name = "hair_color",nullable = false)
    private String hair_color;
	
	@Column(name = "gender",nullable = false)
    private String gender;
	
	@Column(name = "planet",nullable = false)
    private String planet;

	public Persona(Long id, String name, int height, int mass, String hair_color, String gender, String planet) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hair_color = hair_color;
		this.gender = gender;
		this.planet = planet;
	}
	
	public Persona(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}
	
}

package com.pradeep.CricketerData.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cricketer")
@Setter
@Getter
public class Cricketer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer cid;
	String name;
	Integer centuries;
	String country;
	Integer StrikeRate;

}

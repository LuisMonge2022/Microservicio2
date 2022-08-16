package com.idat.Microservicio2.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name="Colegio")
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Colegio implements Serializable{

	
	private static final long serialVersionUID = 4729157701678950197L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idColegio;		
	private String nombreColegio;
	private String direccionColegio;	
	private String local;
	

}

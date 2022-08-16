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

@Table(name="Aula")
@Entity
@AllArgsConstructor
@Getter
@Setter
public class Aula implements Serializable {

	
	private static final long serialVersionUID = 2362133349904065783L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlumno;		
	private String nombre;
	private String direccion;		
	
	
	

}

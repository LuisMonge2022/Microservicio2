package com.idat.Microservicio2.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="Alumno")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alumno implements Serializable{

	
	private static final long serialVersionUID = -5090701511111533395L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlumno;		
	private String nombreAlumno;
	private String direccionAlumno;	
	private Integer edad;

}

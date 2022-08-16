package com.idat.Microservicio2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlumnoDTORequest {
	
	private Integer idAlumnoDTO;		
	private String nombreAlumnoDTO;
	private String direccionAlumnoDTO;	
	private Integer edadDTO;
	

}

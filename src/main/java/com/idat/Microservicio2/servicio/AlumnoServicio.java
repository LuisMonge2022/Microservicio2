package com.idat.Microservicio2.servicio;

import java.util.List;

import com.idat.Microservicio2.dto.AlumnoDTORequest;
import com.idat.Microservicio2.dto.AlumnoDTOResponse;


public interface AlumnoServicio {
	
	public void guardarAlumno(AlumnoDTORequest alumno);
	public void editarAlumno(AlumnoDTORequest alumno);
	
	public void eliminarAlumno(Integer id);
	
	public List<AlumnoDTOResponse> listarAlumno();
	public AlumnoDTOResponse obtenerAlumnoId(Integer id);

}

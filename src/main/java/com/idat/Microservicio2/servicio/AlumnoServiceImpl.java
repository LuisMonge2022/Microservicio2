package com.idat.Microservicio2.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Microservicio2.dto.AlumnoDTORequest;
import com.idat.Microservicio2.dto.AlumnoDTOResponse;
import com.idat.Microservicio2.modelo.Alumno;
import com.idat.Microservicio2.repositorio.AlumnoRepositorio;

@Service
public class AlumnoServiceImpl implements AlumnoServicio{
	
	@Autowired
	public AlumnoRepositorio repositorio;

	@Override
	public void guardarAlumno(AlumnoDTORequest alumno) {
		
		Alumno a= new Alumno();
		a.setIdAlumno(alumno.getIdAlumnoDTO());
		a.setNombreAlumno(alumno.getNombreAlumnoDTO());
		a.setDireccionAlumno(alumno.getDireccionAlumnoDTO());
		a.setEdad(alumno.getEdadDTO());		
		
		repositorio.save(a);
		
	}

	@Override
	public void editarAlumno(AlumnoDTORequest alumno) {
		
		Alumno a= new Alumno();
		a.setIdAlumno(alumno.getIdAlumnoDTO());
		a.setNombreAlumno(alumno.getNombreAlumnoDTO());
		a.setDireccionAlumno(alumno.getDireccionAlumnoDTO());
		a.setEdad(alumno.getEdadDTO());		
		
		repositorio.saveAndFlush(a);
		
	}

	@Override
	public void eliminarAlumno(Integer id) {
		
		repositorio.deleteById(id);
		
	}

	@Override
	public List<AlumnoDTOResponse> listarAlumno() {
		
		List<AlumnoDTOResponse> lista = new ArrayList<AlumnoDTOResponse>();
		AlumnoDTOResponse a=null;		
		
		for (Alumno alumno : repositorio.findAll()) {
			a=new AlumnoDTOResponse();
			
			a.setIdAlumnoDTO(alumno.getIdAlumno());
			a.setNombreAlumnoDTO(alumno.getNombreAlumno());
			a.setDireccionAlumnoDTO(alumno.getDireccionAlumno());
			a.setEdadDTO(alumno.getEdad());
			
			
			lista.add(a);			
		}			
		
		return lista;
		
		
	}

	@Override
	public AlumnoDTOResponse obtenerAlumnoId(Integer id) {
		
		Alumno alumno = repositorio.findById(id).orElse(null);
		
		AlumnoDTOResponse a= new AlumnoDTOResponse();
		
		a.setIdAlumnoDTO(alumno.getIdAlumno());
		a.setNombreAlumnoDTO(alumno.getNombreAlumno());
		a.setDireccionAlumnoDTO(alumno.getDireccionAlumno());
		a.setEdadDTO(alumno.getEdad());	
		
		
		return a;
	}

}

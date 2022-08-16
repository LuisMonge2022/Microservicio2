package com.idat.Microservicio2.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.Microservicio2.dto.AlumnoDTORequest;
import com.idat.Microservicio2.dto.AlumnoDTOResponse;
import com.idat.Microservicio2.servicio.AlumnoServicio;

@RestController
@RequestMapping("/alumno/v1")
public class AlumnoControlador {
	
	@Autowired
	private AlumnoServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<AlumnoDTOResponse>>  listarProducto(){
		
		return new ResponseEntity<List<AlumnoDTOResponse>>(servicio.listarAlumno(),HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody AlumnoDTORequest alumno){
		
		servicio.guardarAlumno(alumno);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}")
	public ResponseEntity<AlumnoDTOResponse> listarProId(@PathVariable Integer id){
		
		AlumnoDTOResponse p= servicio.obtenerAlumnoId(id);
		if(p !=null)
			return new ResponseEntity<AlumnoDTOResponse>(p,HttpStatus.OK);
		
		return new ResponseEntity<AlumnoDTOResponse>(HttpStatus.NOT_FOUND);		
		 
	}
	
	@RequestMapping(path = "/editar",method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody AlumnoDTORequest alumno){
		
		AlumnoDTOResponse a = servicio.obtenerAlumnoId(alumno.getIdAlumnoDTO());
		
		if(a !=null) {
			servicio.editarAlumno(alumno);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
	
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		AlumnoDTOResponse p= servicio.obtenerAlumnoId(id);
		if(p !=null) {
			servicio.eliminarAlumno(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);		
	
	}
	

}

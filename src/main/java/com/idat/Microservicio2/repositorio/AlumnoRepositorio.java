package com.idat.Microservicio2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Microservicio2.modelo.Alumno;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Integer>{

}

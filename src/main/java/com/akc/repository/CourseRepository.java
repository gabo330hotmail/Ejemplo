package com.akc.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akc.entity.Curso;

@Repository("courseJpaRepository")
public interface CourseRepository extends JpaRepository<Curso, Serializable>{
  
	/*public abstract Curso finByPrecio(int precio);
	public abstract Curso finByPriceAndNombre(int precio,String nombre);
	public abstract List<Curso> finByNombreOrderByHoras(String nombre);
	public abstract Curso finByNombreOrPrecio(String nombre,int precio);*/
}

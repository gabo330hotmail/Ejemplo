package com.akc.service;

import java.util.List;

import com.akc.entity.Curso;

public interface CursoService{

	public abstract List<Curso> listAllCurso();
	public abstract Curso agregar(Curso curso);
	public abstract int borrarCurso(int id);
	public abstract Curso modificar(Curso curso);
	
}

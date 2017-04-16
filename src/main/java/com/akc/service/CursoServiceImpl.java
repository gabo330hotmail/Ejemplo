package com.akc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.akc.entity.Curso;
import com.akc.repository.CourseRepository;

@Service("cursoServicioImp")
public class CursoServiceImpl implements CursoService {
	
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseRepository courseJpaRepository;

	@Override
	public List<Curso> listAllCurso() {
		
		return courseJpaRepository.findAll();
	}

	@Override
	public Curso agregar(Curso curso) {
		
		return courseJpaRepository.save(curso);
	}

	@Override
	public int borrarCurso(int id) {
		courseJpaRepository.delete(id);
		return 0;
	}

	@Override
	public Curso modificar(Curso curso) {
		
		return courseJpaRepository.save(curso);
	}

}

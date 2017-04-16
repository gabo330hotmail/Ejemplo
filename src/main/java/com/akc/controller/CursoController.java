package com.akc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akc.entity.Curso;
import com.akc.service.CursoServiceImpl;

@Controller
@RequestMapping("/curso")
public class CursoController {

	private static final String VIEW_CURSO="curso";
	private static final Log LOG=LogFactory.getLog(CursoController.class);
	
	
	@Autowired
	@Qualifier("cursoServicioImp")
	private CursoServiceImpl cursoServicioImp;
	
	@GetMapping("/ListarTodo")
	public ModelAndView ListarCurso(){
		//LOG.info("Cursos en BD: '"+cursoServicioImp.listAllCurso()+"'");
		ModelAndView mvn=new ModelAndView(VIEW_CURSO);
		mvn.addObject("cursos", new Curso());
		mvn.addObject("curso", cursoServicioImp.listAllCurso());
		return mvn;
		
	}
	
	@PostMapping("/Almacenar")
	public String AgregarCurso(@ModelAttribute("curso")Curso curso){
   // LOG.info("Curso Agregado: '"+curso.toString()+"'");
    cursoServicioImp.agregar(curso);	
	return "redirect:/curso/ListarTodo";
		
	}
	
	
}

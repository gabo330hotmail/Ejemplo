/**
 * 
 */
package com.akc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.akc.component.ExampleComponent;

/**
 * @author juan.ortega
 *
 */
@Controller
@RequestMapping("/prueba1")
public class ExampleController {


	
	
	private static final String EXAMPLE2_VIEW="prueba1";
	/**
	 * Formas para utilizar el metodo get enviando parametros
	 * @param name
	 * @return
	 */
	
	//localhost:8080/prueba1/request?nm=JUAN
	@GetMapping("/request")
	public ModelAndView request1(@RequestParam(name="nm")String name){
		ModelAndView me=new ModelAndView(EXAMPLE2_VIEW);
		me.addObject("nm_in_model", name);
		return me;	
	}
	
	//localhost:8080/prueba1/request/JUAN
	@GetMapping("/estado/{nm}")
	public ModelAndView estado(@PathVariable("nm")String name){
		ModelAndView mv=new ModelAndView(EXAMPLE2_VIEW);
		mv.addObject("nm_in_model", name);
		return mv;
		
	}
	
	
	
	
}

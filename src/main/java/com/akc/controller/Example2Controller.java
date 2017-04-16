/**
 * 
 */
package com.akc.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.akc.component.ExampleComponent;
import com.akc.model.Person;

/**
 * @author juan.ortega
 *
 */
@Controller
@RequestMapping("/prueba2")
public class Example2Controller {
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	/**
	 * LOGS en una aplicacion
	 */
 public static final Log LOGGER=LogFactory.getLog(Example2Controller.class);
	/**
	 * Formas de utilizar el metodo POST
	 */
	
	public static final String VISTA_VIEW="form";
	
	
	/**
	 * para redireccionar una pagina
	 * @param model
	 * @return
	 */
	
	@GetMapping("/")
	public RedirectView redirect(){
		
		String url="/prueba2/vistaGenerar";
		return new RedirectView(url);
		
	}
	
	
	@GetMapping("/vistaGenerar")
	public String vistaGenerar(Model model){
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG TRACE");
		exampleComponent.sayHello();
		model.addAttribute("person", new Person());
		
		return VISTA_VIEW;
		
	}
	
	
	/**
	 * @valid se usa para validar las condiciones de la clase
	 * se agrega el parametro BindingResult bindingResult el cual
	 * captura los errores que se pueda presentar
	 * @param person
	 * @param bindingResult
	 * @return
	 */
	@PostMapping("/addperson")
	public ModelAndView addperson(@Valid @ModelAttribute("person")Person person,BindingResult bindingResult){
		ModelAndView mv=new ModelAndView();
		if(bindingResult.hasErrors()){
			mv.setViewName(VISTA_VIEW);
		System.out.println("error");
		}else{
			mv.setViewName(VISTA_VIEW);
			mv.addObject("person", person);	
			LOGGER.info("METHOD: 'addperson' -- PARAMS: '"+person+"'");
		    LOGGER.info("TEMPLATES: '"+ VISTA_VIEW +"'--DATA: '"+person+"'");
		}
		
		return mv;
		
	}
	
	
}

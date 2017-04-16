/**
 * 
 */
package com.akc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akc.service.ExampleService;

/**
 * @author juan.ortega
 *
 */
@Controller
@RequestMapping("/vista")
public class HolaController {
	
	public static final String EXAMPLE_VIEW="example";
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	/**
	 * Formas de devolver listados a la plantilla o vista
	 * @param model
	 * @return
	 */
	@GetMapping("/prueba")
	public String helloWorld(Model model){
		//model.addAttribute("name", "Juan Ortega");
		//model.addAttribute("person", new Person("Juan Ortega", "34"));
		model.addAttribute("people", exampleService.getListPeople());
		return EXAMPLE_VIEW;
		
	}
	
	
	
	@GetMapping("/Vista")
	public ModelAndView helloWorldMAV(){
		//Se debe agegar la plantilla a devolver
		ModelAndView mv=new ModelAndView(EXAMPLE_VIEW);
		//mv.addObject("person", new Person("Gabriel Lopez","34"));
		mv.addObject("people", exampleService.getListPeople());
		return mv;
		
	}
	
/* esta en la implementacion
 * 	private ArrayList<Person> getPeople(){
		
		ArrayList<Person> people=new ArrayList<>();
		people.add(new Person("Juan","34"));
		people.add(new Person("Jorge","54"));
		people.add(new Person("Rene","49"));
		people.add(new Person("Edwim","26"));
		people.add(new Person("Herney","38"));
		people.add(new Person("Armando","47"));
		return people;

}
*/	
}

/**
 * 
 */
package com.akc.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * @author juan.ortega
 *
 */
@Component("exampleComponent")
public class ExampleComponent {
	private static final Log LOG=LogFactory.getLog(ExampleComponent.class);
	
	public void sayHello(){
		LOG.info("Ingrese por aqui");
	}

}

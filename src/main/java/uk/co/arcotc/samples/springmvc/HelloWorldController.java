package uk.co.arcotc.samples.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	public static final String CONTROLLER_MAPPING = "/hello/{name}";
	
	@RequestMapping(value=CONTROLLER_MAPPING, method=RequestMethod.GET)
	public ModelAndView HelloWorld(@PathVariable("name") String name) {
		ModelAndView modelAndView = null;
		
		modelAndView = new ModelAndView("say-hello");
		
		modelAndView.addObject("name", name);
		
		return modelAndView;
	}
	
	@RequestMapping(value=CONTROLLER_MAPPING, method=RequestMethod.POST)
	public ModelAndView postNotAvailable() {
		return new ModelAndView("errors/illegal-operation");
	}
}

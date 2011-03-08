package uk.co.arcotc.samples.springmvc;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldJsonController {
	public static final String CONTROLLER_MAPPING = "/json/hello/{name}";
	
	@RequestMapping(value=CONTROLLER_MAPPING, method=RequestMethod.GET)
	public ModelAndView HelloWorld(@PathVariable("name") String name) {
		ModelAndView modelAndView = null;
		
		Map<String, String> response = new TreeMap<String, String>();
		response.put("intro", "hello");
		response.put("name", name);
		
		modelAndView = new ModelAndView("jsonView", "response", response);
		
		return modelAndView;
	}
	
	@RequestMapping(value=CONTROLLER_MAPPING, method=RequestMethod.POST)
	public ModelAndView postNotAvailable() {
		return new ModelAndView("errors/illegal-operation");
	}
}

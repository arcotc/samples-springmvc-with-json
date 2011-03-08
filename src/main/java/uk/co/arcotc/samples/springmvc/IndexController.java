package uk.co.arcotc.samples.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	public static final String CONTROLLER_MAPPING = "/";
	
	@RequestMapping(value=CONTROLLER_MAPPING, method=RequestMethod.GET)
	public ModelAndView Index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value=CONTROLLER_MAPPING, method=RequestMethod.POST)
	public ModelAndView postNotAvailable() {
		return new ModelAndView("errors/illegal-operation");
	}
}

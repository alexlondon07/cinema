package alexlondon07.github.io.app.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goHome() {
		return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goMain(Model model) {
		
		List<String> movies = new LinkedList<>();
		movies.add("Rapidos y furiosos");
		movies.add("El aro 2");
		movies.add("Aliens");
		movies.add("La purga");
		
		model.addAttribute("movies", movies);
		
		return "home";
	}
	
	@RequestMapping(value="/detail")
	public String showDetail(Model model) {
		String title = "Rapidos y furiosos";
		int duration = 136;
		double price = 50;
		
		model.addAttribute("title", title);
		model.addAttribute("duration", duration);
		model.addAttribute("price", price);
		
		return "detail";
		
	}

}

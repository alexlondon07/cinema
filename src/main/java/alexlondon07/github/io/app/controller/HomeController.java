package alexlondon07.github.io.app.controller;

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

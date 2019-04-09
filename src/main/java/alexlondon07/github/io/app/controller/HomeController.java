package alexlondon07.github.io.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import alexlondon07.github.io.app.model.Movie;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goHome() {
		return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showMain(Model model) {
		
		/*List<String> movies = new LinkedList<>();
		movies.add("Rapidos y furiosos");
		movies.add("El aro 2");
		movies.add("Aliens");
		movies.add("La purga");*/
		
		List<Movie> movies = getList();
		model.addAttribute("movies", movies);
		return "home";
	}
	
	/**
	 * Metodo para obtener un listado de peliculas
	 * @return List<Movie>
	 * @throws ParseException 
	 */
	private List<Movie> getList() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		List<Movie> list = null;
		
		try {
			list = new LinkedList<>();
			
			Movie movie1 = new Movie();
			movie1.setId(1);
			movie1.setTitle("Power Ranger");
			movie1.setDuration(120);
			movie1.setGender("Action");
			movie1.setClassification("B");
			movie1.setReleaseDate( format.parse("02-02-2017") ); 
			movie1.setImage("power_ranger.jpg");
			
			Movie movie2 = new Movie();
			movie2.setId(2);
			movie2.setTitle("La purga");
			movie2.setDuration(145);
			movie2.setGender("Action");
			movie2.setClassification("B");
			movie2.setReleaseDate( format.parse("02-02-2019") ); 
			movie2.setImage("la_purga.jpg");
			
			Movie movie3 = new Movie();
			movie3.setId(3);
			movie3.setTitle("Contra tiempo");
			movie3.setDuration(150);
			movie3.setGender("Action");
			movie3.setClassification("B");
			movie3.setReleaseDate( format.parse("02-02-2018") ); 
			movie3.setImage("contratiempo.jpg");
			movie3.setStatus("Inactive");
			
			list.add(movie1);
			list.add(movie2);
			list.add(movie3);
			return list;
			
		} catch (ParseException e) {
			System.out.println("Error:: "+ e.getMessage());
			return null;
		}
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

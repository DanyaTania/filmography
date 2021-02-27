package testgroup.filmography.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.filmography.model.Film;
import testgroup.filmography.service.FilmService;
import testgroup.filmography.service.FilmServiceImpl;

import java.util.List;

@Controller
public class FilmController {
	private static Film film;
	private FilmService filmService = new FilmServiceImpl();


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView allFilms() {
		List<Film> films = filmService.allFilms();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("films");
		modelAndView.addObject("filmsList", films);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)

	public ModelAndView editPage(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("editPage");
		modelAndView.addObject("film", film);
		modelAndView.addObject("film", filmService.getById(id));
		return modelAndView;
	}
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editFilm(@ModelAttribute("film") Film film) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/");
		filmService.edit(film);
		return modelAndView;
	}
}


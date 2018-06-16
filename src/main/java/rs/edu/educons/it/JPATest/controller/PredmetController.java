package rs.edu.educons.it.JPATest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.edu.educons.it.JPATest.entity.Predmet;
import rs.edu.educons.it.JPATest.service.PredmetService;

@RestController
@RequestMapping("/api")
public class PredmetController {
	
	@Autowired
	private PredmetService pServis;
	
	@RequestMapping(value = "/predmet/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		pServis.delete(id);

	}
	
	@RequestMapping(value= "/predmet/{id}", method = RequestMethod.GET)
	public Optional<Predmet> find(@PathVariable Integer id) {
		
		return pServis.find(id);
	}
	
	@RequestMapping(value= "/predmet", method = RequestMethod.GET)
	public List<Predmet> getAll() {
		
		return pServis.findAll();
	}
	

}

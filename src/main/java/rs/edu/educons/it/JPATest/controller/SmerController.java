package rs.edu.educons.it.JPATest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.edu.educons.it.JPATest.entity.Smer;
import rs.edu.educons.it.JPATest.service.SmerService;

@RestController
@RequestMapping("/api")
public class SmerController {

	@Autowired
	private SmerService smerService;

	@RequestMapping(value = "/smer", method = RequestMethod.GET)
	public List<Smer> getAllSmerovi() {

		return smerService.findAll();
	}

	@RequestMapping(value = "/smer/{id}", method = RequestMethod.GET)
	public Optional<Smer> getSmer(@PathVariable Integer id) {

		return smerService.find(id);
	}
	
	@RequestMapping(value = "/smer", method = RequestMethod.POST)
	public void addSmer(@RequestBody Smer smer) {

		smerService.addSmer(smer);
	}
	
	@RequestMapping(value = "/smer/{id}", method = RequestMethod.PUT)
	public void updateSmer(@RequestBody Smer smer) {

		smerService.update(smer);
	}

	@RequestMapping(value = "/smer/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		smerService.delete(id);

	}

}

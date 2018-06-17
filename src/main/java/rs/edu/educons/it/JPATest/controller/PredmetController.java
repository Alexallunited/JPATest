package rs.edu.educons.it.JPATest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.edu.educons.it.JPATest.entity.Predmet;
import rs.edu.educons.it.JPATest.entity.Smer;
import rs.edu.educons.it.JPATest.service.PredmetService;

@RestController
@RequestMapping("/api")
public class PredmetController {

	@Autowired
	private PredmetService predmetService;

	@RequestMapping(value = "/smer/{smerId}/predmet/{predmetId}", method = RequestMethod.GET)
	public Optional<Predmet> getPredmet(@PathVariable Integer predmetId) {
		return predmetService.find(predmetId);
	}

	@RequestMapping(value = "/smer/{smerId}/predmet", method = RequestMethod.GET)
	public List<Predmet> getAllPredmeti(@PathVariable Integer smerId) {
		return predmetService.findAll(smerId);
	}
	
	@RequestMapping(value = "/smer/{smerId}/predmet", method = RequestMethod.POST)
	public void addPredmet(@RequestBody Predmet predmet, @PathVariable Integer smerId) {
		predmet.setSmer(new Smer(smerId, "", ""));
		predmetService.addPredmet(predmet);
	}
	
	@RequestMapping(value = "/smer/{smerId}/predmet/{predmetId}", method = RequestMethod.PUT)
	public void updateSmer(@RequestBody Predmet predmet, @PathVariable Integer smerId, @PathVariable Integer predmetId) {
		predmet.setSmer(new Smer(smerId, "", ""));
		predmetService.update(predmet);
	}

	@RequestMapping(value = "/smer/{smerId}/predmet/{predmetId}", method = RequestMethod.DELETE)
	public void deletePredmet(@PathVariable Integer predmetId) {
		predmetService.delete(predmetId);
	}

}

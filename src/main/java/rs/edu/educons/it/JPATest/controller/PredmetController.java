package rs.edu.educons.it.JPATest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rs.edu.educons.it.JPATest.service.PredmetService;

@RestController
@RequestMapping("/api")
public class PredmetController {
	
	@Autowired
	private PredmetService pServis;
	
	@RequestMapping("/predmet/{id}")
	public void delete(@PathVariable long id) {
		
		pServis.delete(id);
		
		
	}
	

}

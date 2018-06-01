package rs.edu.educons.it.JPATest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.edu.educons.it.JPATest.entity.Predmet;
import rs.edu.educons.it.JPATest.repository.PredmetRepository;

@Service
public class PredmetService {
	
	@Autowired
	private PredmetRepository repo;
	
	
	public void add(Predmet p) {
		repo.save(p);
	}
	
	public void delete(long id) {
		
		repo.delete(id);
	}
	
	public Predmet find(long id) {
		
		return repo.findByID(id);
	}
	
	public void edit(Predmet p) {
		
		repo.save(p);
		
	}
	
	
	

}

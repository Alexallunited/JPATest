package rs.edu.educons.it.JPATest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	public void delete(Integer id) {
		
		repo.deleteById(id);
	}
	
	public Optional<Predmet> find(Integer id) {
		
		return repo.findById(id);
	}
	
	public void edit(Predmet p) {
		
		repo.save(p);
		
	}
	
	public List<Predmet> findAll() {
		
		List<Predmet> predmeti = new ArrayList<>();
		repo.findAll().forEach(predmeti::add);
		return predmeti;
	}
	
	
	

}

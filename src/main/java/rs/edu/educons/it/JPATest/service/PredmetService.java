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
	private PredmetRepository predmetRepo;
	
	
	public void addPredmet(Predmet p) {
		predmetRepo.save(p);
	}
	
	public void delete(Integer id) {
		
		predmetRepo.deleteById(id);
	}
	
	public Optional<Predmet> find(Integer id) {
		
		return predmetRepo.findById(id);
	}
	
	public void update(Predmet p) {
		
		predmetRepo.save(p);
		
	}
	
	public List<Predmet> findAll(Integer smerId) {
		
		List<Predmet> predmeti = new ArrayList<>();
		predmetRepo.findBySmerId(smerId).forEach(predmeti::add);
		return predmeti;
	}
	
	
	

}

package rs.edu.educons.it.JPATest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.edu.educons.it.JPATest.entity.Smer;
import rs.edu.educons.it.JPATest.repository.SmerRepository;

@Service
public class SmerService {

	@Autowired
	private SmerRepository smerRepo;

	public void addSmer(Smer s) {
		smerRepo.save(s);
	}

	public void delete(Integer id) {
		smerRepo.deleteById(id);
	}

	public Optional<Smer> find(Integer id) {
		return smerRepo.findById(id);
	}

	public void update(Smer s) {
		smerRepo.save(s);
	}

	public List<Smer> findAll() {
		List<Smer> smerovi = new ArrayList<>();
		smerRepo.findAll().forEach(smerovi::add);
		return smerovi;
	}

}

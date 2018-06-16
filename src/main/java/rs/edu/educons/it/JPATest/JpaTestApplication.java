package rs.edu.educons.it.JPATest;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rs.edu.educons.it.JPATest.entity.Predmet;
import rs.edu.educons.it.JPATest.repository.PredmetRepository;

@SpringBootApplication
public class JpaTestApplication implements CommandLineRunner{

	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PredmetRepository repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JpaTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Optional<Predmet> p=repo.findById(201);
		log.info("Predmet 20001L -> {}",p.toString());
		p=repo.findById(202);
		log.info("Predmet 20002L -> {}",p.toString());
		p=repo.findById(203);
		log.info("Predmet 20003L -> {}",p.toString());
		p=repo.findById(204);
		log.info("Predmet 20004L -> {}",p.toString());
		
		repo.deleteById(203);
		
	}
}

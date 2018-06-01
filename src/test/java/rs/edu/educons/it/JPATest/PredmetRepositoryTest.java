package rs.edu.educons.it.JPATest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import rs.edu.educons.it.JPATest.entity.Predmet;
import rs.edu.educons.it.JPATest.repository.PredmetRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PredmetRepositoryTest {

	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	PredmetRepository pr;
	
	@Test
	public void findByIDTest() {
		logger.info("Started ID Test");
		Predmet p=pr.findByID(20001);
		assertEquals("Ime1", p.getIme());
		assertEquals("Opi1", p.getOpis());
	}

}

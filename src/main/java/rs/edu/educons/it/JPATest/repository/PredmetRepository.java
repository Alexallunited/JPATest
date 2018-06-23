package rs.edu.educons.it.JPATest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import rs.edu.educons.it.JPATest.entity.Predmet;

@Repository
@Transactional
public interface PredmetRepository extends CrudRepository<Predmet, Integer> {

	public List<Predmet> findBySmerId(Integer smerId);

<<<<<<< HEAD
	@Autowired
	EntityManager eManager;

	public void delete(long id) {

		Predmet p = findByID(id);
		eManager.remove(p);

	}

	public void save(Predmet p) {

		if (findByID(p.getId()) == null) {

			eManager.persist(p);
		} else {

			eManager.merge(p);
		}

	}

	public Predmet findByID(long id) {

		return eManager.find(Predmet.class, id);

	}

=======
>>>>>>> master
}

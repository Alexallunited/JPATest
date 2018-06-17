package rs.edu.educons.it.JPATest.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import rs.edu.educons.it.JPATest.entity.Smer;

@Repository
@Transactional
public interface SmerRepository extends CrudRepository<Smer, Integer> {

}

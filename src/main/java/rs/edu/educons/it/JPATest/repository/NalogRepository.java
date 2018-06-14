package rs.edu.educons.it.JPATest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rs.edu.educons.it.JPATest.entity.Nalog;

import java.util.Optional;

public interface NalogRepository extends JpaRepository<Nalog, Long> {
	Optional<Nalog> findByUsername(String username);
}
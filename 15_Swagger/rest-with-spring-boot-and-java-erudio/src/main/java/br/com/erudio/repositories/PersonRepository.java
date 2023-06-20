package br.com.erudio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.model.Person;

//@Repository era utilizado antes no Spring Boot, agora não precisa
public interface PersonRepository extends JpaRepository<Person, Long>{

}

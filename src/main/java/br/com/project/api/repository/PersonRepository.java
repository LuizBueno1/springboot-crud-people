package br.com.project.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.api.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
    
    List<Person> findAll(); 

    Person findById(int id);

    List<Person> findByOrderByName();

    List<Person> findByNameOrderByAge(String name);

    List<Person> findByNameContaining(String word);

    List<Person> findByNameStartsWith(String word);

    List<Person> findByNameEndsWith(String word);

    @Query(value = "SELECT SUM(age) FROM people", nativeQuery = true)
    int sumAges();

    @Query(value = "SELECT * FROM people WHERE age >= :age", nativeQuery = true)
    List<Person> findByAgeGreaterOrEqual(int age);

    int countById(int id);

}

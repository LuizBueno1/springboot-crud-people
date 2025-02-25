package br.com.project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.api.model.Client;
import br.com.project.api.model.Person;
import br.com.project.api.repository.PersonRepository;
import br.com.project.api.service.PersonService;
import jakarta.validation.Valid;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private PersonService service;
    
    @PostMapping("/api")
    public ResponseEntity<?> register(@RequestBody Person person){
        return service.register(person);
    }

    @GetMapping("/api")
    public ResponseEntity<?> select(){
        return service.select();
    }

    @GetMapping("/api/{id}")
    public ResponseEntity<?> selectById(@PathVariable int id){
        return service.selectById(id);
    }

    @PutMapping("/api")
    public ResponseEntity<?> edit(@RequestBody Person person){
        return service.edit(person);
    }

    @DeleteMapping("/api/{id}")
    public ResponseEntity<?> remove(@PathVariable int id){
       return service.remove(id);
    }

    @GetMapping("/api/counter")
    public long counter(){
        return repository.count();
    }

    @GetMapping("/api/orderNames")
    public List<Person> orderNames(){
        return repository.findByOrderByName();
    }

    @GetMapping("/api/orderNames2")
    public List<Person> orderNames2(){
        return repository.findByNameOrderByAge("Paulo");
    }

    @GetMapping("/api/nameContain")
    public List<Person> nameContain(){
        return repository.findByNameContaining("l");
    }

    @GetMapping("/api/startsWith")
    public List<Person> startsWith(){
        return repository.findByNameStartsWith("p");
    }

    @GetMapping("/api/endsWith")
    public List<Person> endsWith(){
        return repository.findByNameEndsWith("s");
    }

    @GetMapping("/api/sumAges")
    public int sumAges(){
        return repository.sumAges();
    }

    @GetMapping("/api/findByAgeGreaterOrEqual")
    public List<Person> findByAgeGreaterOrEqual(){
        return repository.findByAgeGreaterOrEqual(44);
    }

    @GetMapping("")
    public String message(){
        return "Hello World!";
    }

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name){
        return "Welcome " + name;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }

    @PostMapping("/person")
    public Person person(@RequestBody Person person){
        return person;
    }

    @GetMapping("/status")
    public ResponseEntity<?> status(){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/client")
    public void client(@Valid @RequestBody Client client){
        
    }

}

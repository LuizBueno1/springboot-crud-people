package br.com.project.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.project.api.model.Message;
import br.com.project.api.model.Person;
import br.com.project.api.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private Message message;

    @Autowired
    private PersonRepository repository;

    //Register person
    public ResponseEntity<?> register(Person person) {

        if (person.getName().equals("")) {
            message.setMessage("Name needs to be filled in.");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        } else if (person.getAge() < 0) {
            message.setMessage("Please enter a valid age.");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(repository.save(person), HttpStatus.CREATED);
        }
    }

    //Select person
    public ResponseEntity<?> select(){
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    //Select person by id
    public ResponseEntity<?> selectById(int id){
        if(repository.countById(id) == 0){
            message.setMessage("No person was found.");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        } else{
            return new ResponseEntity<>(repository.findById(id), HttpStatus.OK);
        }
    }

    //Edit person
    public ResponseEntity<?> edit(Person person){

        if(repository.countById(person.getId()) == 0){
            message.setMessage("The code provided does not exist.");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else if(person.getName().equals("")){
            message.setMessage("A name is required.");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        } else if(person.getAge() < 0){
            message.setMessage("Please enter a valid age.");
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        } else{
            return new ResponseEntity<>(repository.save(person), HttpStatus.OK);
        }
    }

    //Remove person
    public ResponseEntity<?> remove(int id){
        if(repository.countById(id) == 0){
            message.setMessage("The code provided does not exist.");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else{
            Person person = repository.findById(id);
            repository.delete(person);
            message.setMessage("Person successfully removed.");

            return new ResponseEntity<>(message, HttpStatus.OK);
        }
    }
}

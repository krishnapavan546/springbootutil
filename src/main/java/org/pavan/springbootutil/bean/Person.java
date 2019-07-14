package org.pavan.springbootutil.bean;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy="person")
    private Set<Pet> pets;
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

        
    public Set<Pet> getPets() {
        return pets;
    }

}

@Entity
class Pet {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    public Pet() {
	}
    @ManyToOne
    @JoinColumn(nullable=false)
    private Person person;
    

    public String getOwnerName() {
        return person.getFirstName();
    }

    public String getName() {
        return name;
    }
}

class PersonNotFoundException extends RuntimeException {

}

    interface PetRepository extends CrudRepository<Pet,Long>
    {
    	
    }
    interface PersonRepository extends CrudRepository<Person,Long>
    {
    	
    }
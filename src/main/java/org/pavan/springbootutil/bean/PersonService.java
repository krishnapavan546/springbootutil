package org.pavan.springbootutil.bean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonService 
{

    @Autowired
    private PetRepository petRepository;
    @Autowired
    private PersonRepository personRepository;
    public void addPet(Long personId, String petName) {

        	 Pet entity=new Pet();
        	 petRepository.save(entity);
        }
	public List<Person> getPersons() {
		
		List<Person> personPets=new ArrayList<>();
		Iterable<Person> items=personRepository.findAll();
		
		Consumer<Person> action=new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				personPets.add(t);
			}
		};
		items.forEach(action);
	return personPets;
	}
}
package com.mindhub.app_practica2;

import com.mindhub.app_practica2.models.Person;
import com.mindhub.app_practica2.models.Pet;
import com.mindhub.app_practica2.models.manyTomany.Person1;
import com.mindhub.app_practica2.models.manyTomany.Pet1;
import com.mindhub.app_practica2.models.oneToone.Person2;
import com.mindhub.app_practica2.models.oneToone.Pet2;
import com.mindhub.app_practica2.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AppPractica2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppPractica2Application.class, args);
	}

	@Bean
	public CommandLineRunner initData(PersonRepository personRepository,
									  PetRepository petRepository,
									  Person1Repository person1Repository,
									  Pet1Repository pet1Repository,
									  Person2Repository person2Repository,
									  Pet2Repository pet2Repository){
		return args -> {

			Person person = new Person("Martin", "martin@mindhub.com");
			System.out.println(person);
			person.setTel(List.of("hola", "adios", "asfadsa"));

			personRepository.save(person);
			System.out.println(person);



			Pet pet = new Pet("firulais");

			person.addPet(pet);
			petRepository.save(pet);
			System.out.println(pet);

			Person person2 = personRepository.findById(1l).orElse(null);

			System.out.println(person2);

//			ManyToMany

			Person1 person1 = new Person1("Martin");
			Pet1 pet1 = new Pet1("Batman");
			person1Repository.save(person1);
			pet1Repository.save(pet1);
			person1.addPet(pet1);
			person1Repository.save(person1);
			pet1Repository.save(pet1);

//			OneToOne
			Person2 person21 = new Person2("Martin");
			Pet2 pet2 = new Pet2("Batman");
			person2Repository.save(person21);
			pet2Repository.save(pet2);
			person21.setPet2(pet2);
			pet2.setPerson2(person21);
			person2Repository.save(person21);
			pet2Repository.save(pet2);
		};
	}
}

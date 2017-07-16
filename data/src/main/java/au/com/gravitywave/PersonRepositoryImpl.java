package au.com.gravitywave;

import java.util.ArrayList;
import java.util.List;

import au.com.gravitywave.entities.Person;
import au.com.gravitywave.repositories.PersonRepository;

/**
 * Created by BollasG on 12/07/2017.
 */

public class PersonRepositoryImpl extends RepositoryBase implements PersonRepository {

    private final List<Person> people;
    public PersonRepositoryImpl() {
        people = new ArrayList<Person>() {{
            add(new Person(1,"John", "Smith","1 Smith street","john.smith@gmail.com","password"));
            add(new Person(2,"Jane", "Jones","1 Jones street","jane.jones@gmail.com","password"));
            add(new Person(3,"Imma", "Candle","1 Candle street","imma.candle@gmail.com","password"));
            add(new Person(4,"Sarah", "Connor","1 Connor street","sarah.connor@gmail.com","password"));
            add(new Person(5,"Mary", "Sward","1 Sward street","mary.sward@gmail.com","password"));
            add(new Person(6,"Sue", "Talent","1 Talent street","sue.talent@gmail.com","password"));
            add(new Person(7,"Sandra", "Dee","1 Dee street","sandra.dee@gmail.com","password"));
        }};


    }

    @Override
    public Person GetById(int personId) {

        for (Person p:people
             ) {
            if (p.getPersonId() == personId)
                return p;
        }
        return null;
    }

    @Override
    public Person GetByEmail(String email) {
        for (Person p:people
                ) {
            if (p.getEmail() == email)
                return p;
        }
        return null;
    }
}

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
            add(new Person(1,"John", "Smith","1 Smith street"));
            add(new Person(2,"Jane", "Jones","1 Jones street"));
            add(new Person(3,"Imma", "Candle","1 Candle street"));
            add(new Person(4,"Sarah", "Connor","1 Connor street"));
            add(new Person(5,"Mary", "Sward","1 Sward street"));
            add(new Person(6,"Sue", "Talent","1 Talent street"));
            add(new Person(7,"Sandra", "Dee","1 Dee street"));
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
}

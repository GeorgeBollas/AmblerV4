package au.com.gravitywave.repositories;

import au.com.gravitywave.entities.Person;

/**
 * Created by BollasG on 12/07/2017.
 */

public interface PersonRepository {

    Person GetById(int personId);
    Person GetByEmail(String email);
}

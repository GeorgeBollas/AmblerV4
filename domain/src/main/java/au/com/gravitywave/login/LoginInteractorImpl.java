package au.com.gravitywave.login;

import javax.inject.Inject;

import au.com.gravitywave.InteractorBase;
import au.com.gravitywave.entities.Person;
import au.com.gravitywave.repositories.PersonRepository;

/**
 * Created by BollasG on 12/07/2017.
 */

public class LoginInteractorImpl extends InteractorBase implements LoginInteractor {


    private PersonRepository personRepository;

    @Inject
    public LoginInteractorImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
//        DataComponent dc = Dagger_DataComponent.builder()
    }

    @Override
    public Person LoginWithCredentials(String email, String userPassword)
    {
        Person p = personRepository.GetByEmail(email);

        if (p != null){
            if (userPassword.equals(p.getPasswordHash())){
                return null; //// TODO: 14/07/2017 should this be an error
            }
        }
        return p;
    }

    @Override
    public Person LoginWithFingerPrint(String token) {
        return null;
    }
}

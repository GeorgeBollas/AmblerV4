package au.com.gravitywave;

import javax.inject.Singleton;

import au.com.gravitywave.login.LoginInteractor;
import au.com.gravitywave.login.LoginInteractorImpl;
import au.com.gravitywave.repositories.PersonRepository;
import dagger.Module;
import dagger.Provides;

/**
 * Created by georg on 16/07/2017.
 */


@Module
public class DomainModule {

    @Provides
    @Singleton
    public LoginInteractor provideLoginInteractor(PersonRepository personRepository){
        return new LoginInteractorImpl(personRepository);
    }
}

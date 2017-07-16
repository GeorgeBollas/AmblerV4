package au.com.gravitywave;

import javax.inject.Singleton;

import au.com.gravitywave.repositories.PersonRepository;
import dagger.Module;
import dagger.Provides;

/**
 * Created by georg on 14/07/2017.
 */

@Module
public class DataModule {

    @Provides @Singleton
    PersonRepository providesPersonRepositor(){
        return  new PersonRepositoryImpl();
    }
}

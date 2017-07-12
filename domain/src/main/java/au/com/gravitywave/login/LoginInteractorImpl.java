package au.com.gravitywave.login;

import au.com.gravitywave.InteractorBase;
import au.com.gravitywave.entities.Person;

/**
 * Created by BollasG on 12/07/2017.
 */

public class LoginInteractorImpl extends InteractorBase implements LoginInteractor {


    public LoginInteractorImpl() {
    }

    @Override
    public Person LoginWithCredentials(String userName, String userPassword) {
        return null;
    }

    @Override
    public Person LoginWithFingerPrint(String token) {
        return null;
    }
}

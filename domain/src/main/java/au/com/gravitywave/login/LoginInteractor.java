package au.com.gravitywave.login;

import au.com.gravitywave.entities.Person;

/**
 * Created by BollasG on 12/07/2017.
 */

public interface LoginInteractor {
    Person LoginWithCredentials(String userName, String userPassword);
    Person LoginWithFingerPrint(String token);
}

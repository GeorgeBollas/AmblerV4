package au.com.gravitywave.entities;

import java.util.Calendar;

/**
 * Created by georg on 11/07/2017.
 */

public class JourneyMessage extends EntityBase {
    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    private int journeyId;
    private int personId;
    private String message;
    private Calendar time;
}

package au.com.gravitywave.entities;

import java.util.Calendar;

/**
 * Created by georg on 11/07/2017.
 */

public class Journey extends EntityBase {

    private int journeyId;
    private int requesterPersonId;
    private Calendar proposedTime;
    private String message;

    private int walkBuddyPersonId;

    private String status;

    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public int getRequesterPersonId() {
        return requesterPersonId;
    }

    public void setRequesterPersonId(int requesterPersonId) {
        this.requesterPersonId = requesterPersonId;
    }

    public Calendar getProposedTime() {
        return proposedTime;
    }

    public void setProposedTime(Calendar proposedTime) {
        this.proposedTime = proposedTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getWalkBuddyPersonId() {
        return walkBuddyPersonId;
    }

    public void setWalkBuddyPersonId(int walkBuddyPersonId) {
        this.walkBuddyPersonId = walkBuddyPersonId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

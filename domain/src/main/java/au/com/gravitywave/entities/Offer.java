package au.com.gravitywave.entities;

import java.util.Calendar;

/**
 * Created by georg on 11/07/2017.
 */

public class Offer extends EntityBase {
    private int offerId;
    private int offerPersonId;
    private Calendar offerTime;

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public int getOfferPersonId() {
        return offerPersonId;
    }

    public void setOfferPersonId(int offerPersonId) {
        this.offerPersonId = offerPersonId;
    }

    public Calendar getOfferTime() {
        return offerTime;
    }

    public void setOfferTime(Calendar offerTime) {
        this.offerTime = offerTime;
    }
}

package org.animalsaid.demo.person;

import java.time.LocalDate;
import java.time.Period;

public class Donation {
    private long donationId;
    private Person person;
    private LocalDate donationDate; // in constructor later change to the date of payment (after having integrated this with paypal
    private LocalDate now;
    private Period period;
    private boolean isSuccess;

    public Donation() {
    }

    public Donation(long donationId, Person person, LocalDate donationDate, LocalDate now, Period period, boolean isSuccess) {
        this.donationId = donationId;
        this.person = person;
        this.donationDate = donationDate;
        this.now = LocalDate.now();
        this.period = period;
        this.isSuccess = isSuccess;
    }

    public long getDonationId() {
        return donationId;
    }

    public void setDonationId(long donationId) {
        this.donationId = donationId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(LocalDate timeOfDonation) {
        this.donationDate = timeOfDonation;
    }

    public LocalDate getNow() {
        return now;
    }

    public void setNow(LocalDate now) {
        this.now = LocalDate.now();
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void checkDonationDateAndSetPersonStatus(Person person, LocalDate now,LocalDate donationDate)
    {
        System.out.println("status is set to undefined...");
    }

}

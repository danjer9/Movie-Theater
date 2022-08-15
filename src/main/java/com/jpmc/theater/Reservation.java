package com.jpmc.theater;

public class Reservation {
    public final Showing showing;
    private final int audienceCount;

    public Reservation(Showing showing, int audienceCount) {
        this.showing = showing;
        this.audienceCount = audienceCount;
    }

    public double totalFee() {
        return showing.getMovieFee() * audienceCount;
    }
}

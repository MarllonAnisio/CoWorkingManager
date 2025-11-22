package model;

public abstract class Space {

    private long id;
    private String name;
    private boolean IsAvailable;
    private int capacity;
    private float pricePerHour;

    public abstract double calculateReservationPrice(double durationInHours, boolean includesProjector);
}

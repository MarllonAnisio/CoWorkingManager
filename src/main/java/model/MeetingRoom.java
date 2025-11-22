package model;

public class MeetingRoom extends Space{

    private boolean hasProjector;
    private float projectorfee;


    @Override
    public double calculateReservationPrice(double durationInHours, boolean includesProjector) {
        return 0;
    }
}

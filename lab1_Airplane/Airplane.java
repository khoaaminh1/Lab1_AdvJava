package lab1_Airplane;

import java.time.LocalTime;

public class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime scheduledDeparture;
    private int delayMinutes;

    // Constructor
    public Airplane(String flightNumber, String destination, LocalTime scheduledDeparture) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
        this.delayMinutes = 0;
    }

    // Getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getScheduledDeparture() {
        return scheduledDeparture;
    }

    // Setters
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setScheduledDeparture(LocalTime scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    // Delay a flight
    public void delay(int minutes) {
        this.delayMinutes += minutes;
        this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
    }

    // Check flight status
    public void checkStatus() {
        if (delayMinutes == 0) {
            System.out.println("Flight " + flightNumber + " to " + destination + " is on time.");
        } else {
            System.out.println("Flight " + flightNumber + " to " + destination
                               + " is delayed by " + delayMinutes + " minutes.");
        }
    }
}

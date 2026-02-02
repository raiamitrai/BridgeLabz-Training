package practice.interfacevsabstract.smartcity;

import java.time.LocalDateTime;
public class Passenger {
    private String passengerId;
    private String name;
    
    private LocalDateTime bookingTime;
    private double fareAmount;
    private boolean isPeakHour;
    
    public Passenger(String passengerId, String name, LocalDateTime bookingTime, 
                    double fareAmount, boolean isPeakHour) {
        this.passengerId = passengerId;
        this.name = name;
        
        this.bookingTime = bookingTime;
        this.fareAmount = fareAmount;
        this.isPeakHour = isPeakHour;
    }
    
    public String getPassengerId() {
        return passengerId;
    }
    
    public String getName() {
        return name;
    }
    
   
    
    public LocalDateTime getBookingTime() {
        return bookingTime;
    }
    
    public double getFareAmount() {
        return fareAmount;
    }
    
    public boolean isPeakHour() {
        return isPeakHour;
    }
    
}


package review.inventorymanagementsystem;

public class AlertServiceImpl implements AlertService {
    @Override
    public void sendAlert(String message) {
        System.out.println("alert: " + message);
    }


    
}

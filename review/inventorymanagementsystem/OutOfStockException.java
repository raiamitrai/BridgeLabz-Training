package review.inventorymanagementsystem;

public class OutOfStockException extends Exception{

    OutOfStockException(String message) throws OutOfStockException{
        super(message);
    }
}

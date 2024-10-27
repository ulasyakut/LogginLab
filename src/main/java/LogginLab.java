import java.util.logging.Level;
import java.util.logging.Logger;

public class LogginLab {
    //creating a logger object by using Logger method
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());
    //instance variable
    private Integer threshold = 0;
    //constructor initialized the variable threshold
    public LogginLab() {
        this.threshold = 0;
    }
    //main method
    public static void main(String[] args) {

        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.SEVERE, "Terrible Error!");
        logger.log(Level.WARNING, "Not So Bad Error!");

        logger.log(Level.INFO, "****\n\tAt ZipCode, \n\twe don't use System.out.Println \n\tuntil we've earned the right.\n****");

    }
    //method to get threshold
    public Integer getThreshold() {
        return threshold;
    }
    //method to set threshold
    //its type of void since it is not required to return anything
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }
    //boolean method to check if threshold is higher than limit
    public boolean thresholdExceeds(Integer limit) {
        if (this.threshold > limit) 
          return true;
        else
            return false;
    }
    public boolean thresholdReached(Integer limit) {

        if (limit < this.threshold)
            return true;
        else
            return false;
    }
    // Write a method called thresholdReached, returns true if argument 'limit' is over the threshold.
    // use thresholdExceeds for a pattern.
    // Write a test for the method in the Test class.
}

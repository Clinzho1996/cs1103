import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
    private volatile String currentTime;

    public Clock() {
        currentTime = dateFormat.format(new Date());
    }

    // Method to update the time continuously
    private void updateTime() {
        while (true) {
            currentTime = dateFormat.format(new Date());
            try {
                Thread.sleep(1000); // Sleep for 1 second before updating the time again
            } catch (InterruptedException e) {
                System.err.println("Time update thread interrupted: " + e.getMessage());
            }
        }
    }

    // Method to print the current time continuously
    private void printTime() {
        while (true) {
            System.out.println(currentTime);
            try {
                Thread.sleep(1000); // Sleep for 1 second before printing the time again
            } catch (InterruptedException e) {
                System.err.println("Time display thread interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();

        // Thread for updating the time
        Thread updateThread = new Thread(() -> clock.updateTime());
        updateThread.setPriority(Thread.MIN_PRIORITY); // Set to lower priority
        updateThread.start();

        // Thread for displaying the time
        Thread displayThread = new Thread(() -> clock.printTime());
        displayThread.setPriority(Thread.MAX_PRIORITY); // Set to higher priority
        displayThread.start();
    }
}

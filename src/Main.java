import java.time.Duration;
import java.time.Instant;



public class Main {
    public static void main(String[] args) {
        TimerThread timerThread = new TimerThread();
        timerThread.start();
    }
}
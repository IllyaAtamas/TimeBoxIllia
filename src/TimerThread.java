import java.time.Duration;
import java.time.Instant;
public class TimerThread extends Thread {
    @Override
    public void run() {
        Instant start = Instant.now();
        while (true) {
            Instant current = Instant.now();
            Duration duration = Duration.between(start, current);
            System.out.println("Пройшло " + duration.getSeconds() + " сек.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
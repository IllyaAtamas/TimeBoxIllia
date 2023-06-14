import java.time.Duration;
import java.time.Instant;
public class Main {
    public static void main(String[] args) {
        Thread timerThread = new Thread(() -> {
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
        });

        Thread messageThread = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Минуло 5 секунд");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        timerThread.start();
        messageThread.start();
    }
}
import java.util.Random;

public class Sensor {
    public Double getReading() {
        try {
            Thread.sleep(2000); // simulates sensor doing some work
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

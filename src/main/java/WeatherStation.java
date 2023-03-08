public class WeatherStation {

    public void read() {
        Sensor sensor = new Sensor();
        Reading reading = sensor.getReading();
        if (reading == null) {
            System.out.println("No reading in the last 5 minutes");
        } else {
            double value = reading.value();
            value = (value - 32) * 5 / 9;
            System.out.println("The current weather is " + value + "C.");
        }
    }
}

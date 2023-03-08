public class WeatherStation {

    public void checkTemperature() {
        Sensor sensor = new Sensor();
        Double value = sensor.getReading();
        if (value == null) {
            System.out.println("No reading in the last 5 minutes");
        } else {
            value = (value - 32) * 5 / 9;
            System.out.println("The current temperature is " + value + "C.");
        }
    }
}

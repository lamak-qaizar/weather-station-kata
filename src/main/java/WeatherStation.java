public class WeatherStation {

    public void checkTemperature() {
        Sensor sensor = new Sensor();
        System.out.println("Dear villagers. The current weather is...");
        Double value = sensor.getReading();
        if (value == null) {
            System.out.println("No reading! Please check back soon.");
        } else {
            value = (value - 32) * 5 / 9;
            System.out.println(value + " C");
        }
    }
}

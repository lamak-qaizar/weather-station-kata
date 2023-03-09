public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation station = new WeatherStation();
        while(true) {
            station.checkTemperature();
            Thread.sleep(3000);
        }
    }
}

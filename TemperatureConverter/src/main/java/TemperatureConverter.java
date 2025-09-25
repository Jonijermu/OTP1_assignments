public class TemperatureConverter {

    public static void main(String[] args) {
        // Example usage
        double fahrenheit = 100;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        double kelvin = 300;
        double celsiusFromKelvin = kelvinToCelsius(kelvin);
        System.out.println(kelvin + "K = " + celsiusFromKelvin + "°C");

        System.out.println("Is extreme temperature? " + isExtremeTemperature(celsius));
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
}

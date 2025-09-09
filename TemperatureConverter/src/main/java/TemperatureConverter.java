public class TemperatureConverter {

    public TemperatureConverter() {

    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        if (celsius < -40) {
            return true;

        } else if (celsius > 50) {
            return true;

        } else {
            return false;
        }

    }
}

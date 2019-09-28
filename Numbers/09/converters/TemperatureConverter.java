package converters;

public class TemperatureConverter {
    private final double FAHRENHEIT_TO_CELSIUS = -32;
    private final double KELVIN_TO_CELSIUS = -273.15;

    private double factor;

    public TemperatureConverter(String unit) {
        switch (unit) {
            case "*C":
                factor = 0;
                break;
            case "*F":
                factor = FAHRENHEIT_TO_CELSIUS;
                break;
            case "K":
                factor = KELVIN_TO_CELSIUS;
                break;
            default:
                System.out.println("Incorrect unit!");
                break;
        }
    }

    public double toCelsius(double measurement, String unit) {
        if (unit.equals("*F"))
            return (measurement + factor)*5/9;
        else
            return measurement + factor;
    }

    public double fromCelsius(double measurement, String unit) {
        if (unit.equals("*F"))
            return measurement*9/5 - factor;
        else
            return measurement - factor;
    }
}

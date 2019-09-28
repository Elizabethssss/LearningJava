package converters;

public class AreaConverter {
    private final double ARE_TO_SQMETER = 100;
    private final double HECTARE_TO_SQMETER = 10000;
    private final double SQCM_TO_SQMETER = 0.0001;
    private final double SQFOOT_TO_SQMETER = 0.09290304;
    private final double SQINCH_TO_SQMETER = 0.00064516;

    private double factor;

    public AreaConverter(String unit) {
        switch (unit) {
            case "m^2":
                factor = 1;
                break;
            case "in^2":
                factor = SQINCH_TO_SQMETER;
                break;
            case "ft^2":
                factor = SQFOOT_TO_SQMETER;
                break;
            case "cm^2":
                factor = SQCM_TO_SQMETER;
                break;
            case "ha":
                factor = HECTARE_TO_SQMETER;
                break;
            case "a":
                factor = ARE_TO_SQMETER;
                break;
            default:
                System.out.println("Incorrect unit!");
                break;
        }
    }

    public double toSqMeter(double measurement) {
        return measurement * factor;
    }

    public double fromSqMeters(double measurement) {
        return measurement / factor;
    }
}

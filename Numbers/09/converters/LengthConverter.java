package converters;

public class LengthConverter {
    private final double INCH_TO_METER = 0.0254;
    private final double FOOT_TO_METER = 0.3048;
    private final double YARD_TO_METER = 0.9144;
    private final double MILE_TO_METER = 1609.344;
    private final double MM_TO_METER = 0.001;
    private final double CM_TO_METER = 0.01;
    private final double KM_TO_METER = 1000;

    private double factor;

    public LengthConverter(String unit) {
        switch (unit) {
            case "m":
                factor = 1;
                break;
            case "in":
                factor = INCH_TO_METER;
                break;
            case "ft":
                factor = FOOT_TO_METER;
                break;
            case "yd":
                factor = YARD_TO_METER;
                break;
            case "mi":
                factor = MILE_TO_METER;
                break;
            case "mm":
                factor = MM_TO_METER;
                break;
            case "cm":
                factor = CM_TO_METER;
                break;
            case "km":
                factor = KM_TO_METER;
                break;
            default:
                System.out.println("Incorrect unit!");
                break;
        }
    }

    public double toMeter(double measurement) {
        return measurement * factor;
    }

    public double fromMeters(double measurement) {
        return measurement / factor;
    }
}

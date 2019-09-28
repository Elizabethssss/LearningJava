package converters;

public class VolumeConverter {
    private final double GALLON_TO_LITRE = 4.54609;
    private final double ML_TO_LITRE = 0.001;
    private final double CUBIC_CM_TO_LITRE = 0.001;
    private final double CUBIC_METRE_TO_LITRE = 1000;
    private final double CUBIC_INCH_TO_LITRE = 0.0163871;
    private final double CUBIC_FOOT_TO_LITRE = 28.316847;

    private double factor;

    public VolumeConverter(String unit) {
        switch (unit) {
            case "l":
                factor = 1;
                break;
            case "gal":
                factor = GALLON_TO_LITRE;
                break;
            case "ml":
                factor = ML_TO_LITRE;
                break;
            case "cm^3":
                factor = CUBIC_CM_TO_LITRE;
                break;
            case "m^3":
                factor = CUBIC_METRE_TO_LITRE;
                break;
            case "in^3":
                factor = CUBIC_INCH_TO_LITRE;
                break;
            case "ft^3":
                factor = CUBIC_FOOT_TO_LITRE;
                break;
            default:
                System.out.println("Incorrect unit!");
                break;
        }
    }

    public double toLitre(double measurement) {
        return measurement * factor;
    }

    public double fromLiters(double measurement) {
        return measurement / factor;
    }
}

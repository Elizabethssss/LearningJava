package converters;

public class MassConverter {
    private final double TON_TO_KG = 1000;
    private final double POUND_TO_KG = 0.4536;
    private final double OUNCE_TO_KG = 0.02835;
    private final double GRAM_TO_KG = 0.001;

    private double factor;

    public MassConverter(String unit) {
        switch (unit) {
            case "kg":
                factor = 1;
                break;
            case "t":
                factor = TON_TO_KG;
                break;
            case "lb":
                factor = POUND_TO_KG;
                break;
            case "oz":
                factor = OUNCE_TO_KG;
                break;
            case "g":
                factor = GRAM_TO_KG;
                break;
            default:
                System.out.println("Incorrect unit!");
                break;
        }
    }

    public double toKilogram(double measurement) {
        return measurement * factor;
    }

    public double fromKilograms(double measurement) {
        return measurement / factor;
    }
}

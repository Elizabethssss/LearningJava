package converters;

public class DataConverter {
    private final double BIT_TO_KB = 0.0001221;
    private final double BYTE_TO_KB = 0.000977;
    private final double MB_TO_KB = 1024;
    private final double GB_TO_KB = 1048576;
    private final double TB_TO_KB = 1073741824;

    private double factor;

    public DataConverter(String unit) {
        switch (unit) {
            case "KB":
                factor = 1;
                break;
            case "bit":
                factor = BIT_TO_KB;
                break;
            case "B":
                factor = BYTE_TO_KB;
                break;
            case "MB":
                factor = MB_TO_KB;
                break;
            case "GB":
                factor = GB_TO_KB;
                break;
            case "TB":
                factor = TB_TO_KB;
                break;
            default:
                System.out.println("Incorrect unit!");
                break;
        }
    }

    public double toKilobyte(double measurement) {
        return measurement * factor;
    }

    public double fromKilobytes(double measurement) {
        return measurement / factor;
    }
}

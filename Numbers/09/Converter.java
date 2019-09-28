import converters.*;

import java.util.Arrays;
import java.util.Scanner;

public class Converter {
    Scanner in = new Scanner(System.in);
    String fromUnit, toUnit;
    double val, standard, converted;
    String[] length = new String[] {"m", "in", "ft", "yd", "mi", "mm", "cm", "km"};
    String[] area = new String[] {"m^2", "in^2", "ft^2", "cm^2", "ha", "a"};
    String[] volume = new String[] {"l", "gal", "ml", "cm^3", "m^3", "in^3", "ft^3"};
    String[] mass = new String[] {"kg", "t", "lb", "oz", "g"};
    String[] temperature = new String[] {"*C", "*F", "K"};
    String[] data = new String[] {"KB", "bit", "B", "MB", "GB", "TB"};
    Converter(String category) {
        switch (category) {
            case "length":
                fromToValue(length);
                standard = new LengthConverter(fromUnit).toMeter(val);
                converted = new LengthConverter(toUnit).fromMeters(standard);
                break;
            case "area":
                fromToValue(area);
                standard = new AreaConverter(fromUnit).toSqMeter(val);
                converted = new AreaConverter(toUnit).fromSqMeters(standard);
                break;
            case "volume":
                fromToValue(volume);
                standard = new VolumeConverter(fromUnit).toLitre(val);
                converted = new VolumeConverter(toUnit).fromLiters(standard);
                break;
            case "mass":
                fromToValue(mass);
                standard = new MassConverter(fromUnit).toKilogram(val);
                converted = new MassConverter(toUnit).fromKilograms(standard);
                break;
            case "temperature":
                fromToValue(temperature);
                standard = new TemperatureConverter(fromUnit).toCelsius(val, fromUnit);
                converted = new TemperatureConverter(toUnit).fromCelsius(standard, toUnit);
                break;
            case "data":
                fromToValue(data);
                standard = new DataConverter(fromUnit).toKilobyte(val);
                converted = new DataConverter(toUnit).fromKilobytes(standard);
                break;
            default:
                System.out.println("Wrong category!");
                break;
        }
        System.out.println(val + " " + fromUnit + " = " + String.format( "%(.6f", converted) + " " + toUnit);
    }

    private void fromToValue(String[] units) {
        System.out.print("Convert from " + Arrays.toString(units) + ": ");
        fromUnit = in.nextLine();
        System.out.print("Convert to " +  Arrays.toString(units) + ": ");
        toUnit = in.nextLine();
        System.out.print("Enter value: ");
        val = in.nextDouble();
    }
}

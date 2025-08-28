package methods;

import java.util.*;

public class Celsius_to_Farhenheit {
    //using methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n", celsius, fahrenheit);
        sc.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
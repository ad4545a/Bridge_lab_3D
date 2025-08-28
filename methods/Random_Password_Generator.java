package methods;

import java.util.*;

public class Random_Password_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the password (minimum 8): ");
        int length = sc.nextInt();
        if (length < 8) {
            System.out.println("Password length should be at least 8 characters.");
        } else {
            String password = generatePassword(length);
            System.out.println("Generated Password: " + password);
        }
        sc.close();
    }

    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * characters.length());
            char randomChar = characters.charAt(index);
            password.append(randomChar);
        }
        return password.toString();
    }
}

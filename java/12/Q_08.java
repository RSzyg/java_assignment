import myclass.Kit;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        boolean isValid = false;
        String hex = "";
        int decimal = 0;
        while (!isValid) {
            try {
                System.out.print("Enter a hex number: ");
                hex = input.nextLine();
                decimal = hexToDecimal(hex);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getLocalizedMessage());
                System.out.println("Try again...");
            }

        }
        System.out.println("The decimal value for hex number "
                + hex + " is " + decimal);
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        if (!Kit.isHexadecimal(hex)) {
            throw new HexFormatException("Not a hexadecimal number.");
        }
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}

class HexFormatException extends NumberFormatException {

    HexFormatException(String s) {
        super(s);
    }
}
import java.util.Scanner;

class NumberSystemConverter {


    public static int toDecimal(String number, int base) {

        return Integer.parseInt(number, base);
    }


    public static String fromDecimal(int number, int base) {

        return Integer.toString(number, base).toUpperCase();

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char option;

        do {

            System.out.println("Select an option Below: ");

            System.out.println("A. Convert from any system to the decimal system");

            System.out.println("B. Convert from decimal system to another system");

            System.out.println("C. Summing up numbers from different systems");

            System.out.println("D. Subtracting numbers from different systems");

            System.out.println("E. Multiplying numbers from different systems");

            System.out.println("F. Dividing numbers from different systems");

            System.out.println("W. Exit the program");

            option = scanner.next().toUpperCase().charAt(0);

            switch (option) {

                case 'A':

                    System.out.println("Enter the number:");

                    String number = scanner.next();

                    System.out.println("Enter the base of the number system ( 2 for binary, 8 for octal, 16 for hexadecimal):");

                    int base = scanner.nextInt();

                    int decimal = toDecimal(number, base);

                    System.out.println("Decimal representation:" + decimal);

                    break;

                case 'B':

                    System.out.println("Enter the decimal number:");

                    int decimalNumber = scanner.nextInt();

                    System.out.println("Enter the base to convert to ( 2 for binary, 8 for octal, 16 for hexadecimal):");

                    int targetBase = scanner.nextInt();

                    String convertedNumber = fromDecimal(decimalNumber, targetBase);

                    System.out.println("Converted number: " + convertedNumber);

                    break;

                case 'C':

                    System.out.println("Enter the first number:");

                    String num1 = scanner.next();

                    System.out.println("Enter the base of the first number system: ");

                    int base1 = scanner.nextInt();

                    System.out.println("Enter the second number: ");

                    String num2 = scanner.next();

                    System.out.println("Enter the base of the second number system: ");

                    int base2 = scanner.nextInt();

                    int sum = toDecimal(num1, base1) + toDecimal(num2, base2);

                    System.out.println("Sum: " + sum);

                    break;

                case 'D':

                    System.out.println("Enter the first number: ");

                    String minuend = scanner.next();

                    System.out.println("Enter the base of the minuend: ");

                    int baseMinuend = scanner.nextInt();

                    System.out.println("Enter the second number: ");

                    String subtrahend = scanner.next();

                    System.out.println("Enter the base of the subtrahend: ");

                    int baseSubtrahend = scanner.nextInt();

                    int difference = toDecimal(minuend, baseMinuend) - toDecimal(subtrahend, baseSubtrahend);

                    System.out.println("Difference: " + difference);

                    break;

                case 'E':

                    System.out.println("Enter the first number: ");

                    int factor1 = scanner.nextInt();

                    System.out.println("Enter the second number: ");

                    int factor2 = scanner.nextInt();

                    int product = factor1 * factor2;

                    System.out.println("Product: " + product);

                    break;

                case 'F':

                    System.out.println("Enter the dividend: ");

                    String dividend = scanner.next();

                    System.out.println("Enter the base of the dividend number system: ");

                    int baseDividend = scanner.nextInt();

                    System.out.println("Enter the divisor: ");

                    String divisor = scanner.next();

                    System.out.println("Enter the base of the divisor number system: ");

                    int baseDivisor = scanner.nextInt();

                    int quotient = toDecimal(dividend, baseDividend) / toDecimal(divisor, baseDivisor);

                    System.out.println("Quotient: " + quotient);

                    break;

                case 'W':

                    System.out.println("Thank you, Goodbye :)");

                    break;

                default:

                    System.out.println("Invalid option. Please choose from the Menu.");

                    break;
            }

        } while (option != 'W');

        scanner.close();
    }
}

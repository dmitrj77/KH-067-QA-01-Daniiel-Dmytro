import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comm = "exit";
        String command = "";
        while (!command.equals(comm)) {
            String operator = "";
            double result;
            System.out.println("-----Calculator----");
            double first = setDoubleNumber();

            System.out.println("--Input operation--");
            System.out.println("For addition:     +");
            System.out.println("For subtraction:  -");
            System.out.println("For division:     /");
            System.out.println("For multiply:     *");
            System.out.println("For remainder:    %");
            boolean validation = false;
            try {
                operator = sc.next();
                if (validation == getOperator(operator)) throw new NotSupportedOperationException();
            } catch (NotSupportedOperationException e) {
                System.out.println("Exception:" + e);
                operator = sc.next();
            }
            switch (operator) {
                case "+": {
                    double second = setDoubleNumber();
                    result = first + second;
                    System.out.println(first + operator + second + "=" + result);
                    break;
                }
                case "-": {
                    double second = setDoubleNumber();
                    result = first - second;
                    System.out.println(first + operator + second + "=" + result);
                    break;
                }
                case "*": {
                    double second = setDoubleNumber();
                    result = first * second;
                    System.out.println(first + operator + second + "=" + result);
                    break;
                }
                case "/": {
                    double second = setDoubleNumber();
                    if (second != 0) {
                        result = first / second;
                        System.out.println(first + operator + second + "=" + result);
                        break;
                    } else {
                        System.out.println("Error: divide by 0 is not allowed!");
                    }
                    break;
                }
                case "%": {
                    double second = setDoubleNumber();
                    result = first % second;
                    System.out.println(first + operator + second + "=" + result);
                    break;
                }
            }
            System.out.println("Enter " + " exit:" + " to close!");
            command = sc.nextLine();
            command = command.toLowerCase();
        }
    }

    public static double setDoubleNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input number");
        double number = 0;
        boolean validation = false;
        do {
            try {
                validation = sc.hasNextDouble();
                number = sc.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println(e);
                sc.nextLine();
            }
        } while (!validation);
        return number;
    }

    public static boolean getOperator(String operator) {
        Scanner sc = new Scanner(System.in);
        //operator = sc.next();
        List<String> chars = Arrays.asList("+", "-", "*", "/", "%");
        boolean validation = false;

        do {
            if (validation = chars.contains(operator)) {
                operator = operator;
            } else {
                break;
            }
        } while (!validation);
        return validation;
    }

    static class NotSupportedOperationException extends Exception {

        public String toString() {
            return "NotSupportedOperationException";
        }
    }
}
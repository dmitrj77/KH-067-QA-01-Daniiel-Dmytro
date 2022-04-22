import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comm = "exit";
        String command = "";
        while (!command.equals(comm)) {

            String operator;
            double result;
            System.out.println("Please input first number");
            double first = getCorrectNumb();

            System.out.println("Please input operation");
            operator = sc.next();
            String plus = "+";
            String mines = "-";
            String divide = "/";
            String multiply = "*";
            String percent = "%";

            if (operator.equals(plus)) {
                System.out.println("Please input second number");
                double second = getCorrectNumb();
                result = first + second;
                System.out.println(first + operator + second + "=" + result);
            } else if (operator.equals(mines)) {
                System.out.println("Please input second number");
                double second = getCorrectNumb();
                result = first - second;
                System.out.println(first + operator + second + "=" + result);
            } else if (operator.equals(multiply)) {
                System.out.println("Please input second number");
                double second = getCorrectNumb();
                result = first * second;
                System.out.println(first + operator + second + "=" + result);
            } else if (operator.equals(divide)) {
                System.out.println("Please input second number");
                double second = getCorrectNumb();
                if (second != 0) {
                    result = first / second;
                    System.out.println(first + operator + second + "=" + result);
                } else {
                    System.out.println("Error: divide by 0 is not allowed!");
                }
            } else if (operator.equals(percent)) {
                System.out.println("Please input second number");
                double second = getCorrectNumb();
                result = first % second;
                System.out.println(first + operator + second + "=" + result);
            } else {
                System.out.println("Please input correct operator");
            }
            System.out.println("Enter " + " exit:" + " to close!");
            sc.nextLine();
            command = sc.nextLine().toLowerCase();
        }
    }

    public static double getCorrectNumb() {
        Scanner sc = new Scanner(System.in);
        double first = 0;
        boolean validation;
        do {
            validation = sc.hasNextDouble();
            if (!validation) {
                System.out.println("Number Pls!");
                sc.nextLine();
            } else {
                first = sc.nextDouble();
            }
        }
        while (!validation);
        return first;
    }
}

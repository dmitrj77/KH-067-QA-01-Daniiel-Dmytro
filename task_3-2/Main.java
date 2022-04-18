import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String comm = "exit";
            String command = "";
            while (!command.equals(comm)) {

                String operator;
                double result;
                System.out.println("-----Calculator----");
                System.out.println(" Input first number");
                double first = CorrectNumb();

                System.out.println("--Input operation--");
                System.out.println("For addition:     +");
                System.out.println("For subtraction:  -");
                System.out.println("For division:     /");
                System.out.println("For multiply:     *");
                System.out.println("For remainder:    %");
                operator = sc.next();

                switch (operator){
                    case "+": {
                        System.out.println(" Input first number");
                        double second = CorrectNumb();
                        result = first + second;
                        System.out.println(first + operator + second + "=" + result);
                        break;
                    }
                    case "-":{
                        System.out.println("Input second number");
                        double second = CorrectNumb();
                        result = first - second;
                        System.out.println(first + operator + second + "=" + result);
                        break;
                    }
                    case "*":{
                        System.out.println("Input second number");
                        double second = CorrectNumb();
                        result = first * second;
                        System.out.println(first + operator + second + "=" + result);
                        break;
                    }
                    case "/":{
                        System.out.println("Input second number");
                        double second = CorrectNumb();
                        if (second != 0) {
                            result = first / second;
                            System.out.println(first + operator + second + "=" + result);
                            break;
                        } else {
                            System.out.println("Error: divide by 0 is not allowed!");
                        }
                        break;
                    }
                    case "%":{
                        System.out.println("Input second number");
                        double second = CorrectNumb();
                        result = first % second;
                        System.out.println(first + operator + second + "=" + result);
                        break;
                    }
                    default:{
                        System.out.println("Please input correct operator");
                    }
                }
                System.out.println("Enter " + " exit:" + " to close!");
                sc.nextLine();
                command = sc.nextLine();
                command = command.toLowerCase();
            }
        }

        public static double CorrectNumb() {
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



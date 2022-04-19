import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comm = "exit";
        String command = "";
        while (!command.equals(comm)) {


            System.out.println("Please input 3 words");
            String text = StringNotEmpty();
            String[] words = text.split(",");

            System.out.println("Please choice what you want ");
            System.out.println("Found maximum length: [1]");
            System.out.println("Found start char:     [2]");
            System.out.println("Found end char:       [3]");
            System.out.println("Found contains char:  [4]");
            System.out.println("For exit:             [0]");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Please enter [length] of word");
                    int i = CorrectNumb();
                    for (String word : words) {
                        if (word.length() <= i) {
                            System.out.printf("Word [length] <= " + i + ": " + word + "\n");
                        } else {
                            System.out.printf("Word [length] <= " + i + ": not found \n");
                        }
                    }
                }
                break;

                case "2": {
                    System.out.println("Please enter [start] chars");
                    String star = sc.nextLine();

                    for (String word : words) {
                        if (word.startsWith(star)) {
                            System.out.printf("Word [start] on char: " + star + " is " + word + "\n");
                        } else {
                            System.out.printf("Word [start] on: " + star + " is not found \n");
                        }
                    }
                }
                break;

                case "3": {
                    System.out.println("Please enter [end] chars");
                    String star = sc.nextLine();

                    for (String word : words) {
                        if (word.endsWith(star)) {
                            System.out.printf("Word [ends] on char: " + star + " is " + word + "\n");
                        } else {
                            System.out.printf("Word [ends] on: " + star + " is not found\n");
                        }
                    }
                }
                break;

                case "4": {
                    System.out.println("Please enter [contains] chars");
                    String star = sc.nextLine();
                    for (String word : words) {
                        if (word.contains(star)) {
                            System.out.printf("Word [contains] char: " + star + " is " + word + "\n");
                        } else {
                            System.out.printf("Word [contains] char: " + star + " is not found\n");
                        }
                    }
                }
                break;

                case "0": {
                    command = "exit";
                }
                break;

                default: {
                    System.out.println("Please do choice\n");
                }

            }
        }

    }

    public static int CorrectNumb() {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        boolean validation;
        do {
            validation = sc.hasNextInt();
            if (!validation) {
                System.out.println("Number Pls!");
                sc.nextLine();
            } else {
                first = sc.nextInt();
            }
        }
        while (!validation);
        return first;
    }

    private static String StringNotEmpty() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean validation;
        do {
            validation = name.isEmpty();
            if (validation) {
                System.out.println("String cannot be Empty.Please string!\n");
                name = sc.nextLine();
            } else {

                break;
            }
        }
        while (validation);
        return name;
    }
}

import javax.xml.bind.Element;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comm = "exit";
        String command = "";
        while (!command.equals(comm)) {


            System.out.println("\n Please enter a few words");
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
                    int index = 0;
                    String[] temps = new String[10];
                    for (int ind = 0; ind < words.length; ) {
                        for (String word : words) {
                            ind++;
                            if (word.length() <= i) {
                                temps[index] = word;
                                index++;
                            }
                        }
                    }
                    getFind(temps, i);
                }
                break;

                case "2": {
                    System.out.println("Please enter [start] chars");
                    String star = sc.nextLine();
                    int index = 0;
                    String[] temps = new String[10];
                    for (int ind = 0; ind < words.length; ) {
                        for (String word : words) {
                            ind++;
                            if (word.startsWith(star)) {
                                temps[index] = word;
                                index++;
                            }
                        }
                    }
                    getFind(temps, star);
                }
                break;

                case "3": {
                    System.out.println("Please enter [end] chars");
                    String star = sc.nextLine();
                    int index = 0;
                    String[] temps = new String[10];
                    for (int ind = 0; ind < words.length; ) {
                        for (String word : words) {
                            ind++;
                            if (word.endsWith(star)) {
                                temps[index] = word;
                                index++;
                            }
                        }
                    }
                    getFind(temps, star);
                }
                break;

                case "4": {
                    System.out.println("Please enter [contains] chars");
                    String star = sc.nextLine();
                    int index = 0;
                    String[] temps = new String[10];
                    for (int ind = 0; ind < words.length; ) {
                        for (String word : words) {
                            ind++;
                            if (word.contains(star)) {
                                temps[index] = word;
                                index++;
                            }
                        }
                    }
                    getFind(temps, star);
                }
                break;

                case "0": {
                    command = "exit";
                }
                break;

                default: {
                    System.out.println("Please make a choice\n");
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

    private static void getFind(String[] temps, int i) {
        if (temps[0]!= null) {
            for (String temp : temps) {
                if (temp != null) {
                    System.out.printf("\n Word [length] <= [" + i + "]: " + temp);
                }
            }
        } else {
            System.out.printf("\n Word [length] <= [" + i + "] is not found");
        }
    }
    private static void getFind(String[] temps,String star) {
        if (temps[0]!= null) {
            for (String temp : temps) {
                if (temp != null) {
                    System.out.printf("\n Found the word with [" + star + "]: " + temp);
                }
            }
        } else {
            System.out.printf("\n Word with [" + star + "] is not found");
        }
    }
}

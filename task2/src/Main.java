
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = sc.nextLine();
        System.out.println("What is your Lastname?");
        String lastname = sc.nextLine();
        System.out.println("Where are you live, " + name + "?");
        String address = sc.nextLine();
        System.out.println("Your Name:" + name + ", Lastname:" + lastname + ", your Address:" + address);
    }
}


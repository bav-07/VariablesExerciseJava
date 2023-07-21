import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Task 1

//        String firstName;
//        String lastName;
//
//        firstName = "Bav";
//        lastName = "Nagarajah";
//
//        String name = firstName + " " + lastName;
//        System.out.println(name);

        // Task 2
//        int num1;
//        int num2;
//        num1 = 7;
//        num2 = 25;
//        System.out.println(num1 + num2);
//        System.out.println(num2 / num1);
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);

        // Task 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("What is your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Greetings, " + firstName + " " + lastName);

        System.out.println("Give 2 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        scanner.close();

    }

}

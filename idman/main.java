package idman;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************");
        String idmans = "1. Burpee\n"
                + "2. Pushup\n"
                + "3. Situp\n"
                + "4. Squat";
        System.out.println(idmans);
        System.out.println("***************************************");
        System.out.print("enter the number of burpee you want to make: ");
        int burpee = scanner.nextInt();
        System.out.print("enter the number of pushup you want to make: ");
        int pushup = scanner.nextInt();
        System.out.print("enter the number of situp you want to make: ");
        int situp = scanner.nextInt();
        System.out.print("enter the number of squat you want to make: ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        idman idman = new idman(burpee, pushup, situp, squat);

        while (idman.finishingIdman() == false) {
            System.out.print("enter to kind of move: ");
            String kind = scanner.nextLine();
            System.out.print("enter number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            idman.makeMove(kind, number);
        }
        System.out.println("congratulations! you completed your idman.");
    }
}

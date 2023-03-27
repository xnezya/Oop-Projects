package program;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to workers program");
        String process = "process...\n"
                + "1. programmer process\n"
                + "2. managers process\n"
                + "q for quit\n";
        System.out.println("***********************");
        System.out.println(process);
        System.out.println("***********************");

        while (true) {
            System.out.println("select to process");
            String proces = scanner.nextLine();
            if (proces.equals("q")) {
                System.out.println("exiting program..");
                break;
            } else if (proces.equals("1")) {
                programmer programmer = new programmer("beyza", "yılmazer", 12345, "pyhton, java");
                String programmerProcess = "1. format\n"
                        + "2. show information\n"
                        + "q for quit\n";
                System.out.println(programmerProcess);
                while (true) {
                    System.out.println("select options for programmers: ");
                    String processProg = scanner.nextLine();
                    if (processProg.equals("q")) {
                        System.out.println("exitin from programmers program..");
                        break;
                    } else if (processProg.equals("1")) {
                        System.out.println("operating systems: : ");
                        String language = scanner.nextLine();
                        programmer.format(language);
                    } else if (processProg.equals("2")) {
                        programmer.showInfo();
                    } else {
                        System.out.println("invalid process..");
                    }
                }
            } else if (proces.equals("2")) {
                managers managers = new managers("halim", "ceylan", 12346, 3);
                String managersProcess = "1. make a raise\n"
                        + "2. show information\n"
                        + "q for quit\n";
                System.out.println(managersProcess);
                while (true) {
                    System.out.println("select option for managers: ");
                    String processMana = scanner.nextLine();
                    if (processMana.equals("q")) {
                        System.out.println("exiting from managers program..");
                        break;
                    } else if (processMana.equals("1")) {
                        System.out.println("amount of raise:");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        managers.makeRaise(amount);
                    } else if (processMana.equals("2")) {
                        managers.showInfo();

                    } else {
                        System.out.println("invalid proces..");
                    }
                }

            } else {
                System.out.println("invalid process..");
            }
        }
    }
}

import java.util.Scanner;

public class atm {
    public void access(count count) {
        login login = new login();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("**************************************");
            System.out.println("        WELCOME TO OUR BANK");
            System.out.println("**************************************");
            System.out.println("           USER LOGIN");
            System.out.println("**************************************");

            int right_of_entry = 3;
            while (true) {
                if (login.login(count)) {
                    System.out.println("login succesfull");
                    break;
                } else if (!login.login(count)) {
                    right_of_entry -= 1;
                    System.out.println("you have " + right_of_entry + " entry ");
                }
                if (right_of_entry == 0) {
                    System.out.println("you dont have any entry");
                    return;
                }
                System.out.println("***************************************");
                String process = "1. view balance\n"
                        + "2. depoist money\n"
                        + "withdraw money\n"
                        + "for to quit press 'q'";
                System.out.println(process);
                System.out.println("***************************************");

                while (true) { // Second while loop
                    System.out.print("select to process: ");
                    if (!scanner.hasNextLine()) {
                        break;
                    }
                    String proces = scanner.nextLine();
                    if (proces.equals("q")) {
                        break;
                    } else if (proces.equals("1")) {
                        System.out.println("your balance: " + count.getBalance());
                    } else if (proces.equals("2")) {
                        System.out.print("enter to your want to amount: ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        count.withraw(amount);
                    } else if (proces.equals("3")) {
                        System.out.print("enter to your want to amount: ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        count.depositMoney(amount);
                    } else {
                        System.out.println("invalid process");
                    }
                }
            }
        }
    }
}
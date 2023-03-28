import java.util.Scanner;

public class login {
    public boolean login(count count) {
        try (Scanner scanner = new Scanner(System.in)) {
            String userName;
            String password;

            System.out.print("enter user name:");
            if (scanner.hasNextLine()) {
                userName = scanner.nextLine();
            } else {
                return false;
            }

            System.out.print("enter password:");
            if (scanner.hasNextLine()) {
                password = scanner.nextLine();
            } else {
                return false;
            }

            if (count.getUserName().equals(userName) && count.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
    }
}

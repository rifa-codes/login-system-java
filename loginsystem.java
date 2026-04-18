import java.util.Scanner;

class UserData {
    String username;
    String password;

    UserData(String u, String p) {
        username = u;
        password = p;
    }

    boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}

public class loginsystem {
    public static void main(String[] args) {

        Scanner r= new Scanner(System.in);

        UserData user = null; // correct type
        int choice;

        do {
            System.out.println("\n1. Register  2. Login  3. Exit");
            System.out.print("Enter choice: ");
            choice = r.nextInt();
            r.nextLine();

            if (choice == 1) {
                System.out.print("Enter username: ");
                String u = r.nextLine();

                System.out.print("Enter password: ");
                String p = r.nextLine();

                user = new UserData(u, p); // correct class name
                System.out.println("Registered!");
            }

            else if (choice == 2) {
                if (user == null) {
                    System.out.println("No user registered!");
                    continue;
                }

                System.out.print("Enter username: ");
                String u = r.nextLine();

                System.out.print("Enter password: ");
                String p = r.nextLine();

                if (user.login(u, p)) {
                    System.out.println("Login Successful!");
                } else {
                    System.out.println("Invalid!");
                }
            }

        } while (choice != 3);

        r.close();
    }
}
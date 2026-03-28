import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IssueManager manager = new IssueManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Issue");
            System.out.println("2. View Issues");
            System.out.println("3. Resolve Issue");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter issue: ");
                String title = sc.nextLine();

                System.out.print("Enter location: ");
                String loc = sc.nextLine();

                manager.addIssue(title, loc);

            } else if (choice == 2) {
                manager.viewIssues();

            } else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                manager.resolveIssue(id);

            } else {
                break;
            }
        }
    }
}

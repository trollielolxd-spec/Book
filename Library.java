package Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Lady and the Tramp"));
        books.add(new Book("Doctor Suess"));
        books.add(new Book("The Great Gatsby"));
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Available Books");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = input.nextInt();
            input.nextLine(); // clear input

            if (choice == 1) {
                System.out.print("Enter title: ");
                String title = input.nextLine();
                books.add(new Book(title));
            }

            else if (choice == 2) {
                System.out.print("Enter title to borrow: ");
                String title = input.nextLine();

                for (Book b : books) {
                    if (b.getTitle().equalsIgnoreCase(title) && !b.isBorrowed()) {
                        b.borrowedBook();
                        System.out.println("Borrowed!");
                        break;
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Enter title to return: ");
                String title = input.nextLine();

                for (Book b : books) {
                    if (b.getTitle().equalsIgnoreCase(title)) {
                        b.returnBook();
                        System.out.println("Returned!");
                        break;
                    }
                }
            }
            else if (choice == 4) {
                System.out.println("Available books:");
                for (Book b : books) {
                    if (!b.isBorrowed()) {
                        System.out.println(b.getTitle());
                    }
                }
            }

        } while (choice != 5);

        System.out.println("Goodbye!");
    }
}
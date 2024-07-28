import java.util.Scanner;

public class LibraryCatalogApp {
    public static void main(String[] args) {
        Catalog<LibraryItem> catalog = new Catalog<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Library Catalog:");
            System.out.println("1. Add a new library item");
            System.out.println("2. Remove a library item");
            System.out.println("3. View all items");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter item ID: ");
                    String itemID = scanner.nextLine();
                    LibraryItem newItem = new LibraryItem(title, author, itemID);
                    catalog.addItem(newItem);
                    System.out.println("Item added successfully.");
                    break;
                case 2:
                    System.out.print("Enter item ID to remove: ");
                    String idToRemove = scanner.nextLine();
                    try {
                        catalog.removeItem(idToRemove);
                        System.out.println("Item removed successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current Catalog:");
                    for (LibraryItem item : catalog.getAllItems()) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

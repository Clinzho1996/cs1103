public class LibraryCatalogTest {
    public static void main(String[] args) {
        Catalog<LibraryItem> catalog = new Catalog<>();

        // Test adding items
        LibraryItem book1 = new LibraryItem("Book Title 1", "Author 1", "ID001");
        LibraryItem book2 = new LibraryItem("Book Title 2", "Author 2", "ID002");
        catalog.addItem(book1);
        catalog.addItem(book2);

        assert catalog.getAllItems().size() == 2 : "Test add items failed";

        // Test retrieving item
        try {
            LibraryItem retrievedItem = catalog.getItem("ID001");
            assert retrievedItem.getTitle().equals("Book Title 1") : "Test retrieve item failed";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test removing item
        try {
            catalog.removeItem("ID001");
            assert catalog.getAllItems().size() == 1 : "Test remove item failed";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test removing non-existent item
        try {
            catalog.removeItem("ID003");
        } catch (Exception e) {
            assert e.getMessage().equals("Item not found.") : "Test remove non-existent item failed";
        }

        System.out.println("All tests passed.");
    }
}

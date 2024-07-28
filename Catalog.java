import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends LibraryItem> {
    private List<T> items;

    public Catalog() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(String itemID) throws Exception {
        T itemToRemove = null;
        for (T item : items) {
            if (item.getItemID().equals(itemID)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            items.remove(itemToRemove);
        } else {
            throw new Exception("Item not found.");
        }
    }

    public T getItem(String itemID) throws Exception {
        for (T item : items) {
            if (item.getItemID().equals(itemID)) {
                return item;
            }
        }
        throw new Exception("Item not found.");
    }

    public List<T> getAllItems() {
        return items;
    }
}

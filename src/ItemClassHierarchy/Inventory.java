package ItemClassHierarchy;

import java.util.*;

public class Inventory <T extends Item>{
    private Map<String, T> items = new HashMap<>();

    // Add item
    public void addItem(T item) {
        if (items.containsKey(item.getId())) {
            throw new IllegalArgumentException("Duplicate ID not allowed");
        }
        items.put(item.getId(), item);
    }

    // Get item
    public T getItem(String id) {
        return items.get(id);
    }

    // Remove item
    public void removeItem(String id) {
        items.remove(id);
    }

    public Collection<T> getAllItems(){
        return items.values();
    }
}

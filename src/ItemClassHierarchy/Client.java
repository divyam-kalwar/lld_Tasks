package ItemClassHierarchy;

import java.util.*;

public class Client {
     public static void main(String[] args) {

//         List<Item> items = new ArrayList<>();
//
//         items.add(new Electronics("E1", "Laptop", 80000, 5, 2));
//         items.add(new Clothing("C1", "T-Shirt", 500, 20, "M"));
//         items.add(new Author("B1", "Java", 700, 10, "James"));
//         items.add(new Electronics("E2", "Mobile", 30000, 10, 1));
//         // Sort
//         Collections.sort(items);
//         // Print
//         for (Item item : items) {
//             System.out.println(item);
//         }
         RecentlyViewedItems recent = new RecentlyViewedItems();

         Item i1 = new Electronics("E1", "Laptop", 80000, 5, 2);
         Item i2 = new Clothing("C1", "T-Shirt", 500, 20, "M");

         recent.addRecentlyViewedItem(i1);
         recent.addRecentlyViewedItem(i2);

         System.out.println(recent.getRecentItems());
     }
}

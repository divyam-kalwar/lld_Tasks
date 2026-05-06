package ItemClassHierarchy;

import java.util.LinkedList;

public class RecentlyViewedItems {
    LinkedList<Item> recentlyViewedItems = new LinkedList<>();
    private static final int LIMIT = 10;

    public void addRecentlyViewedItem(Item item) {
        recentlyViewedItems.remove(item);

        recentlyViewedItems.addFirst(item);

        if(recentlyViewedItems.size() > LIMIT) {
            recentlyViewedItems.removeLast();
        }
    }

    public LinkedList<Item> getRecentItems() {
        return recentlyViewedItems;
    }
}
